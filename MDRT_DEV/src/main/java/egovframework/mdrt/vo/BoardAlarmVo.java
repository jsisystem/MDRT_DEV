package egovframework.mdrt.vo;

import java.util.Date;

public class BoardAlarmVo {
	private int bordLogId;
	private int bordId;
	private String usrId;
	private String bordGubun;
	private int userNotiCnt;
	private int userQuesCnt;
	private int userErroCnt;
	private int notiCnt;
	private int quesCnt;
	private int erroCnt;
	
	
	public int getBordLogId() {
		return bordLogId;
	}
	public void setBordLogId(int bordLogId) {
		this.bordLogId = bordLogId;
	}
	public int getBordId() {
		return bordId;
	}
	public void setBordId(int bordId) {
		this.bordId = bordId;
	}
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	public String getBordGubun() {
		return bordGubun;
	}
	public void setBordGubun(String bordGubun) {
		this.bordGubun = bordGubun;
	}
	public int getUserNotiCnt() {
		return userNotiCnt;
	}
	public void setUserNotiCnt(int userNotiCnt) {
		this.userNotiCnt = userNotiCnt;
	}
	public int getUserQuesCnt() {
		return userQuesCnt;
	}
	public void setUserQuesCnt(int userQuesCnt) {
		this.userQuesCnt = userQuesCnt;
	}
	public int getUserErroCnt() {
		return userErroCnt;
	}
	public void setUserErroCnt(int userErroCnt) {
		this.userErroCnt = userErroCnt;
	}
	public int getNotiCnt() {
		return notiCnt;
	}
	public void setNotiCnt(int notiCnt) {
		this.notiCnt = notiCnt;
	}
	public int getQuesCnt() {
		return quesCnt;
	}
	public void setQuesCnt(int quesCnt) {
		this.quesCnt = quesCnt;
	}
	public int getErroCnt() {
		return erroCnt;
	}
	public void setErroCnt(int erroCnt) {
		this.erroCnt = erroCnt;
	}
	

	
	
	
}