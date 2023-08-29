package egovframework.mdrt.appr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.appr.UserApprListService;
import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.login.UserLoginService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserApprListService")
public class UserApprListServiceImpl extends EgovAbstractServiceImpl implements UserApprListService {

	@Resource(name = "userApprListDAO")
	private UserApprListDAO userApprListDAO;

	
	@Override
	public List<UserVo> getUserApprList (String userSearch) throws Exception {
		return userApprListDAO.getUserApprList(userSearch);
	}


	
 
	
}
