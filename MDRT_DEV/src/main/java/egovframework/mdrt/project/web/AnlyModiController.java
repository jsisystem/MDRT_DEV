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
import egovframework.mdrt.project.AnlyModiService;
import egovframework.mdrt.project.ReqDataService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.UserVo;

/*
 * 분석자료 관리 테이블을 조회함. 
 * */
@RestController
@RequestMapping(value="/data/project")
public class AnlyModiController {
	
	
	//분석자료 관리 테이블
	@Resource(name = "AnlyModiService")
	protected AnlyModiService anlyModiService;
	
		
	@RequestMapping(value = "/anlyModiData.json")
	public ModelAndView AnlyModi(HttpServletRequest request,HttpSession session, @RequestBody UserVo userSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
		List<UserVo> resultSummary = anlyModiService.getAnlyModiData(userSearch);           //사용자 조회
		
		
		
		modelAndView.addObject("resultList", resultSummary);
		modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
