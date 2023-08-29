package egovframework.mdrt.Indicators.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.Indicators.IndUsrSatisService;
import egovframework.mdrt.vo.UserVo;

/*
 * 사용자 테이블을 조회함. 
 * */
@RestController
@RequestMapping(value="/data/indUsrSatis")
public class IndUsrSatisController {
	
	
	
	@Resource(name = "IndUsrSatisService")
	protected IndUsrSatisService indUsrSatisService;
	
		
	@RequestMapping(value = "/indUsrSatisData.json")
	public ModelAndView indUsrSatisData(HttpServletRequest request,HttpSession session, @RequestBody UserVo userSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
		List<UserVo> resultSummary = indUsrSatisService.getUsrSatisData(userSearch);           //사용자 조회
		
		
		
		modelAndView.addObject("resultList", resultSummary);
		modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
