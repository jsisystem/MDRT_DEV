package egovframework.mdrt.autho.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.UserVo;

/*
 * 사용자 권한 담당 컨트롤러 
 * 
 * */

@RestController
@RequestMapping(value = "/data/authoUser")
public class UserAuthoController {
	
		@Resource(name = "UserAuthoService")
		protected UserAuthoService userAuthoService;

		@RequestMapping(value = "/searchOne.json")
		public ModelAndView userAuthoOne(HttpServletRequest request, HttpSession session, UserVo userSearch)throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			try {

				List<Map> resultSummary = userAuthoService.getAuthoList(userSearch.getUsrId());

				modelAndView.addObject("resultList", resultSummary);
				modelAndView.setViewName("jsonView");

			} catch (Exception e) {
				System.out.println(e);
			}

			return modelAndView;
		}
	}
