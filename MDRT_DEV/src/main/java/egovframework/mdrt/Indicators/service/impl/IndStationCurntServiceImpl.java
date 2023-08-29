package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndStationCurntService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndStationCurntService")
public class IndStationCurntServiceImpl extends EgovAbstractServiceImpl implements IndStationCurntService {

	@Resource(name = "IndStationCurntDAO")
	private IndStationCurntDAO indStationCurntDAO;

	
	@Override
	public List<UserVo> getStationCurntData(UserVo userSearch) throws Exception {
		return indStationCurntDAO.getStationCurntData(userSearch);
	}


	
 
	
}
