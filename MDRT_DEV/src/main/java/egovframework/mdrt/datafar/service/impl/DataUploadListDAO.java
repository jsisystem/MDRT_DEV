package egovframework.mdrt.datafar.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.DataUpdVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataUploadListDAO")
public class DataUploadListDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<Map> getDataUploadList(DataUpdVo dataUpdVo) {
			return (List<Map>) list("DataUploadListDAO.getDataUploadList", dataUpdVo);
		}

	
	 }
