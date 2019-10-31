package com.study.studystatus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.study.studystatus.domain.StudyStatus;

@Repository
public interface StudyStatusRepository extends CrudRepository<StudyStatus, Long> {

}
