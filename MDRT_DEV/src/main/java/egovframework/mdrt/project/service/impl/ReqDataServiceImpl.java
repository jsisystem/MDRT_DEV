package egovframework.mdrt.project.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.project.ReqDataService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.ReqDataVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("ReqDataService")
public class ReqDataServiceImpl extends EgovAbstractServiceImpl implements ReqDataService {

	@Resource(name = "reqDataDAO")
	private ReqDataDAO reqDataDAO;

	
	@Override
	public List<Map> getReqData(UserVo userSearch) throws Exception {
		return reqDataDAO.getReqData(userSearch);
	}


	@Override
	public List<UserVo> getReqDataCnt(UserVo userSearch) throws Exception {
		return null;
	}


	@Override
	public Map<String, Integer> getApprReqCnt(ReqDataVo aprAuth) throws Exception {
		return reqDataDAO.getApprReqCnt(aprAuth);
	}


	@Override
	public int reqDataInsert(ReqDataVo reqDataVo) throws Exception {
		return reqDataDAO.reqDataInsert(reqDataVo);
	}


	
 
	
}
