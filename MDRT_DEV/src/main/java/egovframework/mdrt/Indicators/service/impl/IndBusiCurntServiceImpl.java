package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndBusiCurntService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndBusiCurntService")
public class IndBusiCurntServiceImpl extends EgovAbstractServiceImpl implements IndBusiCurntService {

	@Resource(name = "IndBusiCurntDAO")
	private IndBusiCurntDAO indBusiCurntDAO;

	
	@Override
	public List<UserVo> getBusiCurntData(UserVo userSearch) throws Exception {
		return indBusiCurntDAO.getBusiCurntData(userSearch);
	}


	
 
	
}
