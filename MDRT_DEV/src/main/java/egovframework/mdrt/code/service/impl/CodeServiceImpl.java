package egovframework.mdrt.code.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.code.CodeService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.CodeVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("CodeService")
public class CodeServiceImpl extends EgovAbstractServiceImpl implements CodeService {

	@Resource(name = "CodeDAO")
	private CodeDAO codeDAO;

	@Override
	public List<Map>  getCodeList() throws Exception {
		return codeDAO.getCodeList();
	}

	@Override
	public List<Map>  getCodeSelectList(CodeVo codeSearch) throws Exception {
		return codeDAO.getCodeSelectList(codeSearch);
	}

	@Override
	public int codeUpdate(CodeVo codeVo) throws Exception {
		return codeDAO.codeUpdate(codeVo);
	}

	@Override
	public int codeDelete(CodeVo codeVo) throws Exception {
		return codeDAO.codeDelete(codeVo);
	}

	@Override
	public void codeInsert(CodeVo codeVo) throws Exception {
		codeDAO.codeInsert(codeVo);
	}

	@Override
	public String getCodeKrNm(String cdId) throws Exception {
		return codeDAO.getCodeKrNm(cdId);
	}

}
