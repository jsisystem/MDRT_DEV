package egovframework.mdrt.datafar.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.vo.DataUpdVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataUploadListService")
public class DataUploadListServiceImpl extends EgovAbstractServiceImpl implements DataUploadListService {

	@Resource(name = "DataUploadListDAO") 
	private DataUploadListDAO DataUploadListDAO;

	
	@Override
	public List<Map> getDataUploadList(Map<String, String>map) throws Exception {
		return DataUploadListDAO.getDataUploadList(map);
	}


	@Override
	public List<Map> getDataUploadDetail(DataUpdVo dataUpdSearch) throws Exception {
		return DataUploadListDAO.getDataUploadDetail(dataUpdSearch);
	}


	@Override
	public void dataUploadAppr(Map<String, Object> map) throws Exception {
		DataUploadListDAO.getDataUploadAppr(map);
	}


	
 
	
}
