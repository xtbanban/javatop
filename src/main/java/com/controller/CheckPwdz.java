package com.controller;


public class CheckPwdz {
	private static final long serialVersionUID = 1L;
	
	private String seed;
	private String sOTP;
	private int iDrift;
	private long lSucc;
	
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}

	public String getsOTP() {
		return sOTP;
	}
	public void setsOTP(String sOTP) {
		this.sOTP = sOTP;
	}

	public int getiDrift() {
		return iDrift;
	}
	public void setiDrift(int iDrift) {
		this.iDrift = iDrift;
	}
	
	public long getlSucc() {
		return lSucc;
	}
	public void setlSucc(long lSucc) {
		this.lSucc = lSucc;
	}
}
