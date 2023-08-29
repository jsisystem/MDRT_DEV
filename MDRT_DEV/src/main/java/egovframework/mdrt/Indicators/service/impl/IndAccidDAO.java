package egovframework.mdrt.Indicators.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("indAccidDAO")
public class IndAccidDAO extends EgovAbstractDAO{
	 @SuppressWarnings("unchecked")


		public List<UserVo> getIndAccidData(UserVo userSearch) {
			return (List<UserVo>) list("indAccid.getIndAccidData", userSearch);
		}

	
	 }
