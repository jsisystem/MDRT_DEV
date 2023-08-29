package egovframework.mdrt.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.board.BoardAlarmService;
import egovframework.mdrt.board.BoardComService;
import egovframework.mdrt.board.BoardFileService;
import egovframework.mdrt.board.BoardService;
import egovframework.mdrt.vo.BoardAlarmVo;
import egovframework.mdrt.vo.BoardComVo;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("boardAlarmService")
public class BoardAlarmServiceImpl extends EgovAbstractServiceImpl implements BoardAlarmService {

	@Resource(name = "boardAlarmDAO")
	private BoardAlarmDAO boardAlarmDAO;

	
	@Override
	public BoardAlarmVo getBoardAlarmList(String systemId) throws Exception {
		return boardAlarmDAO.getBoardAlarmList(systemId);
	}


	@Override
	public BoardAlarmVo getBoardAlarmInfo(String usrId) throws Exception {
		return boardAlarmDAO.getBoardAlarmInfo(usrId);
	}


	
 
	
}
