package com.ibm.assignment1.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.assignment1.service.RTCService;


@Controller
public class RTCController {

	@Autowired
	private RTCService rtcService;

	@RequestMapping("/show")
	public String showRTC(Model model){
		String rtcMsg = rtcService.getRtcInfo();
		model.addAttribute("rtcMsg", rtcMsg);
		return "index";
	}
}
