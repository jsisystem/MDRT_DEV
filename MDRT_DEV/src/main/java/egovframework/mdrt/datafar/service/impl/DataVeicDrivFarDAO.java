package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataVeicDrivFarDAO")
public class DataVeicDrivFarDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataVeicDrivFar(UserVo userSearch) {
			return (List<UserVo>) list("DataVeicDrivFarDAO.getVeicDrivFar", userSearch);
		}

	
	 }
