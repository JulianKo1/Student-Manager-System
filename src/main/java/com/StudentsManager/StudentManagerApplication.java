package com.StudentsManager;

import com.StudentsManager.entity.Student;
import com.StudentsManager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class StudentManagerApplication /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagerApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

//    @Override
//    public void run(String... args) throws Exception {
//
//        Student st1 = new Student("Johny", "Silverhand", "jopa@maol.fu");
//        studentRepository.save(st1);
//
//        Student st2 = new Student("Vi", "Hui", "sup@maol.fu");
//        studentRepository.save(st2);
//
//        Student st3 = new Student("Gog", "Solo", "fro@maol.fu");
//        studentRepository.save(st3);
//
//    }


}
