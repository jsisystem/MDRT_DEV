package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datadefault.DataCallRecDefService;
import egovframework.mdrt.datadefault.DataVeicDrivDefService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataVeicDrivDefService")
public class DataVeicDrivDefServiceImpl extends EgovAbstractServiceImpl implements DataVeicDrivDefService {

	@Resource(name = "DataVeicDrivDefDAO") 
	private DataVeicDrivDefDAO DataVeicDrivDefDAO;

	
	@Override
	public List<UserVo> getDataVeicDrivDef(UserVo userSearch) throws Exception {
		return DataVeicDrivDefDAO.getDataVeicDrivDef(userSearch);
	}


	
 
	
}
