package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datadefault.DataBusStopDefService;
import egovframework.mdrt.datadefault.DataCallRecDefService;
import egovframework.mdrt.datadefault.DataVeicDrivDefService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataBusStopDefService")
public class DataBusStopDefServiceImpl extends EgovAbstractServiceImpl implements DataBusStopDefService {

	@Resource(name = "DataBusStopDefDAO") 
	private DataBusStopDefDAO DataBusStopDefDAO;

	
	@Override
	public List<UserVo> getDataBusStopDef(UserVo userSearch) throws Exception {
		return DataBusStopDefDAO.getDataBusStopDef(userSearch);
	}


	
 
	
}
