package egovframework.mdrt.datafar.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.mdrt.Indicators.IndAccidService;
import egovframework.mdrt.Indicators.IndSysStabService;
import egovframework.mdrt.Indicators.IndUsrSatisService;
import egovframework.mdrt.autho.UserAuthoService;
import egovframework.mdrt.datafar.DataUploadListService;
import egovframework.mdrt.vo.AuthVo;
import egovframework.mdrt.vo.DataUpdVo;
import egovframework.mdrt.vo.UserVo;


@RestController
@RequestMapping(value="/data/dataFar")
public class DataUploadListController {
	// 권한 조회
	@Resource(name = "UserAuthoService")
	protected UserAuthoService userAuthoService;
	
	
	@Resource(name = "DataUploadListService")
	protected DataUploadListService dataUploadListService;
	
		
	@RequestMapping(value = "/dataUploadList.json")
	public ModelAndView dataUploadList(HttpServletRequest request,HttpSession session, @RequestBody Map<String, String> dataUpdSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {

			
			//일반
			List<Map> resultSummary = dataUploadListService.getDataUploadList(dataUpdSearch);      
		
			modelAndView.addObject("resultList", resultSummary);
			modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	@RequestMapping(value = "/dataUploadListDetail.json")
	public ModelAndView dataUploadDetail(HttpServletRequest request,HttpSession session, @RequestBody DataUpdVo dataUpdSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			dataUpdSearch.setTableGubun(dataUpdSearch.getTableGubun().toLowerCase());
			List<Map> resultSummary = dataUploadListService.getDataUploadDetail(dataUpdSearch);
			modelAndView.addObject("resultList", resultSummary);
			modelAndView.setViewName("jsonView");
		
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	/*TODO 수동 수집 구현 필요
	 * 엑셀 읽어들여서 테이블에 넣는 과정 구현 필요
	*/
	@RequestMapping(value = "/dataUploadInsert.json")
	public ModelAndView dataUploadInsert(HttpServletRequest request,HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			// 수동업로드 excel 구현 필요
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	/*TODO 재수집 요청시 등록된 DB 에서 자동으로 데이터 긁어오는 부분 구현
	 *  자료제공자가 자신의 업체 데이터를 긁어 MDRT DB에 넣을수 있도록 기존 연계 기능을 동작시켜줌.
	 */
	@RequestMapping(value = "/dataReUpload.json")
	public ModelAndView dataReUpload(HttpServletRequest request,HttpSession session) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			// 자신 업체 DB 수집 기능 실행하도록 기능구현 필요
		
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	@RequestMapping(value = "/dataUploadAppr.json")
	public ModelAndView dataUploadAppr(HttpServletRequest request,HttpSession session, @RequestBody Map<String, Object> dataUpdSearch) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		try {
			
			dataUploadListService.dataUploadAppr(dataUpdSearch);
			
			
			
			modelAndView.addObject("MSG", "승인되었습니다.");
		}catch(Exception e){
			System.out.println(e);
		}

		return modelAndView;
	}
	
	
	

	
}
