package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("IndOperEfficDAO")
public class IndOperEfficDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getOperEfficData(UserVo userSearch) {
			return (List<UserVo>) list("IndOperEfficDAO.getOperEfficData", userSearch);
		}

	
	 }
