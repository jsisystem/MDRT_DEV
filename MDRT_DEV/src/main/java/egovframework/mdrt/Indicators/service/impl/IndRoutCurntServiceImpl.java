package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndRoutCurntService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndRoutCurntService")
public class IndRoutCurntServiceImpl extends EgovAbstractServiceImpl implements IndRoutCurntService {

	@Resource(name = "IndRoutCurntDAO")
	private IndRoutCurntDAO indRoutCurntDAO;

	
	@Override
	public List<UserVo> getRoutCurntData(UserVo userSearch) throws Exception {
		return indRoutCurntDAO.getRoutCurntData(userSearch);
	}


	
 
	
}
