package com.ibm.assignment.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.assignment.service.utils.RTCUtils;



@Service
public class RTCService {

	@Autowired
	private RTCUtils rtcUtils;

	public String showRTCInfo(){
		return rtcUtils.getRtcInfo();
	}
}
