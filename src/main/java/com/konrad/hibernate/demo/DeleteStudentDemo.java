package com.konrad.hibernate.demo;

import com.konrad.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
           // Student student = session.get(Student.class,  5);
         //   session.delete(student);
            session.createQuery("delete from Student where id < 11").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

