package egovframework.mdrt.login.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.login.UserLoginService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserLoginService")
public class UserLoginServiceImpl extends EgovAbstractServiceImpl implements UserLoginService {

	@Resource(name = "userLoginDAO")
	private UserLoginDAO userLoginDAO;

	@Override
	public Map<String, String> getUserInfoOne(UserVo userSearch) throws Exception {
		return userLoginDAO.getUserInfoOne(userSearch);
	}

}
