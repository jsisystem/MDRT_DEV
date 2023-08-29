package egovframework.mdrt.code.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.code.CodeService;
import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.GeomVo;

/*
 * 코드 테이블을 담당 컨트롤러. 
 * */
@RestController
@RequestMapping(value = "/data/code")
public class CodeController {

	// 코드 서비스
	@Resource(name = "CodeService")
	protected CodeService codeService;

	// 코드 전체 목록을 불러옴
	@RequestMapping(value = "/codeList.json")
	public ModelAndView codeList(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			List<Map> resultSummary = codeService.getCodeList();

			modelAndView.addObject("resultList", resultSummary);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	// 코드 조건 조회 (상위코드 별)
	@RequestMapping(value = "/codeSelectList.json")
	public ModelAndView codeSelectList(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			List<Map> resultSummary = codeService.getCodeSelectList(codeSearch);

			modelAndView.addObject("resultList", resultSummary);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	// 코드 정보 수정
	@RequestMapping(value = "/codeUpdate.json")
	public ModelAndView codeUpdate(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeVo)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			/*CD_GUBUN = #cdGubun#
					,PARENT_CD = #parentCd# ,CD_NM = cdNm, CD_DT =cdDt
					WHERE
					CD_ID = #cdId#;*/
			int dbMSG = codeService.codeUpdate(codeVo);

			modelAndView.addObject("resultMsg", dbMSG);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	// 코드 정보 삭제
	@RequestMapping(value = "/codeDelete.json")
	public ModelAndView codeDelete(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeVo)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			int dbMSG = codeService.codeDelete(codeVo);

			modelAndView.addObject("resultMsg", dbMSG);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	// 코드 생성 TODO INS_USR 들어가는지 확인 필요
	@RequestMapping(value = "/codeInsert.json")
	public ModelAndView codeInsert(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeVo)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			//TODO 세션에서 아이디 받고 INS_USR 채워야함
			

			//modelAndView.addObject("resultMsg", dbMSG);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	/*
	 * public Map<String,GeomVo> getAreaGeom (){
	 * 
	 * Map<String,GeomVo> result = new HashMap<>(); System.out.println("지나갈");
	 * //확인완료
	 * 
	 * return result;
	 * 
	 * }
	 */
	
	@RequestMapping(value = "/getCodeKrNm.json")
	public ModelAndView getCodeKrNm(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			String codeKrNm = codeService.getCodeKrNm("SW");

			modelAndView.addObject("resultList", codeKrNm);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}
}
