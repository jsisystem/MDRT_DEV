package egovframework.mdrt.busi.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.busi.BusiService;
import egovframework.mdrt.code.CodeService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.BusiVo;
import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("BusiService")
public class BusiServiceImpl extends EgovAbstractServiceImpl implements BusiService {

	@Resource(name = "BusiDAO")
	private BusiDAO busiDAO;

	@Override
	public List<Map> getBusiList(BusiVo busiSearch) throws Exception {
		return busiDAO.getBusiList(busiSearch);
	}

	@Override
	public void busiInsert(BusiVo busiVo) {
		busiDAO.busiInsert(busiVo);
	}

	@Override
	public List<Map> getBusiListArea(BusiVo busiSearch) throws Exception {
		return busiDAO.getBusiListArea(busiSearch);
	}

	@Override
	public int getBusiListCount(BusiVo busiSearch) throws Exception {
		return busiDAO.getBusiListCount(busiSearch);
	}

}
