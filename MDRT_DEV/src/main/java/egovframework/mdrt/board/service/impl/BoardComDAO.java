package egovframework.mdrt.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.BoardComVo;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("boardComDAO")
public class BoardComDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<BoardComVo> getBoardComList() {
		return (List<BoardComVo>) list("BoardComDAO.getBoardComList");
	}

	public List<Map> getBoardComList(Map<String, Object> mapVo) {
		return (List<Map>) list("BoardComDAO.getBoardComList",mapVo);
	}

	public void getBoardComInsert(Map<String, Object> mapVo) {
		insert("BoardComDAO.getBoardComInsert", mapVo);
	}

}
