package egovframework.mdrt.busi.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.BusiVo;
import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("BusiDAO")
public class BusiDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<Map> getBusiList(BusiVo busiSearch) {
		return (List<Map>) list("BusiDAO.getBusiList", busiSearch);
	}

	public void busiInsert(BusiVo busiVo) {
		insert("BusiDAO.busiInsert", busiVo);
	}

	public List<Map> getBusiListArea(BusiVo busiSearch) {
		return (List<Map>) list("BusiDAO.getBusiListArea", busiSearch);
	}

	public int getBusiListCount(BusiVo busiSearch) {
		return (int) select("BusiDAO.getBusiListCount", busiSearch);
	}

}
