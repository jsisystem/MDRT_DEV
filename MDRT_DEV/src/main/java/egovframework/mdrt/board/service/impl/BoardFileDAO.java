package egovframework.mdrt.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("boardFileDAO")
public class BoardFileDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<BoardFileVo> getBoardFileList() {
			return (List<BoardFileVo>) list("BoardFileDAO.getBoardFileList");
		}

	
	 	}
