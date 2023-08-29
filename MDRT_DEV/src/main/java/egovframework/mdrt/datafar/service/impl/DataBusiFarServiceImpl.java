package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datafar.DataBusiFarService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.datafar.DataVeicDrivFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("DataBusiFarService")
public class DataBusiFarServiceImpl extends EgovAbstractServiceImpl implements DataBusiFarService {

	@Resource(name = "DataBusiFarDAO") 
	private DataBusiFarDAO DataBusiFarDAO;

	
	@Override
	public List<UserVo> getDataBusiFar(UserVo userSearch) throws Exception {
		return DataBusiFarDAO.getDataBusiFar(userSearch);
	}


	
 
	
}
