package egovframework.mdrt.appr.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userApprListDAO")
public class UserApprListDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<UserVo> getUserApprList(String userSearch) {
		return (List<UserVo>) list("userApprListDAO.getUserApprList", userSearch);
	}

}
