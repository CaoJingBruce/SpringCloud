package com.ibm.assignment.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.assignment.webapp.service.RTCService;


@Controller
public class RTCController {

	@Autowired
	private RTCService rtcService;

	@RequestMapping("/show")
	public String showRTC(Model model){
		String rtcMsg = rtcService.showRTCInfo();
		model.addAttribute("rtcMsg", rtcMsg);
		return "index";
	}
}
