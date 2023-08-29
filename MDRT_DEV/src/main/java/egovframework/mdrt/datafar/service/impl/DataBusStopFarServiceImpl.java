package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datafar.DataBusStopFarService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataBusStopFarService")
public class DataBusStopFarServiceImpl extends EgovAbstractServiceImpl implements DataBusStopFarService {

	@Resource(name = "DataBusStopFarDAO") 
	private DataBusStopFarDAO DataBusStopFarDAO;

	
	@Override
	public List<UserVo> getDataBusStopFar(UserVo userSearch) throws Exception {
		return DataBusStopFarDAO.getDataBusStopFar(userSearch);
	}


	
 
	
}
