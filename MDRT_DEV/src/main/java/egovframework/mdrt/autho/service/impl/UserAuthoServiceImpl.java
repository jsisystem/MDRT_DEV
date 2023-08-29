package egovframework.mdrt.autho.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.login.UserLoginService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserAuthoService")
public class UserAuthoServiceImpl extends EgovAbstractServiceImpl implements UserAuthoService {

	@Resource(name = "userAuthoDAO")
	private UserAuthoDAO userAuthoDAO;

	
	@Override
	public List<Map> getAuthoList(String userSearch) throws Exception {
		return userAuthoDAO.getAuthoList(userSearch);
	}
	
	@Override
	public Map<String, String> getAuthoGubun(AuthVo authVo) throws Exception {
		return userAuthoDAO.getAuthoGubun(authVo);
	}

	@Override
	public void insertAuthoOne(AuthVo authVo) throws Exception {
		userAuthoDAO.insertAuthoOne(authVo);
	}


	@Override
	public int updateAutho(AuthVo authVo) throws Exception {
		return userAuthoDAO.updateAutho(authVo);
	}


	


	
 
	
}
