package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndSafeMngService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndSafeMngService")
public class IndSafeMngServiceImpl extends EgovAbstractServiceImpl implements IndSafeMngService {

	@Resource(name = "IndSafeMngDAO")
	private IndSafeMngDAO indSafeMngDAO;

	
	@Override
	public List<UserVo> getSafeMngData(UserVo userSearch) throws Exception {
		return indSafeMngDAO.getSafeMngData(userSearch);
	}


	
 
	
}
