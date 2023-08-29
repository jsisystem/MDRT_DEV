package egovframework.mdrt.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("projectMngDAO")
public class ProjectMngDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getProjectMng(UserVo userSearch) {
			return (List<UserVo>) list("ProjectMngDAO.getProjectMng", userSearch);
		}

	
	 	}
