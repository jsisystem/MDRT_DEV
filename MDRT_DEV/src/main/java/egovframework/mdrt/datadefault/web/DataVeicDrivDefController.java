package egovframework.mdrt.datadefault.web;

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
import egovframework.mdrt.datadefault.DataCallRecDefService;
import egovframework.mdrt.datadefault.DataVeicDrivDefService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;

/*
 * 사용자 테이블을 조회함. 
 * */
@RestController
@RequestMapping(value="/data/dataDef")
public class DataVeicDrivDefController {
	
	
	
	@Resource(name = "DataVeicDrivDefService")
	protected DataVeicDrivDefService dataVeicDrivDefService;
	
		
	@RequestMapping(value = "/dataVeicDrivDef.json")
	public ModelAndView dataVeicDrivDefData(HttpServletRequest request,HttpSession session, @RequestBody UserVo userSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
		List<UserVo> resultSummary = dataVeicDrivDefService.getDataVeicDrivDef(userSearch);           //사용자 조회
		
		
		
		modelAndView.addObject("resultList", resultSummary);
		modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
