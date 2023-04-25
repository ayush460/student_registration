package com.example.Student_crued.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studentName;
    private int fees;
    private String course;
    @Column(length = 10)
    private String mobNo;

    private String email;
    @Column(length = 200)
    private String address;
    private Date dateOfBirth;
    private String year;

}
