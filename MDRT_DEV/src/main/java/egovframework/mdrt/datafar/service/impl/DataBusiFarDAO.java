package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataBusiFarDAO")
public class DataBusiFarDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataBusiFar(UserVo userSearch) {
			return (List<UserVo>) list("DataBusiFarDAO.getBusiFar", userSearch);
		}

	
	 }
