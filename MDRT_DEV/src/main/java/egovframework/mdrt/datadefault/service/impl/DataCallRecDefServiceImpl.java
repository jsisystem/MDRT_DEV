package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datadefault.DataCallRecDefService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataCallRecDefService")
public class DataCallRecDefServiceImpl extends EgovAbstractServiceImpl implements DataCallRecDefService {

	@Resource(name = "DataCallRecDefDAO") 
	private DataCallRecDefDAO DataCallRecDefDAO;

	
	@Override
	public List<UserVo> getDataCallRecDef(UserVo userSearch) throws Exception {
		return DataCallRecDefDAO.getDataCallRecDef(userSearch);
	}


	
 
	
}
