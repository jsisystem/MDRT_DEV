package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.Indicators.IndUsrSatisService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndUsrSatisService")
public class IndUsrSatisServiceImpl extends EgovAbstractServiceImpl implements IndUsrSatisService {

	@Resource(name = "IndUsrSatisDAO")
	private IndUsrSatisDAO indUsrSatisDAO;

	
	@Override
	public List<UserVo> getUsrSatisData(UserVo userSearch) throws Exception {
		return indUsrSatisDAO.getUsrSatisData(userSearch);
	}


	
 
	
}
