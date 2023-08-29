package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datadefault.DataCallRecDefService;
import egovframework.mdrt.datadefault.DataDrivRoutDefService;
import egovframework.mdrt.datadefault.DataVeicDrivDefService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataDrivRoutDefService")
public class DataDrivRoutDefServiceImpl extends EgovAbstractServiceImpl implements DataDrivRoutDefService {

	@Resource(name = "DataDrivRoutDefDAO") 
	private DataDrivRoutDefDAO DataDrivRoutDefDAO;

	
	@Override
	public List<UserVo> getDataDrivRoutDef(UserVo userSearch) throws Exception {
		return DataDrivRoutDefDAO.getDataDrivRoutDef(userSearch);
	}


	
 
	
}
