package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("IndBusiCurntDAO")
public class IndBusiCurntDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getBusiCurntData(UserVo userSearch) {
			return (List<UserVo>) list("IndBusiCurntDAO.getBusiCurntData", userSearch);
		}

	
	 }
