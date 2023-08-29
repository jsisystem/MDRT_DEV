package egovframework.mdrt.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userDAO")
public class UserDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<Map> getUserList(UserVo userSearch) {
		return (List<Map>) list("UserDAO.getUserList", userSearch);
	}

	public Map<String, String> getUserOne(UserVo userSearch) {
		return (Map<String, String>) select("UserDAO.getUserOne", userSearch);
	}

	public void insrtUser(UserVo userSearch) {
		insert("UserDAO.insrtUser", userSearch);
	}

	public int deleteUser(UserVo userSearch) {
		return (int) delete("UserDAO.deleteUser", userSearch);
	}

	public void updateUser(UserVo userSearch) {
		update("UserDAO.updateUser", userSearch);
	}

	public void updateAppr(UserVo userSearch) {
		update("UserDAO.updateAppr", userSearch);
	}

	public int getCheckId(UserVo userId) {
		return (int)select("UserDAO.getCheckId", userId);
	}

	public int getUserListCount(UserVo userSearch) {
		return (int)select("UserDAO.getUserListCount",userSearch);
	}

}
