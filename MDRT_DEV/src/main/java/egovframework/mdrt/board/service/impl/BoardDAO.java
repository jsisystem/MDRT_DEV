package egovframework.mdrt.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<BoardVo> getBoardList() {
			return (List<BoardVo>) list("BoardDAO.getBoardList");
		}

	
	 	}
