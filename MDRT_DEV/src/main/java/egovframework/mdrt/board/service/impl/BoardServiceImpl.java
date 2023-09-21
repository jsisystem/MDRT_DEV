package egovframework.mdrt.board.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.board.BoardService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {

	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;

	
	@Override
	public List<Map> getBoardList( Map<String, Object> mapVo) throws Exception {
		return boardDAO.getBoardList(mapVo);
		
	}

	@Override
	public int getBoardListCount(Map<String, Object> mapVo) {
		return boardDAO.getBoardListCount(mapVo);
	}

	@Override
	public Map<String, Object> getBoardDetail(Map<String, Object> mapVo) {
		return boardDAO.getBoardDetail(mapVo);
	}

	@Override
	public void getUpdateBordCnt(Map<String, Object> mapVo) {
		boardDAO.getUpdateBordCnt(mapVo);
	}
	
	@Override
	public void getBoardInsert(Map<String, Object> mapVo) {
		boardDAO.getBoardInsert(mapVo);
	}



	
}
