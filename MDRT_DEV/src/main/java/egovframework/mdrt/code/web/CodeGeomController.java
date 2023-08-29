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

import egovframework.mdrt.code.CodeGeomService;
import egovframework.mdrt.code.CodeService;
import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.GeomVo;

/*
 * 코드 지역 공간데이터를 담당 컨트롤러. 
 * */
@RestController
@RequestMapping(value = "/data/code")
public class CodeGeomController {

	// 코드 geom 전체 조회
	@Resource(name = "CodeGeomService")
	protected CodeGeomService codeGeomService;

	@RequestMapping(value = "/codeGeomList.json")
	public ModelAndView CodeGeomList(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			List<GeomVo> resultSummary = codeGeomService.getCodeGeomList(codeSearch);

			modelAndView.addObject("resultList", resultSummary);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}

	@RequestMapping(value = "/codeGeomOne.json")
	public ModelAndView CodeGeomOne(HttpServletRequest request, HttpSession session, @RequestBody CodeVo codeSearch)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			GeomVo geomData = codeGeomService.getCodeGeomOne(codeSearch);

			modelAndView.addObject("codeGeom", geomData);
			modelAndView.setViewName("jsonView");

		} catch (Exception e) {
			System.out.println(e);
		}

		return modelAndView;
	}
	

}
