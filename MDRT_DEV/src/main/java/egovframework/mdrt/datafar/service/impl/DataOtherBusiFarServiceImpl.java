package egovframework.mdrt.datafar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.datafar.DataOtherBusiFarService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl; 

@Service("DataOtherBusiFarService")
public class DataOtherBusiFarServiceImpl extends EgovAbstractServiceImpl implements DataOtherBusiFarService {

	@Resource(name = "DataOtherBusiFarDAO") 
	private DataOtherBusiFarDAO DataOtherBusiFarDAO;

	
	@Override
	public List<UserVo> getDataOtherBusiFar(UserVo userSearch) throws Exception {
		return DataOtherBusiFarDAO.getDataOtherBusiFar(userSearch);
	}


	
 
	
}
