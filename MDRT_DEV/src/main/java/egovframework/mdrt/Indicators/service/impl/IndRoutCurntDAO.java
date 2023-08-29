package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("IndRoutCurntDAO")
public class IndRoutCurntDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getRoutCurntData(UserVo userSearch) {
			return (List<UserVo>) list("IndRoutCurntDAO.getRoutCurntData", userSearch);
		}

	
	 }
