package egovframework.mdrt.board.web;

import java.util.List;
import java.util.Map;

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
			
	@RequestMapping(value = "/boardList")
	public ModelAndView boardList(HttpServletRequest request,HttpSession session, @RequestBody Map<String, Object> mapVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			
			
			//토탈카운트 및 총 페이징 적용 필요
			//조건검색 ( 제목, 작성자, 내용)
			List<Map> boardSummary = boardService.getBoardList(mapVo);           //게시판 조회
			int contCnt = boardService.getBoardListCount(mapVo);           //게시판 조회
			
			//TODO 문의대상 확인필요 (ID 기준인지 , 권한 기준인지, 왜있어야 하는지)
		
			modelAndView.addObject("resultList", boardSummary);
			modelAndView.addObject("resultListCnt", contCnt);
			
			
			modelAndView.setViewName("jsonView");
			
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	// 게시판  상세보기 
	@RequestMapping(value = "/boardDetail")
	public ModelAndView boardDetail(HttpServletRequest request,HttpSession session, @RequestBody Map<String, Object> mapVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			//토탈카운트 및 총 페이징 적용 필요
			//조건검색 ( 제목, 작성자, 내용)
			boardService.getUpdateBordCnt(mapVo);//조회수 증가
			
			Map<String, Object> boardOne = boardService.getBoardDetail(mapVo);           //게시판 상세조회
			List<Map> boarFileList = boardFileService.getBoardFileList(mapVo);
			
			modelAndView.addObject("resultList", boardOne);
			modelAndView.addObject("resultFileList", boarFileList);
			
			if(mapVo.get("bordGubun").equals("ques")) {
				List<Map> boarComList = boardComService.getBoardComList(mapVo);
				modelAndView.addObject("resultComList", boarComList);
			}
			
			
			
			modelAndView.setViewName("jsonView");
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	//게시판 입력
	@RequestMapping(value = "/boardInsert")
	public ModelAndView boardInsert(HttpServletRequest request,HttpSession session, @RequestBody Map<String, Object> mapVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			
			boardService.getBoardInsert(mapVo);  
			
			
			modelAndView.setViewName("jsonView");
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	//덧글 입력
	//게시판 입력
	@RequestMapping(value = "/boardComInsert")
	public ModelAndView boardComInsert(HttpServletRequest request,HttpSession session, @RequestBody Map<String, Object> mapVo) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			
			boardComService.getBoardComInsert(mapVo);  
			
			
			modelAndView.setViewName("jsonView");
			
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	

}
