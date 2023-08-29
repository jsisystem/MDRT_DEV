package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataCallRecDefDAO")
public class DataCallRecDefDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataCallRecDef(UserVo userSearch) {
			return (List<UserVo>) list("DataCallRecDefDAO.getCallRecDef", userSearch);
		}

	
	 }
