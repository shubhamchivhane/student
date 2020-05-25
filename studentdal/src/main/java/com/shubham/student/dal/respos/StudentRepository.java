package com.shubham.student.dal.respos;

import org.springframework.data.repository.CrudRepository;

import com.shubham.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
