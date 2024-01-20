package com.example.springrestapi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mohamed",
                        22,
                        LocalDate.of(2002, Month.FEBRUARY, 5),
                        "abdabdulla78@gmail.com"
                )
        );
    }
}
