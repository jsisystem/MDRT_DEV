package egovframework.mdrt.user.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService {

	@Resource(name = "userDAO")
	private UserDAO userDAO;

	@Override
	public List<Map> getUserList(UserVo userSearch) throws Exception {
		return userDAO.getUserList(userSearch);
	}

	@Override
	public Map<String, String> getUserOne(UserVo userSearch) throws Exception {
		return userDAO.getUserOne(userSearch);
	}

	@Override
	public void insrtUser(UserVo userSearch) throws Exception {
		userDAO.insrtUser(userSearch);
	}

	@Override
	public int deleteUser(UserVo userSearch) throws Exception {
		return userDAO.deleteUser(userSearch);
	}

	@Override
	public void updateUser(UserVo userSearch) throws Exception {
		userDAO.updateUser(userSearch);
	}

	@Override
	public void updateAppr(UserVo userSearch) throws Exception {
		userDAO.updateAppr(userSearch);
	}

	@Override
	public int getCheckId(UserVo userId) throws Exception {
		return userDAO.getCheckId(userId);
	}

	@Override
	public int getUserListCount(UserVo userSearch) throws Exception {
		return userDAO.getUserListCount(userSearch);
	}


}
