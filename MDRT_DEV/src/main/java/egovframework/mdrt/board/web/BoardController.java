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

import egovframework.mdrt.board.BoardComService;
import egovframework.mdrt.board.BoardFileService;
import egovframework.mdrt.board.BoardService;
import egovframework.mdrt.vo.BoardComVo;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.mdrt.vo.UserVo;



/*
 * 게시판 담당 컨트롤러
 * 
 * */


@RestController
@RequestMapping(value="/data/board")
public class BoardController {
	
	@Resource(name = "boardService")
	protected BoardService boardService;
	
	@Resource(name = "boardFileService")
	protected BoardFileService boardFileService;
	
	@Resource(name = "boardComService")
	protected BoardComService boardComService;
			
	@RequestMapping(value = "/boardList.json")
	public ModelAndView boardList(HttpServletRequest request,HttpSession session, @RequestBody UserVo userVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
			List<BoardVo> boardSummary = boardService.getBoardList();           //게시판 조회
			List<BoardFileVo>fileSummary = boardFileService.getBoardFileList();           //첨부파일조회
			List<BoardComVo> boardComSummary = boardComService.getBoardComList();           //덧글 조회
			
		
			modelAndView.addObject("resultList", boardSummary);
			modelAndView.addObject("resultList", fileSummary);
			modelAndView.addObject("resultList", boardComSummary);
			
			modelAndView.setViewName("jsonView");
			
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
