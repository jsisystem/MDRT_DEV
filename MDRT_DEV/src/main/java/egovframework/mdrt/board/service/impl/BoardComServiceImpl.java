package egovframework.mdrt.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.board.BoardComService;
import egovframework.mdrt.board.BoardFileService;
import egovframework.mdrt.board.BoardService;
import egovframework.mdrt.vo.BoardComVo;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("boardComService")
public class BoardComServiceImpl extends EgovAbstractServiceImpl implements BoardComService {

	@Resource(name = "boardComDAO")
	private BoardComDAO boardComDAO;

	
	@Override
	public List<BoardComVo> getBoardComList() throws Exception {
		return boardComDAO.getBoardComList();
	}


	
 
	
}
