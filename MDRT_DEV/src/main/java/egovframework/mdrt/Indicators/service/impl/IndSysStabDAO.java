package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("IndSysStabDAO")
public class IndSysStabDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getSysStabData(UserVo userSearch) {
			return (List<UserVo>) list("IndSysStabDAO.getSysStabData", userSearch);
		}

	
	 }
