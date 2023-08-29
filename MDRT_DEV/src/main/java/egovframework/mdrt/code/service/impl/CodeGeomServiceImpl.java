package egovframework.mdrt.code.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.code.CodeGeomService;
import egovframework.mdrt.code.CodeService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.GeomVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("CodeGeomService")
public class CodeGeomServiceImpl extends EgovAbstractServiceImpl implements CodeGeomService {

	@Resource(name = "CodeGeomDAO")
	private CodeGeomDAO codeGeomDAO;

	@Override
	public List<GeomVo> getCodeGeomList(CodeVo codeSearch) throws Exception {
		return codeGeomDAO.getCodeGeomList(codeSearch);
	}

	@Override
	public GeomVo getCodeGeomOne(CodeVo codeSearch) throws Exception {
		return codeGeomDAO.getCodeGeomOne(codeSearch);
	}

}
