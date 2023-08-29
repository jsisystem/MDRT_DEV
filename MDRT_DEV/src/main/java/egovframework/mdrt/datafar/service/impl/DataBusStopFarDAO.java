package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataBusStopFarDAO")
public class DataBusStopFarDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataBusStopFar(UserVo userSearch) {
			return (List<UserVo>) list("DataBusStopFarDAO.getBusStopFar", userSearch);
		}

	
	 }
