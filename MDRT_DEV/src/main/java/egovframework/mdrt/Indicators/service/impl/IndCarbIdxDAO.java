package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("IndCarbIdxDAO")
public class IndCarbIdxDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getCarbIdxData(UserVo userSearch) {
			return (List<UserVo>) list("IndCarbIdxDAO.getCarbIdxData", userSearch);
		}

	
	 }
