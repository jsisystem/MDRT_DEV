package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("IndUsrSatisDAO")
public class IndUsrSatisDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getUsrSatisData(UserVo userSearch) {
			return (List<UserVo>) list("IndUsrSatisDAO.getUsrSatisData", userSearch);
		}

	
	 }
