package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataOtherBusiFarDAO")
public class DataOtherBusiFarDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getDataOtherBusiFar(UserVo userSearch) {
			return (List<UserVo>) list("DataOtherBusiFarDAO.getOtherBusiFar", userSearch);
		}

	
	 }
