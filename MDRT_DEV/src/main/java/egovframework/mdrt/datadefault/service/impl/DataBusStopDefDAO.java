package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataBusStopDefDAO")
public class DataBusStopDefDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataBusStopDef(UserVo userSearch) {
			return (List<UserVo>) list("DataBusStopDefDAO.getBusStopDef", userSearch);
		}

	
	 }
