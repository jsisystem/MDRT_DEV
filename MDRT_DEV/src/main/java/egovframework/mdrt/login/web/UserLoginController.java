package egovframework.mdrt.login.web;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.UserVo;
import egovframework.mdrt.login.service.UserLoginService;


@Controller
@RequestMapping(value="/rest/userLogin")
public class UserLoginController {
	
	@Resource(name = "UserLoginService")
	protected UserLoginService userLoginService;
	

	
	@RequestMapping(value = "/loginOne")
	public ModelAndView userLoginOne(HttpServletRequest request,HttpSession session, UserVo userSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		System.out.println("Sdsdsd");

		
		List<UserVo> resultSummary = userLoginService.getUserInfoOne(userSearch);   //페이징 처리완료
		
		
		modelAndView.addObject("resultList", resultSummary);
		modelAndView.setViewName("jsonView");
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
