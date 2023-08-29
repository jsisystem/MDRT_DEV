package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataVeicDrivDefDAO")
public class DataVeicDrivDefDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataVeicDrivDef(UserVo userSearch) {
			return (List<UserVo>) list("DataVeicDrivDefDAO.getVeicDrivDef", userSearch);
		}

	
	 }
