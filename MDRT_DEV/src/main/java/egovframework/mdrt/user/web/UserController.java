package egovframework.mdrt.user.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.code.CodeService;
import egovframework.mdrt.login.UserLoginService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.UserApprVo;
import egovframework.mdrt.vo.UserAuthVo;
import egovframework.mdrt.vo.UserVo;

/*
 * 사용자 테이블을 조회함. 
 * */
@RestController
@RequestMapping(value = "/data/user")
public class UserController {

	// 사용자 조회
	@Resource(name = "UserService")
	protected UserService userService;

	@Resource(name = "UserAuthoService")
	protected UserAuthoService userAuthoService;

	// 코드 서비스
	@Resource(name = "CodeService")
	protected CodeService codeService;

	@RequestMapping(value = "/userList.json") // 사용자 전체 목록 조회시 사용될 함수.
	public ModelAndView userList(HttpServletRequest request, HttpSession session, @RequestBody UserVo userSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			// TODO 권한에 맞게 사용자 리스트를 요청
			List<Map> resultSummary = userService.getUserList(userSearch); // 사용자 조회
			int totalCount = userService.getUserListCount(userSearch); // 사용자 조회
			for (int index = 0; index < resultSummary.size(); index++) {

				// TODO 공통코드화 코드영문 > 한글설명 변경

				resultSummary.get(index).put("AUTH",
						codeService.getCodeKrNm(resultSummary.get(index).get("cdId").toString()));

			}

			modelAndView.addObject("resultList", resultSummary);
			modelAndView.addObject("totalCount", totalCount);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	@RequestMapping(value = "/userDetailOne.json") // 사용자 정보 조회시 사용될 함수
	public ModelAndView userDetailOne(HttpServletRequest request, HttpSession session, @RequestBody UserVo userSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			Map<String, String> userVoOne = userService.getUserOne(userSearch);

			modelAndView.addObject("userOne", userVoOne);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	// TODO 테스트 필요
	@RequestMapping(value = "/insrtUser.json") // 사용자 가입시(요청중) 사용될 함수
	public ModelAndView insrtUser(HttpServletRequest request, HttpSession session, @RequestBody UserAuthVo userInfo)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			userInfo.setUsrArea(codeService.getCodeKrNm(userInfo.getAreaCode()));
			userInfo.setUsrBl(codeService.getCodeKrNm(userInfo.getBusiCode()));
			
			// TODO param : ID,PW, 신청권한(지역,관리,업체)등 다받아야함. 지역이 다수인 경우 어떤 형태로 들어오는지 확인
			userService.insrtUser(userInfo);
			// System.out.println(dbMSG);
			// if(int 비교하여 성공했는지) 확인후 메시지 전달
			// 권한 관리 insert 확인
			AuthVo authVo = new AuthVo();

			// 공통 셋터
			authVo.setUsrId(userInfo.getUsrId());
			authVo.setInsUsr(userInfo.getInsUsr());

			authVo.setCdId(userInfo.getBusiCode());
			authVo.setCdGubun("BUSI");
			userAuthoService.insertAuthoOne(authVo);
			authVo.setCdId(userInfo.getAuthCode());
			authVo.setCdGubun("AUTH");
			userAuthoService.insertAuthoOne(authVo);
			String[] array = userInfo.getAreaCode().split(",");
			for (int i = 0; i < array.length; i++) {
				authVo.setCdId(array[i]);
				authVo.setCdGubun("AREA");
				userAuthoService.insertAuthoOne(authVo);

			}
			modelAndView.addObject("resultMsg", "1");
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
			modelAndView.addObject("resultMsg", "0");
			modelAndView.setViewName("jsonView");
		}

		return modelAndView;
	}

	@RequestMapping(value = "/updateUser.json") // 사용자 정보 수정 사용될 함수
	public ModelAndView updateUser(HttpServletRequest request, HttpSession session, @RequestBody UserVo userSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			// TODO 사용자 정보 수정 명확해지면 진행
			userService.updateUser(userSearch);
			// if(int 비교하여 성공했는지) 확인후 메시지 전달
			// modelAndView.addObject("resultMsg", dbMSG);

			modelAndView.addObject("resultMsg", "1");
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			modelAndView.addObject("resultMsg", "0");
			modelAndView.setViewName("jsonView");
		}

		return modelAndView;
	}

	@RequestMapping(value = "/updateAppr.json") // 계정 사용 승인,반려 시 실행 될 함수
	public ModelAndView updateAppr(HttpServletRequest request, HttpSession session, @RequestBody UserApprVo userApprVo)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			// param : 로그인 계정, 권한 부여계정, 승인/반려 여부
			List<Map> authoList = userAuthoService.getAuthoList(userApprVo.getUsrId());
			int dbMSG = 0;
			// TODO 권한 기능 사용가능한 권한을 보유했는가 확인 //get 0 처리필요
			if (authoList.get(0).get("cdId").equals("SMNG")) {
				// 승인시(Y) 사용자 테이블 업테이트
				UserVo targetUserVo = new UserVo();
				targetUserVo.setUsrId(userApprVo.getTargetId());
				targetUserVo.setUsrYn(userApprVo.getTargetYn());
				targetUserVo.setInsUsr(userApprVo.getUsrId());
				userService.updateAppr(targetUserVo);
				if (userApprVo.getTargetYn().equals("Y")) {

					/*
					 * AuthVo authUsr = new AuthVo(); authUsr.setInsUsr(userApprVo.getUsrId());
					 * authUsr.setUsrId(userApprVo.getTargetId());
					 * userAuthoService.updateAutho(authUsr);
					 */

				} else {
					// TODO 가입 반려인 경우 계정 잠금? 명확해야해
				}
			}

			modelAndView.addObject("resultMsg", "1");
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
			modelAndView.addObject("resultMsg", "0");
			modelAndView.setViewName("jsonView");
		}

		return modelAndView;
	}

	@RequestMapping(value = "/deleteUser.json") // 사용자 삭제시 사용될 함수.
	public ModelAndView deleteUser(HttpServletRequest request, HttpSession session, @RequestBody UserVo userSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			userService.updateUser(userSearch);
			// if(int 비교하여 성공했는지) 확인후 메시지 전달
			// modelAndView.addObject("resultMsg", dbMSG);

			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	@RequestMapping(value = "/getCheckId.json") // 계정 중복체크
	public ModelAndView getCheckId(HttpServletRequest request, HttpSession session, @RequestBody UserVo userId)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			String resultMSG = "";
			int idCheck = userService.getCheckId(userId);
			modelAndView.addObject("count", idCheck);

			modelAndView.setViewName("jsonView");
		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

}
