package org.ashu;

import jakarta.transaction.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
//        s1.setsName("Neo");
//        s1.setRollNo(22);
//        s1.setsAge(19);

//        Student s2 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.ashu.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        s1 = session.get(Student.class, 22);

//        s2 = session.get(Student.class,22);
        Transaction transaction = session.beginTransaction();

        session.remove(s1);
//        session.merge(s1);
//        session.persist(s1);
        transaction.commit();

        session.close();
        sf.close();
//        System.out.println(s1);
        System.out.println(s1);

    }
}
