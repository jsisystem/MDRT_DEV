package egovframework.mdrt.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.BoardAlarmVo;
import egovframework.mdrt.vo.BoardComVo;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("boardAlarmDAO")
public class BoardAlarmDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public BoardAlarmVo getBoardAlarmList(String systemId) {
		return (BoardAlarmVo) select("BoardAlarmDAO.getBoardAlarmList", systemId);
	}

	public BoardAlarmVo getBoardAlarmInfo(String usrId) {
		return (BoardAlarmVo) select("BoardAlarmDAO.getBoardAlarmInfo", usrId);
	}
}
