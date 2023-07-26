package egovframework.mdrt.login.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import egovframework.mdrt.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userLoginDAO")
public class UserLoginDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getUserInfoOne(UserVo userSearch) {
			// TODO Auto-generated method stub
			return (List<UserVo>) list("UserLoginDAO.getUserInfoOne", userSearch);
		}

	
	 	}
