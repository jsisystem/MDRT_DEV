package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataDrivRoutFarDAO")
public class DataDrivRoutFarDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataDrivRoutFar(UserVo userSearch) {
			return (List<UserVo>) list("DataDrivRoutFarDAO.getDrivRoutFar", userSearch);
		}

	
	 }
