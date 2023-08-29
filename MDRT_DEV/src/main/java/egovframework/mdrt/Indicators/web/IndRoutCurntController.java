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
import egovframework.mdrt.Indicators.IndRoutCurntService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.vo.UserVo;

/*
 * 사용자 테이블을 조회함. 
 * */
@RestController
@RequestMapping(value="/data/indRoutCurnt")
public class IndRoutCurntController {
	
	
	
	@Resource(name = "IndRoutCurntService")
	protected IndRoutCurntService indRoutCurntService;
	
		
	@RequestMapping(value = "/indRoutCurntData.json")
	public ModelAndView indRoutCurntData(HttpServletRequest request,HttpSession session, @RequestBody UserVo userSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
		List<UserVo> resultSummary = indRoutCurntService.getRoutCurntData(userSearch);           
		
		
		
		modelAndView.addObject("resultList", resultSummary);
		modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
