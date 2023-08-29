package egovframework.mdrt.datafar.web;

import java.util.List;
import java.util.Map;

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
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.vo.DataUpdVo;
import egovframework.mdrt.vo.UserVo;

/*
 * 사용자 테이블을 조회함. 
 * */
@RestController
@RequestMapping(value="/data/dataFar")
public class DataUploadListController {
	
	
	
	@Resource(name = "DataUploadListService")
	protected DataUploadListService dataUploadListService;
	
		
	@RequestMapping(value = "/dataUploadList.json")
	public ModelAndView dataUploadList(HttpServletRequest request,HttpSession session, @RequestBody DataUpdVo dataUpdSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
			List<Map> resultSummary = dataUploadListService.getDataUploadList(dataUpdSearch);      
		
		
		
		modelAndView.addObject("resultList", resultSummary);
		modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
