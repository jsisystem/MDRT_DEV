package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndSysStabService")
public class IndSysStabServiceImpl extends EgovAbstractServiceImpl implements IndSysStabService {

	@Resource(name = "IndSysStabDAO")
	private IndSysStabDAO indSysStabDAO;

	
	@Override
	public List<UserVo> getSysStabData(UserVo userSearch) throws Exception {
		return indSysStabDAO.getSysStabData(userSearch);
	}


	
 
	
}
