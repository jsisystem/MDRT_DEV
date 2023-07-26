package egovframework.mdrt.login.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.UserVo;
import egovframework.mdrt.login.service.UserLoginService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserLoginService")
public class UserLoginServiceImpl extends EgovAbstractServiceImpl implements UserLoginService {

	@Resource(name = "userLoginDAO")
	private UserLoginDAO userLoginDAO;

	
	@Override
	public List<UserVo> getUserInfoOne(UserVo userSearch) throws Exception {
		// TODO Auto-generated method stub
		return userLoginDAO.getUserInfoOne(userSearch);
	}


	
 
	
}
