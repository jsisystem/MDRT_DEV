package egovframework.mdrt.code.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.GeomVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("CodeGeomDAO")
public class CodeGeomDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<GeomVo> getCodeGeomList(CodeVo codeSearch) {
		return (List<GeomVo>) list("CodeGeomDAO.getCodeGeomList", codeSearch);
	}

	public GeomVo getCodeGeomOne(CodeVo codeSearch) {
		return (GeomVo) list("CodeGeomDAO.getCodeGeomOne", codeSearch);
	}

}
