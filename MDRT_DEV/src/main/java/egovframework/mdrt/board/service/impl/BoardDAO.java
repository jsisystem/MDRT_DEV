package egovframework.mdrt.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<Map> getBoardList(Map<String, Object> mapVo) {
		return (List<Map>) list("BoardDAO.getBoardList", mapVo);
	}

	public int getBoardListCount(Map<String, Object> mapVo) {
		return (int) select("BoardDAO.getBoardListCount", mapVo);
	}

	public Map<String, Object> getBoardDetail(Map<String, Object> mapVo) {
		return (Map<String, Object>) select("BoardDAO.getBoardDetail", mapVo);
	}

	public void getUpdateBordCnt(Map<String, Object> mapVo) {
		update("BoardDAO.getUpdateBordCnt", mapVo);
		
	}

	public void getBoardInsert(Map<String, Object> mapVo) {
		insert("BoardDAO.getBoardInsert", mapVo);
		
	}


}
