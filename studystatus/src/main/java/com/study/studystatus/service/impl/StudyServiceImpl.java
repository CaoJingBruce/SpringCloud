package com.study.studystatus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.studystatus.domain.StudyStatus;
import com.study.studystatus.repository.StudyStatusRepository;
import com.study.studystatus.service.StudyService;

@Service
public class StudyServiceImpl implements StudyService{

	@Autowired
	private StudyStatusRepository studyRepo;

	@Override
	public void save(StudyStatus studyStatus) {
		// TODO Auto-generated method stub
		studyRepo.save(studyStatus);
	}

	@Override
	public Iterable<StudyStatus> findAll() {
		// TODO Auto-generated method stub
		return studyRepo.findAll();
	}

	@Override
	public StudyStatus findById(long id) {
		// TODO Auto-generated method stub
		return studyRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	}

	@Override
	public void delete(StudyStatus studyStatus) {
		// TODO Auto-generated method stub
		studyRepo.delete(studyStatus);
	}

}
