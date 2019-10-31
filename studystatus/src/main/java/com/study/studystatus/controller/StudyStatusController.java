package com.study.studystatus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.studystatus.domain.StudyStatus;
import com.study.studystatus.service.StudyService;

@Controller
public class StudyStatusController {

	@Autowired
	private StudyService service;

	@GetMapping("/inputstudy")
    public String showInputStatusForm(StudyStatus studyStatus) {
        return "add-study";
    }

	@PostMapping("/addstudy")
    public String addStudy(@Valid StudyStatus studyStatus, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-study";
        }

        service.save(studyStatus);
        model.addAttribute("studys", service.findAll());
        return "index";
    }

	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		StudyStatus studyStatus = service.findById(id);

	    model.addAttribute("studystatus", studyStatus);
	    return "update-study";
	}

	@PostMapping("/update/{id}")
	public String updateStudy(@PathVariable("id") long id, @Valid StudyStatus studyStatus,
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	    	studyStatus.setId(id);
	        return "update-study";
	    }

	    service.save(studyStatus);
	    model.addAttribute("studys", service.findAll());
	    return "index";
	}

	@GetMapping("/delete/{id}")
	public String deleteStudy(@PathVariable("id") long id, Model model) {
		StudyStatus studyStatus = service.findById(id);
		service.delete(studyStatus);
	    model.addAttribute("studys", service.findAll());
	    return "index";
	}

}
