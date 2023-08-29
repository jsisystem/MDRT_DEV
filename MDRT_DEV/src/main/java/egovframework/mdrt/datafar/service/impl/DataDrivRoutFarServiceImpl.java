package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datafar.DataDrivRoutFarService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataDrivRoutFarService")
public class DataDrivRoutFarServiceImpl extends EgovAbstractServiceImpl implements DataDrivRoutFarService {

	@Resource(name = "DataDrivRoutFarDAO") 
	private DataDrivRoutFarDAO DataDrivRoutFarDAO;

	
	@Override
	public List<UserVo> getDataDrivRoutFar(UserVo userSearch) throws Exception {
		return DataDrivRoutFarDAO.getDataDrivRoutFar(userSearch);
	}


	
 
	
}
