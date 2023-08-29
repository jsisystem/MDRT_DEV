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

import egovframework.mdrt.board.BoardFileService;
import egovframework.mdrt.vo.BoardFileVo;
import egovframework.mdrt.vo.BoardVo;
import egovframework.mdrt.vo.UserVo;



/*
 * 게시판 첨부파일  담당 컨트롤러
 * 
 * */

@RestController
@RequestMapping(value="/data/board")
public class BoardFileController {
	
	@Resource(name = "boardFileService")
	protected BoardFileService boardFileService;
			
	@RequestMapping(value = "/boardFileList.json")
	public ModelAndView boardFileList(HttpServletRequest request,HttpSession session, @RequestBody UserVo userVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
		
			List<BoardFileVo> fileSummary = boardFileService.getBoardFileList();           //게시판 조회
			
		
			modelAndView.addObject("resultList", fileSummary);
			
			modelAndView.setViewName("jsonView");
			
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
}
