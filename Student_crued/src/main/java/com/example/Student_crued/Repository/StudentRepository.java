package com.example.Student_crued.Repository;

import com.example.Student_crued.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository<student> extends JpaRepository<Student,Integer>
{

}
