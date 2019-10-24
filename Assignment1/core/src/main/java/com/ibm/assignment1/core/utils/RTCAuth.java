package com.ibm.assignment1.core.utils;

public class RTCAuth {
	private static String RtcUserId = "caojwh@cn.ibm.com";
	private static String RtcPassword = "dog.pig.ice-123";
	private static String RtcProjectName = "";
	private static String RtcRepositoryAddress = "";
	public static String getRtcUserId() {
		return RtcUserId;
	}
	public static void setRtcUserId(String rtcUserId) {
		RtcUserId = rtcUserId;
	}
	public static String getRtcPassword() {
		return RtcPassword;
	}
	public static void setRtcPassword(String rtcPassword) {
		RtcPassword = rtcPassword;
	}
	public static String getRtcProjectName() {
		return RtcProjectName;
	}
	public static void setRtcProjectName(String rtcProjectName) {
		RtcProjectName = rtcProjectName;
	}
	public static String getRtcRepositoryAddress() {
		return RtcRepositoryAddress;
	}
	public static void setRtcRepositoryAddress(String rtcRepositoryAddress) {
		RtcRepositoryAddress = rtcRepositoryAddress;
	}



}
