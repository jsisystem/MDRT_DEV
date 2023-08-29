package egovframework.mdrt.vo;

import java.util.Date;

public class ReqDataVo {
	private int seq;
	private Date dataDt;
	private String aplArea;
	private String aplId;
	private Date aplDt;
	private String aprCp;
	private String aprUsr;
	private Date aprDt;
	private String aprAuth;
	private int apl_area_cnt;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public Date getDataDt() {
		return dataDt;
	}

	public void setDataDt(Date dataDt) {
		this.dataDt = dataDt;
	}

	public String getAplArea() {
		return aplArea;
	}

	public void setAplArea(String aplArea) {
		this.aplArea = aplArea;
	}

	public String getAplId() {
		return aplId;
	}

	public void setAplId(String aplId) {
		this.aplId = aplId;
	}

	public Date getAplDt() {
		return aplDt;
	}

	public void setAplDt(Date aplDt) {
		this.aplDt = aplDt;
	}

	public String getAprCp() {
		return aprCp;
	}

	public void setAprCp(String aprCp) {
		this.aprCp = aprCp;
	}

	public String getAprUsr() {
		return aprUsr;
	}

	public void setAprUsr(String aprUsr) {
		this.aprUsr = aprUsr;
	}

	public Date getAprDt() {
		return aprDt;
	}

	public void setAprDt(Date aprDt) {
		this.aprDt = aprDt;
	}

	public String getAprAuth() {
		return aprAuth;
	}

	public void setAprAuth(String aprAuth) {
		this.aprAuth = aprAuth;
	}

	public int getApl_area_cnt() {
		return apl_area_cnt;
	}

	public void setApl_area_cnt(int apl_area_cnt) {
		this.apl_area_cnt = apl_area_cnt;
	}

}
