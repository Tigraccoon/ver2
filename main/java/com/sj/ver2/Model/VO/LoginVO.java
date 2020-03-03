package com.sj.ver2.Model.VO;


public class LoginVO {
	private String USER_ID;
	private String USER_NAME;
	private String USER_PWD;
	private String ADMIN_YN;
	
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_PWD() {
		return USER_PWD;
	}
	public void setUSER_PWD(String uSER_PWD) {
		USER_PWD = uSER_PWD;
	}
	public String getADMIN_YN() {
		return ADMIN_YN;
	}
	public void setADMIN_YN(String aDMIN_YN) {
		ADMIN_YN = aDMIN_YN;
	}
	@Override
	public String toString() {
		return "LoginVO [USER_ID=" + USER_ID + ", USER_NAME=" + USER_NAME + ", USER_PWD=" + USER_PWD + ", ADMIN_YN="
				+ ADMIN_YN + "]";
	}
	
	
}
