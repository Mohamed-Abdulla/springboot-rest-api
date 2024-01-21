package com.example.springrestapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mohamed = new Student(
                    "Mohamed",
                    LocalDate.of(2002, Month.FEBRUARY, 12),
                    "mohamedabdulla.web@gmail.com"
            );
            Student abdulla = new Student(
                    "abdulla",
                    LocalDate.of(2002, Month.FEBRUARY, 12),
                    "abdabdulla78@gmail.com"
            );

            //save to db
//            repository.saveAll(
//                    List.of(mohamed,abdulla)
//            );
        };
    }
}
