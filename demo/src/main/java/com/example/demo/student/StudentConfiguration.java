package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository SR) {
        return args -> {
            Student S1 = new Student(
                    "A",
                    "B",
                    LocalDate.of(1998, 11, 2),
                    24
            );

            Student S2 = new Student(
                    "C",
                    "D",
                    LocalDate.of(2001, 6, 3),
                    21
            );

            SR.saveAll(
                    List.of(S1, S2)
            );
        };
    }
}
