package egovframework.mdrt.board.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.board.BoardAlarmService;
import egovframework.mdrt.board.BoardFileService;
import egovframework.mdrt.vo.BoardAlarmVo;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.mdrt.vo.UserVo;


/*
 * 읽지 않은 게시판 카운터 조회 컨트롤러
 * 
 * */

@RestController
@RequestMapping(value="/data/board")
public class BoardAlarmController {
	
	@Resource(name = "boardAlarmService")
	protected BoardAlarmService boardAlarmService;
			
	@RequestMapping(value = "/boardAlarmList.json")
	public ModelAndView boardAlarmList(HttpServletRequest request,HttpSession session, @RequestBody UserVo userVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
			BoardAlarmVo boardAlarmSummary = boardAlarmService.getBoardAlarmList("system");           //게시판 알람 조회
			
		
			modelAndView.addObject("resultList", boardAlarmSummary);
			
			modelAndView.setViewName("jsonView");
			
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	//게시판 읽었을때 인서트 발생 (사용자가 읽었는지 확인하기 위함. TB_BOARD_ALARM)
}
