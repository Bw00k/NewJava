package baord;

import java.util.Date;

public class LogVO {

	private int u_NUM; // Primary Key
	private String u_ID; // 아이디
	private String u_PW; // 비밀번호
	private String u_MAIL; // 이메일
	private Date u_DATE; // 가입일

	@Override
	public String toString() {

		return "LogVO [U_NUM" + u_NUM 
				+ "U_ID=" + u_ID 
				+ ", U_PW=" + u_PW 
				+ ", U_MAIL=" 
				+ u_MAIL + "]";
	}

	public int getU_NUM() {
		return u_NUM;
	}

	public void setU_NUM(int u_NUM) {
		this.u_NUM = u_NUM;
	}

	public String getU_ID() {
		return u_ID;
	}

	public void setU_ID(String u_ID) {
		this.u_ID = u_ID;
	}

	public String getU_PW() {
		return u_PW;
	}

	public void setU_PW(String u_PW) {
		this.u_PW = u_PW;
	}

	public String getU_MAIL() {
		return u_MAIL;
	}

	public void setU_MAIL(String u_MAIL) {
		this.u_MAIL = u_MAIL;
	}

	public Date getU_DATE() {
		return u_DATE;
	}

	public void setU_DATE(Date u_DATE) {
		this.u_DATE = u_DATE;
	}

}
