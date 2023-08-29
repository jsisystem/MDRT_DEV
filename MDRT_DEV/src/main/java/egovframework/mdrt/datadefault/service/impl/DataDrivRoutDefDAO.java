package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataDrivRoutDefDAO")
public class DataDrivRoutDefDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataDrivRoutDef(UserVo userSearch) {
			return (List<UserVo>) list("DataDrivRoutDefDAO.getDrivRoutDef", userSearch);
		}

	
	 }
