package egovframework.mdrt.datafar.web;

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
import egovframework.mdrt.datafar.DataDrivRoutFarService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;


@RestController
@RequestMapping(value="/data/dataFar")
public class DataRoutInfoFarController {
	
	
	
	@Resource(name = "DataDrivRoutFarService")
	protected DataDrivRoutFarService dataDrivRoutFarService;
	
		
	
}
