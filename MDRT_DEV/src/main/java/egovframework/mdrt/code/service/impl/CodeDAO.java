package egovframework.mdrt.code.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.CodeVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("CodeDAO")
public class CodeDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<Map> getCodeList() {
		return (List<Map>) list("CodeDAO.getCodeList");
	}

	public List<Map> getCodeSelectList(CodeVo codeSearch) {
		return (List<Map>) list("CodeDAO.getCodeSelectList", codeSearch);
	}

	public int codeUpdate(CodeVo codeVo) {
		return (int) update("CodeDAO.codeUpdate", codeVo);
	}

	public int codeDelete(CodeVo codeVo) {
		return (int) update("CodeDAO.codeDelete", codeVo);
	}

	public void codeInsert(CodeVo codeVo) {
		insert("CodeDAO.codeInsert", codeVo);
	}

	public String getCodeKrNm(String cdId) {
		return (String) select("CodeDAO.getCodeKrNm", cdId);
	}

}
