package com.controller;


public class Syncz {
	private static final long serialVersionUID = 1L;
	
	private String seed;
	private String sOTP1;
	private String sOTP2;
	private int iDrift;
	private long lSucc;
	
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}

	public String getsOTP1() {
		return sOTP1;
	}
	public void setsOTP1(String sOTP1) {
		this.sOTP1 = sOTP1;
	}
	
	public String getsOTP2() {
		return sOTP2;
	}
	public void setsOTP2(String sOTP2) {
		this.sOTP2 = sOTP2;
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
