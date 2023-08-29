package egovframework.mdrt.datadefault.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datadefault.DataCallRecDefService;
import egovframework.mdrt.datadefault.DataOtherBusiDefService;
import egovframework.mdrt.datadefault.DataVeicDrivDefService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataOtherBusiDefService")
public class DataOtherBusiDefServiceImpl extends EgovAbstractServiceImpl implements DataOtherBusiDefService {

	@Resource(name = "DataOtherBusiDefDAO") 
	private DataOtherBusiDefDAO DataOtherBusiDefDAO;

	
	@Override
	public List<UserVo> getDataOtherBusiDef(UserVo userSearch) throws Exception {
		return DataOtherBusiDefDAO.getDataOtherBusiDef(userSearch);
	}


	
 
	
}
