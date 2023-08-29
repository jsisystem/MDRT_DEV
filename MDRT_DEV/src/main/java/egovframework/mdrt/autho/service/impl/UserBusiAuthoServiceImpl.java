package egovframework.mdrt.autho.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.autho.UserBusiAuthoService;
import egovframework.mdrt.login.UserLoginService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.BusiAuthoVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("UserBusiAuthoService")
public class UserBusiAuthoServiceImpl extends EgovAbstractServiceImpl implements UserBusiAuthoService {

	@Resource(name = "userBusiAuthoDAO")
	private UserBusiAuthoDAO userBusiAuthoDAO;

	
	@Override
	public List<BusiAuthoVo> getUserBusiAuthoOne(String userSearch) throws Exception {
		return userBusiAuthoDAO.getUserBusiAuthoOne(userSearch);
	}


	
 
	
}
