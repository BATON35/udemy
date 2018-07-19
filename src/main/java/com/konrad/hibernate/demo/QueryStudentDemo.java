package com.konrad.hibernate.demo;

import com.konrad.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            List<Student> students = session.createQuery("from Student s where s.firstName = 'Paul'", Student.class).getResultList();
            session.getTransaction().commit();
            for (Student student : students) {
                System.out.println(student);
            }
        } finally {
            factory.close();
        }
    }
}
