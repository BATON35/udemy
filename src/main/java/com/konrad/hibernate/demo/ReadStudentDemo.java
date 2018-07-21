package com.konrad.hibernate.demo;

import com.konrad.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Student student = new Student( "Paul", "Wall", "adsfasdf@pl");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Student myStudent = session.get(Student.class, 4);
            System.out.println("\n\n\n" + myStudent + "\n\n");
            session.getTransaction().commit();

        } finally {
            System.out.println("Factory closed !!!!!!!!!!!!!!!!!!!!!!!!!!");
            factory.close();
        }
    }
}
