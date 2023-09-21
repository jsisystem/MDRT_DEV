package egovframework.mdrt.login.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.board.BoardAlarmService;
import egovframework.mdrt.login.UserLoginService;
import egovframework.mdrt.project.AnlyModiService;
import egovframework.mdrt.project.ReqDataService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.BoardAlarmVo;
import egovframework.mdrt.vo.ReqDataVo;
import egovframework.mdrt.vo.UserVo;

/*
 * 사용자 로그인 담당 컨트롤러
 * 
 * */

@RestController
@RequestMapping(value = "/data/userLogin")
public class UserLoginController {

	// 사용자 조회
	@Resource(name = "UserLoginService")
	protected UserLoginService userLoginService;

	// 권한 조회
	@Resource(name = "UserAuthoService")
	protected UserAuthoService userAuthoService;
	
	//보드 알람 조회
	@Resource(name = "boardAlarmService")
	protected BoardAlarmService boardAlarmService;
	
	//분석자료 요청
	@Resource(name = "ReqDataService")
	protected ReqDataService reqDataService;
	
	//분석자료 관리
	@Resource(name = "AnlyModiService")
	protected AnlyModiService anlyModiService;
	

	@RequestMapping(value = "/loginOne.json")
	// @PostMapping("/loginOne")
	public ModelAndView userLoginOne(HttpServletRequest request, HttpSession session, @RequestBody UserVo userSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			Map<String, String> userVo = userLoginService.getUserInfoOne(userSearch); // 사용자 조회
			
			// 사용자 확인 (if)
			if(userVo.get("usrId") == null && userVo.get("usrId").equals("")) {
				modelAndView.addObject("MSG", "로그인 실패");
				
			}else {
				modelAndView.addObject("MSG", "로그인 성공");
				AuthVo param = new AuthVo();
				param.setUsrId(userVo.get("usrId"));
				param.setCdGubun("AUTH");
				Map<String, String> authGubun =  userAuthoService.getAuthoGubun(param); //권한 조회 param : userid, Authgubun code
				List<Map>  AuthList =  userAuthoService.getAuthoList(userVo.get("usrId")); //권한 조회
				BoardAlarmVo boardAlarmVo = boardAlarmService.getBoardAlarmInfo(userVo.get("usrId")); //보드 알림 조회
				
				session.setAttribute("UsrId", param.getUsrId());
				session.setAttribute("UsrAuth", AuthList);
				
				
				
				Map<String,Integer> alarm = new HashMap<String,Integer>();
				alarm.put("UserNotiCnt", boardAlarmVo.getNotiCnt()-boardAlarmVo.getUserNotiCnt());
				alarm.put("UserQuesCnt", boardAlarmVo.getQuesCnt()-boardAlarmVo.getUserQuesCnt());
				alarm.put("UserErroCnt", boardAlarmVo.getErroCnt()-boardAlarmVo.getUserErroCnt());
				
				ReqDataVo reqdata = new ReqDataVo();
				reqdata.setAprAuth(authGubun.get("cdId"));
				//TODO 권한 if    상위관리자인경우  지역이 2개 이상인경우 
				if(authGubun.get("cdId").equals("SMNG")){
					//분석자료 요청 SMNG 권한인경우 //테스트 필요
					Map<String, Integer> reqSMNGcount = reqDataService.getApprReqCnt(reqdata);
					alarm.put("ReqDataCnt",Integer.parseInt(String.valueOf(reqSMNGcount.get("cnt"))));   //DB에서 조회된 INT 는 NUMBER 로 인식 하여  스트링 변환후 인트 변환 필요
					
					//분석등록 요청 SMNG 권한인경우
					Map<String, Integer> reqAnlySMNGcount = anlyModiService.getApprAnlyReqCnt(reqdata);
					alarm.put("AnlyCnt", Integer.parseInt(String.valueOf(reqAnlySMNGcount.get("cnt"))));
					
					
				}else if(authGubun.get("cdId").equals("MNG")){ 
					//분석자료 요청 MNG 권한인경우 //테스트 필요
					param.setUsrId(userVo.get("usrId"));
					param.setCdGubun("AREA");
					Map<String, String> userAreaAuth =  userAuthoService.getAuthoGubun(param); //권한 조회 param : userid, Authgubun code
					reqdata.setAplArea(userAreaAuth.get("cdId"));  //MNG 인경우 지역관리 권한이 한개임.
					
					Map<String, Integer> reqMNGcount = reqDataService.getApprReqCnt(reqdata);
					alarm.put("ReqDataCnt", Integer.parseInt(String.valueOf(reqMNGcount.get("cnt"))));
					//중간관리자인경우 지역이 1개이면서 자기 할당 지역인경우
					
					// 분석등록 요청 MNG 권한인경우					
					Map<String, Integer> reqAnlycount = anlyModiService.getApprAnlyReqCnt(reqdata);
					alarm.put("AnlyCnt", Integer.parseInt(String.valueOf(reqAnlycount.get("cnt"))));
					
					//TODO 원시자료 요청 MNG 권한인경우
					
				}else {
					System.out.println("그외 사용자");
				}

				
				modelAndView.addObject("loginInfo", userVo);
				modelAndView.addObject("AuthoList", AuthList);
				modelAndView.addObject("Alarm", alarm);
				
			}


			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
			modelAndView.addObject("MSG", "로그인 실패");
			modelAndView.setViewName("jsonView");
		}

		return modelAndView;
	}
}
