package egovframework.mdrt.project.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.login.UserLoginService;
import egovframework.mdrt.project.ReqDataService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.ReqDataVo;
import egovframework.mdrt.vo.UserVo;

/*
 * 분석자료 요청 리스트를 조회함.
 * */
@RestController
@RequestMapping(value="/data/project")
public class ReqDataController {
	
	
	//분석자료 요청 서비스
	@Resource(name = "ReqDataService")
	protected ReqDataService reqDataService;
	
		
	@RequestMapping(value = "/userReqData.json")
	public ModelAndView reqData(HttpServletRequest request,HttpSession session, @RequestBody UserVo userSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
		List<UserVo> resultSummary = reqDataService.getReqData(userSearch);           
		
		
		
		modelAndView.addObject("resultList", resultSummary);
		modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	@RequestMapping(value = "/reqDataInsert.json")
	public ModelAndView reqDataInsert(HttpServletRequest request,HttpSession session, @RequestBody ReqDataVo reqDataVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
		int dbMSG = reqDataService.reqDataInsert(reqDataVo);           
		
		
		
		modelAndView.addObject("resultMSG", dbMSG);
		modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
}
