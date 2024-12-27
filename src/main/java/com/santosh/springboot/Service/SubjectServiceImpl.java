package com.santosh.springboot.Service;



import com.santosh.springboot.Entity.Subject;

import com.santosh.springboot.repository.SubjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements IsubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectById(Long subjectId) {
        return subjectRepository.findById(subjectId)
                .orElseThrow();
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject updateSubject(Long subjectId, Subject updatedSubject) {
        Subject existingSubject = getSubjectById(subjectId);
        existingSubject.setName(updatedSubject.getName());
        existingSubject.setClassId(updatedSubject.getClassId());
        existingSubject.setSyllabus(updatedSubject.getSyllabus());
        existingSubject.setTeacherId(updatedSubject.getTeacherId());
        return subjectRepository.save(existingSubject);
    }

    @Override
    public void deleteSubject(Long subjectId) {
        Subject existingSubject = getSubjectById(subjectId);
        subjectRepository.delete(existingSubject);
    }
}
