package egovframework.mdrt.board.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.board.BoardFileService;
import egovframework.mdrt.board.BoardService;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("boardFileService")
public class BoardFileServiceImpl extends EgovAbstractServiceImpl implements BoardFileService {

	@Resource(name = "boardFileDAO")
	private BoardFileDAO boardFileDAO;

	
	@Override
	public List<BoardFileVo> getBoardFileList() throws Exception {
		return boardFileDAO.getBoardFileList();
	}


	@Override
	public List<Map> getBoardFileList(Map<String, Object> mapVo) {
		return boardFileDAO.getBoardFileList(mapVo);
	}


	
 
	
}
