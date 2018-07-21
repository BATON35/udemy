package com.konrad.hibernate.demo;

import com.konrad.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UpdateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            List<Student> students = session.createQuery("from Student", Student.class).getResultList();
            Set<String> uniqueStudentsEmail = students.stream().map(x -> x.getEmail()).collect(Collectors.toSet());
//            uniqueStudentsEmail.stream().forEach(uniqueEmail -> {
//                        for (int i = students.size() - 1; i >= 0; i--) {
//                            if (students.get(i).getEmail().equals(uniqueEmail)) {
//                                students.get(i).setEmail(" " + i + " changed ffffffffff");
//                            }
//                        }
//                    }
//            );
            for (Student student : students) {
                System.out.println(student);
            }
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

