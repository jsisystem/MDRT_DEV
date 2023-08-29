package egovframework.mdrt.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.board.BoardService;
import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {

	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;

	
	@Override
	public List<BoardVo> getBoardList() throws Exception {
		return boardDAO.getBoardList();
		
		
	}


	
 
	
}
