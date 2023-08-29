package egovframework.mdrt.project.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.project.AnlyModiService;
import egovframework.mdrt.project.ReqDataService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.ReqDataVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("AnlyModiService")
public class AnlyModiServiceImpl extends EgovAbstractServiceImpl implements AnlyModiService {

	@Resource(name = "anlyModiDAO")
	private AnlyModiDAO anlyModiDAO;

	
	@Override
	public List<UserVo> getAnlyModiData(UserVo userSearch) throws Exception {
		return anlyModiDAO.getAnlyModiData(userSearch);
	}


	@Override
	public Map<String, Integer> getApprAnlyReqCnt(ReqDataVo reqdata) throws Exception {
		return anlyModiDAO.getApprAnlyReqCnt(reqdata);
	}


	
 
	
}
