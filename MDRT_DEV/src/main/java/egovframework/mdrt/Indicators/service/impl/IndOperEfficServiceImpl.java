package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndOperEfficService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndOperEfficService")
public class IndOperEfficServiceImpl extends EgovAbstractServiceImpl implements IndOperEfficService {

	@Resource(name = "IndOperEfficDAO")
	private IndOperEfficDAO IndOperEfficDAO;

	
	@Override
	public List<UserVo> getOperEfficData(UserVo userSearch) throws Exception {
		return IndOperEfficDAO.getOperEfficData(userSearch);
	}


	
 
	
}
