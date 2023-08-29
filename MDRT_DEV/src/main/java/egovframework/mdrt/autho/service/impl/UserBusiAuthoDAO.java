package egovframework.mdrt.autho.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.BusiAuthoVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userBusiAuthoDAO")
public class UserBusiAuthoDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<BusiAuthoVo> getUserBusiAuthoOne(String userSearch) {
		return (List<BusiAuthoVo>) list("userBusiAuthoDAO.getUserBusiAuthoOne", userSearch);
	}

}
