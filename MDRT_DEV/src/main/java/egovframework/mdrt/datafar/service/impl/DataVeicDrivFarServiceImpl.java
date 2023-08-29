package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataVeicDrivFarService")
public class DataVeicDrivFarServiceImpl extends EgovAbstractServiceImpl implements DataVeicDrivFarService {

	@Resource(name = "DataVeicDrivFarDAO") 
	private DataVeicDrivFarDAO DataVeicDrivFarDAO;

	
	@Override
	public List<UserVo> getDataVeicDrivFar(UserVo userSearch) throws Exception {
		return DataVeicDrivFarDAO.getDataVeicDrivFar(userSearch);
	}


	
 
	
}
