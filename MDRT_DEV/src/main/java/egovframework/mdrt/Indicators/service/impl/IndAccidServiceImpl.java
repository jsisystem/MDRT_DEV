package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("IndAccidService")
public class IndAccidServiceImpl extends EgovAbstractServiceImpl implements IndAccidService {

	@Resource(name = "indAccidDAO")
	private IndAccidDAO indAccidDAO;

	
	@Override
	public List<UserVo> getindAccidData(UserVo userSearch) throws Exception {
		return indAccidDAO.getIndAccidData(userSearch);
	}


	
 
	
}
