package egovframework.mdrt.autho.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.AuthVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userAuthoDAO")
public class UserAuthoDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<Map> getAuthoList(String userSearch) {
		return (List<Map>) list("userAuthoDAO.getAuthoList", userSearch);
	}
	
	public Map<String, String> getAuthoGubun(AuthVo authVo) {
			
		return (Map<String, String>) select("userAuthoDAO.getAuthoAUTH", authVo);
	}

	public void insertAuthoOne(AuthVo authVo) {
		insert("userAuthoDAO.insertAuthoOne", authVo);
		
	}

	public int updateAutho(AuthVo authVo) {
		return (int) insert("userAuthoDAO.updateAutho", authVo);
	}

	

}
