package org.ashu;

import jakarta.transaction.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

     void main(String[] args) {

//        Student s1 = new Student();
//        s1.setsName("Neo");
//        s1.setRollNo(22);
//        s1.setsAge(19);

//        Student s2 = null;
         Laptop l1 = new Laptop();
         l1.setLid(1);
         l1.setBrand("Acer");
         l1.setModel("V15");
         l1.setRam(16);


         Laptop l2 = new Laptop();
         l2.setLid(2);
         l2.setBrand("Dell");
         l2.setModel("XPS");
         l2.setRam(32);



        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setAname("Ashu");
        a1.setTech("Backend Dev");
        a1.setLaptops(Arrays.asList(l1,l2));

         l1.setAlien(a1);
         l2.setAlien(a1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.ashu.Alien.class)
                .addAnnotatedClass(org.ashu.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

//        s1 = session.get(Student.class, 22);

//        s2 = session.get(Student.class,22);
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(a1);

//        session.remove(s1);
//        session.merge(s1);
//        session.persist(s1);
        transaction.commit();

        Alien a2 = session.find(Alien.class, 1);
         System.out.println(a2);


        session.close();
        sf.close();
//        System.out.println(s1);
        System.out.println(a1);

    }
}
