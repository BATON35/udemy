package com.konrad.hibernate.demo;

import com.konrad.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentsDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Student student0 = new Student("Paul", "Wall", "adsfasdfr@pl");
            Student student1 = new Student("Michel", "Soil", "adsfasdfe@pl");
            Student student2 = new Student("Angelina", "Blow", "adsfasdfw@pl");
            session.beginTransaction();
            session.save(student0);
            session.save(student1);
            session.save(student2);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

