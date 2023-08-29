package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndCarbIdxService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndCarbIdxService")
public class IndCarbIdxServiceImpl extends EgovAbstractServiceImpl implements IndCarbIdxService {

	@Resource(name = "IndCarbIdxDAO")
	private IndCarbIdxDAO indCarbIdxDAO;

	
	@Override
	public List<UserVo> getCarbIdxData(UserVo userSearch) throws Exception {
		return indCarbIdxDAO.getCarbIdxData(userSearch);
	}


	
 
	
}
