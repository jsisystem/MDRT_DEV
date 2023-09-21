package egovframework.mdrt.datafar.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.mdrt.vo.DataUpdVo;
import egovframework.mdrt.vo.UserVo;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("DataUploadListDAO")
public class DataUploadListDAO extends EgovAbstractDAO {
	@SuppressWarnings("unchecked")

	public List<Map> getDataUploadList(Map<String, String> map) {
		return (List<Map>) list("DataUploadListDAO.getDataUploadList", map);
	}

	public List<Map> getDataUploadDetail(DataUpdVo dataUpdSearch) {

		List<Map> column = (List<Map>) list("DataUploadListDAO.getDataUploadColList", dataUpdSearch);
		String sqlString = "";
		for (int idx = 0; idx < column.size(); idx++) {
			sqlString += column.get(idx).get("columnName");
			if (idx == column.size() - 1) {
				break;
			}
			sqlString += ", ";
		}

		dataUpdSearch.setColsql(sqlString);
		return (List<Map>) list("DataUploadListDAO.getDataUploadDetail", dataUpdSearch);
	}

	
	/*TODO 여기 손좀 봐야함 .  원시데이터 승인시 ->DEF 테이블로 삽입 시키는 과정
	 */
	public void getDataUploadAppr(Map<String, Object> map) {
		 update("DataUploadListDAO.getDataUploadAppr", map);
		 
		 Map selectOne = (Map) select ("DataUploadListDAO.ReqDataDAO.getApprDataMv", map);
		 //update list 에 인서트
		 insert("DataUploadListDAO.insertUploadList", selectOne);
		 
		 List<Map> column = (List<Map>) list("DataUploadListDAO.getDataUploadColList", map);
			String sqlString = "";
			for (int idx = 0; idx < column.size(); idx++) {
				sqlString += column.get(idx).get("columnName");
				if (idx == column.size() - 1) {
					break;
				}
				sqlString += ", ";
			}

			map.put("colsql", sqlString); 
			List<Map> mapAll =(List<Map>) list("DataUploadListDAO.getDataUploadDetail", map);
			
		 //def 테이블에 데이터 인서트
		 insert("DataUploadListDAO.insertUploadDef",mapAll);
	}

}
