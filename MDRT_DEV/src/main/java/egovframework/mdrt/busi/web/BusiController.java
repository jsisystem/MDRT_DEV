package egovframework.mdrt.busi.web;

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

import egovframework.mdrt.busi.BusiService;
import egovframework.mdrt.code.CodeService;
import egovframework.mdrt.vo.BusiVo;
import egovframework.mdrt.vo.CodeVo;

/*
 * 업체목록 담당 컨트롤러. 
 * */
@RestController
@RequestMapping(value = "/data/busi")
public class BusiController {

	// 업체 목록 서비스
	@Resource(name = "BusiService")
	protected BusiService busiService;

	// 코드 서비스
	@Resource(name = "CodeService")
	protected CodeService codeService;

	@RequestMapping(value = "/busiList.json")
	public ModelAndView busiList(HttpServletRequest request, HttpSession session, @RequestBody BusiVo busiSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			List<Map> resultSummary = busiService.getBusiList(busiSearch);
			int totalCount = busiService.getBusiListCount(busiSearch);

			modelAndView.addObject("resultList", resultSummary);
			modelAndView.addObject("totalCount", totalCount);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	// 업체 정보 삽입
	@RequestMapping(value = "/busiInsert.json")
	public ModelAndView busiInsert(HttpServletRequest request, HttpSession session, @RequestBody BusiVo busiVo)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
			int count = busiService.getBusiListCount(busiVo);
			busiVo.setMdrtCpId(busiVo.getMdrtCpArea()+count);
			busiVo.setCdId(busiVo.getMdrtCpId());
			busiVo.setCdGubun("BUSI");
			
			CodeVo codeVo = new CodeVo();
			codeVo.setCdId(busiVo.getMdrtCpId());
			codeVo.setCdGubun("BUSI");
			codeVo.setParentCd("BUSI");
			codeVo.setCdNm(busiVo.getMdrtCpNm());
			codeVo.setCdDt("업체 정보");
			//TODO 세션에서 아이디 가져와서 INS_USR 등록
			codeVo.setInsUsr("system");
			
			codeService.codeInsert(codeVo);
			
			//TODO LON,LAT 합쳐서 POINT 만들고 GEOM 입력
			busiService.busiInsert(busiVo);


			modelAndView.addObject("resultMsg", "1");
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
			modelAndView.addObject("resultMsg", "0");
			modelAndView.setViewName("jsonView");
		}
		return modelAndView;
	}
	
	
	//업체 목록 조회(pram:지역)

	@RequestMapping(value = "/busiListArea.json")
	public ModelAndView busiListArea(HttpServletRequest request, HttpSession session, @RequestBody BusiVo busiSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			List<Map> resultSummary = busiService.getBusiListArea(busiSearch);

			modelAndView.addObject("resultList", resultSummary);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}
}
