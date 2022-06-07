package com.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ft.otp.verify.OTPVerify;

@RestController
public class OTPVerifyController {

	/**
	 * 认证接口
	 */
	@PostMapping(value = "/OTPVerify/ET_CheckPwdz201")
	public Map ET_CheckPwdz201(@RequestBody CheckPwdz entity) {
		return checkPwdz201(
			entity.getSeed(), 
			entity.getsOTP(), 
			entity.getiDrift(), 
			entity.getlSucc());
	}

	/**
	 * 同步接口
	 */
	@PostMapping(value = "/OTPVerify/ET_Syncz201")
	public Map ET_Syncz201(@RequestBody Syncz entity) {
		return syncPwdz201(
			entity.getSeed(), 
			entity.getsOTP1(), 
			entity.getsOTP2(),
			entity.getiDrift(), 
			entity.getlSucc());
	}

	// ET z201验证接口调用
	private static Map checkPwdz201(String seed, String sOTP, int iDrift, long lSucc) {
		return OTPVerify.ET_CheckPwdz201(seed, // 令牌密钥
			System.currentTimeMillis() / 1000, // 调用本接口计算机的当前时间
			0, // 给0
			60, // 给60，因为每60秒变更新的动态口令
			iDrift, // 漂移值，用于调整硬件与服务器的时间偏差，见手册说明
			20, // 认证窗口，见手册说明
			lSucc, // 成功值，用于调整硬件与服务器的时间偏差，见手册说明
			sOTP); // 要认证的动态口令OTP
	}

	// ET z201同步接口调用
	private static Map syncPwdz201(String seed, String sOTP1, String sOTP2, int iDrift, long lSucc) {
		return OTPVerify.ET_Syncz201(
			seed, 
			System.currentTimeMillis() / 1000, 
			0, 
			60, 
			iDrift, 
			40, 
			lSucc, 
			sOTP1, 
			sOTP2);
	}

}
