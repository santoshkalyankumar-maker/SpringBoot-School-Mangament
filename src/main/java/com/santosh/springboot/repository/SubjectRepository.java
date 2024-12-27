package com.santosh.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.santosh.springboot.Entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
