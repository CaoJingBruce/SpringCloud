package com.study.studystatus.service;

import com.study.studystatus.domain.StudyStatus;

public interface StudyService {

	void save(StudyStatus studyStatus);

	Iterable<StudyStatus> findAll();

	StudyStatus findById(long id);

	void delete(StudyStatus studyStatus);

}
