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
            String  sql = "from Student s where s.firstName = 'Paul' and s.id =29";
            String  sqlKonrad = "from Student s where s.firstName = 'Konrad'";
            String sqlEndedBy = "from Student s where s.email like '%.com'";
            session.beginTransaction();
            List<Student> students = session.createQuery( sqlEndedBy, Student.class).getResultList();
             session.getTransaction().commit();
            for (Student student : students) {
                System.out.println(student);
            }
        } finally {
            factory.close();
        }
    }
}
