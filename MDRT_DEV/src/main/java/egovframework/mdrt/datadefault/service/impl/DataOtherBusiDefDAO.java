package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataOtherBusiDefDAO")
public class DataOtherBusiDefDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataOtherBusiDef(UserVo userSearch) {
			return (List<UserVo>) list("DataOtherBusiDefDAO.getOtherBusiDef", userSearch);
		}

	
	 }
