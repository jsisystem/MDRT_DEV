package egovframework.mdrt.project.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.ReqDataVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("anlyModiDAO")
public class AnlyModiDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getAnlyModiData(UserVo userSearch) {
			return (List<UserVo>) list("AnlyModiDAO.getAnlyModiData", userSearch);
		}

	public Map<String, Integer> getApprAnlyReqCnt(ReqDataVo reqdata) {
		return (Map<String, Integer>) select("AnlyModiDAO.getApprAnlyReqCnt", reqdata);
	}

	
	 	}
