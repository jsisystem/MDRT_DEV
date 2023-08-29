package egovframework.mdrt.vo;

import java.util.Date;

public class UserVo extends PageVo{
	private String usrId;
	private String usrPw;
	private String usrNm;
	private String usrEm;
	private String usrBl;
	private String usrTel;
	private Date insDt;
	private String insUsr;
	private String regDate;
	private String agrYn;
	private String usrYn;
	private String useYn;
	private String usrArea;
	
	private String searchAuth;
	private String searchUsrYn;
	private String searchUsrArea;
	
	

	public String getUsrArea() {
		return usrArea;
	}

	public void setUsrArea(String usrArea) {
		this.usrArea = usrArea;
	}

	public String getSearchAuth() {
		return searchAuth;
	}

	public void setSearchAuth(String searchAuth) {
		this.searchAuth = searchAuth;
	}

	public String getSearchUsrYn() {
		return searchUsrYn;
	}

	public void setSearchUsrYn(String searchUsrYn) {
		this.searchUsrYn = searchUsrYn;
	}

	public String getSearchUsrArea() {
		return searchUsrArea;
	}

	public void setSearchUsrArea(String searchUsrArea) {
		this.searchUsrArea = searchUsrArea;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getUsrPw() {
		return usrPw;
	}

	public void setUsrPw(String usrPw) {
		this.usrPw = usrPw;
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public String getUsrEm() {
		return usrEm;
	}

	public void setUsrEm(String usrEm) {
		this.usrEm = usrEm;
	}

	public String getUsrBl() {
		return usrBl;
	}

	public void setUsrBl(String usrBl) {
		this.usrBl = usrBl;
	}

	public String getUsrTel() {
		return usrTel;
	}

	public void setUsrTel(String usrTel) {
		this.usrTel = usrTel;
	}

	public Date getInsDt() {
		return insDt;
	}

	public void setInsDt(Date insDt) {
		this.insDt = insDt;
	}

	public String getInsUsr() {
		return insUsr;
	}

	public void setInsUsr(String insUsr) {
		this.insUsr = insUsr;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getAgrYn() {
		return agrYn;
	}

	public void setAgrYn(String agrYn) {
		this.agrYn = agrYn;
	}

	public String getUsrYn() {
		return usrYn;
	}

	public void setUsrYn(String usrYn) {
		this.usrYn = usrYn; 
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	

}
