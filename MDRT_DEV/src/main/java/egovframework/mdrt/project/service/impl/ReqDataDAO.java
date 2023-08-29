package egovframework.mdrt.project.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.ReqDataVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("reqDataDAO")
public class ReqDataDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<UserVo> getReqData(UserVo userSearch) {
		return (List<UserVo>) list("ReqDataDAO.getReqData", userSearch);
	}

	public Map<String, Integer> getApprReqCnt(ReqDataVo aprAuth) {
		return (Map<String,Integer>) select("ReqDataDAO.getApprReqCnt", aprAuth);
	}

	public int reqDataInsert(ReqDataVo reqDataVo) {
		return (int) insert("ReqDataDAO.reqDataInsert", reqDataVo);
	}

}
