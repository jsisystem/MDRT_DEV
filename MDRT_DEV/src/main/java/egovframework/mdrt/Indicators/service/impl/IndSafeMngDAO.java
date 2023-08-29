package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("IndSafeMngDAO")
public class IndSafeMngDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getSafeMngData(UserVo userSearch) {
			return (List<UserVo>) list("IndSafeMngDAO.getSafeMngData", userSearch);
		}

	 }
