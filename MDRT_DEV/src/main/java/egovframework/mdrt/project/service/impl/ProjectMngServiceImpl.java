package egovframework.mdrt.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.mdrt.project.ProjectMngService;
import egovframework.mdrt.project.ReqDataService;
import egovframework.mdrt.user.UserService;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("ProjectMngService")
public class ProjectMngServiceImpl extends EgovAbstractServiceImpl implements ProjectMngService {

	@Resource(name = "projectMngDAO")
	private ProjectMngDAO projectMngDAO;

	
	@Override
	public List<UserVo> getProjectMngList(UserVo userSearch) throws Exception {
		return projectMngDAO.getProjectMng(userSearch);
	}


	
 
	
}
