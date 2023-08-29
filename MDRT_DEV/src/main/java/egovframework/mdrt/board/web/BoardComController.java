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
import egovframework.mdrt.vo.BoardComVo;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.mdrt.vo.UserVo;


/*게시판-댓글 담당 컨트롤러*/


@RestController
@RequestMapping(value="/data/board")
public class BoardComController {
	
	@Resource(name = "boardComService")
	protected BoardComService boardComService;
			
	@RequestMapping(value = "/boardComList.json")
	public ModelAndView boardComList(HttpServletRequest request,HttpSession session, @RequestBody UserVo UserVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
			List<BoardComVo> boardComSummary = boardComService.getBoardComList();           //게시판 조회
			
		
			modelAndView.addObject("resultList", boardComSummary);
			
			modelAndView.setViewName("jsonView");
			
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
