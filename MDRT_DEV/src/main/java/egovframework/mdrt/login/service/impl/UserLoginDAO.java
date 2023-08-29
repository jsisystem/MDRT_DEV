package egovframework.mdrt.login.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userLoginDAO")
public class UserLoginDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public Map<String, String> getUserInfoOne(UserVo userSearch) {
		return (Map<String, String>) select("UserLoginDAO.getUserInfoOne", userSearch);
	}
}
