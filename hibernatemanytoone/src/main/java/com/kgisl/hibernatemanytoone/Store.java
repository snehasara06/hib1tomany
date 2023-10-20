package com.kgisl.hibernatemanytoone;

import java.util.ArrayList;

// import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class Store 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hibernate many-to-one Configuration from Many Employee to One Address!" );

        // StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        // Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        // SessionFactory sf=meta.getSessionFactoryBuilder().build();
        // Session session=sf.openSession();

        // Transaction transaction;

        // Employee e1=new Employee();

        // e1.setName("Madhumitha");
        // e1.setEmail("123@gmail.com");

        // Employee e2 = new Employee();

        // e2.setName("Kiruthika");
        // e2.setEmail("345@gmail.com");

        // Address a1=new Address();

        // a1.setAddressLine1("No 2, NorthStreet");
        // a1.setCity("Palladam");
        // a1.setState("Tamilnadu");
        // a1.setCountry("India");
        // a1.setPincode(123234);

        // // Address a2=new Address();

        // // a2.setAddressLine1("No 34, SouthStreet");
        // // a2.setCity("Tirupur");
        // // a2.setState("Tamilnadu");
        // // a2.setCountry("India");
        // // a2.setPincode(123234);

        // // transaction=session.beginTransaction();
        // // session.remove(a1);
        // // transaction.commit();

        // transaction=session.beginTransaction();

        // e1.setAddress(a1);
        // e2.setAddress(a1);

        // session.persist(e1);
        // session.persist(e2);

        // transaction.commit();
        
        
        // //remove e1
        // // transaction=session.beginTransaction();
        // // session.remove(e1);
        // // transaction.commit();

    
        // // transaction.commit();

        // session.close();

        // System.out.println("Successfully executed many-to-one from Many Employee to One Address");


        //from Many Address to One Employee!

        // System.out.println( "Hibernate many-to-one Configuration from Many Address to One Employee!" );

        // StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        // Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        // SessionFactory sf=meta.getSessionFactoryBuilder().build();
        // Session session=sf.openSession();

        // Transaction  transaction=session.beginTransaction();

        // Address a1=new Address();

        // a1.setAddressLine1("No 2, NorthStreet");
        // a1.setCity("Palladam");
        // a1.setState("Tamilnadu");
        // a1.setCountry("India");
        // a1.setPincode(123234);

        // Address a2=new Address();

        // a2.setAddressLine1("No 34, SouthStreet");
        // a2.setCity("Tirupur");
        // a2.setState("Tamilnadu");
        // a2.setCountry("India");
        // a2.setPincode(123234);

        // Employee e1=new Employee();

        // e1.setName("Keerthi");
        // e1.setEmail("678@gmail.com");
        
        // a1.setEmployee(e1);
        // a2.setEmployee(e1);

        // transaction=session.beginTransaction();
        // session.remove(a1);
        // transaction.commit();

        // session.persist(a1);
        // session.persist(a2);

        // transaction.commit();
        
        
        //remove e1
        // transaction=session.beginTransaction();
        // session.remove(e1);
        // transaction.commit();

    
        // transaction.commit();

        // session.close();

        // System.out.println("Successfully executed from Many Address to One Employee");




         //from One Address to One Employee!

         System.out.println( "Hibernate one-to-one Configuration from One Address to One Employee!" );

         StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
         Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
 
         SessionFactory sf=meta.getSessionFactoryBuilder().build();
         Session session=sf.openSession();
 
         Transaction  transaction=session.beginTransaction();
 
         Address a1=new Address();
 
         a1.setAddressLine1("No 2, NorthStreet");
         a1.setCity("Palladam");
         a1.setState("Tamilnadu");
         a1.setCountry("India");
         a1.setPincode(123234);
 
         Address a2=new Address();
 
         a2.setAddressLine1("No 34, SouthStreet");
         a2.setCity("Tirupur");
         a2.setState("Tamilnadu");
         a2.setCountry("India");
         a2.setPincode(123234);
 
         Employee e1=new Employee();
 
         e1.setName("Keerthi");
         e1.setEmail("678@gmail.com");

         
         Employee e2=new Employee();
         
         e2.setName("Nithya");
         e2.setEmail("798@gmail.com");

         e1.setAddress(a1);
         e2.setAddress(a2);
         
         a1.setEmployee(e1);
         a2.setEmployee(e2);
 
         // transaction=session.beginTransaction();
         // session.remove(a1);
         // transaction.commit();
 
         session.persist(e1);
         session.persist(e2);
 
         transaction.commit();
         
         
         //remove e1
         // transaction=session.beginTransaction();
         // session.remove(e1);
         // transaction.commit();
 
     
         // transaction.commit();
 
         session.close();
 
         System.out.println("Successfully executed from One Address to One Employee");


        //from One Owner to Many Cars

        // System.out.println("Hibernate Configuration from One Owner to Many Cars");
        //  StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        //  Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
 
        //  SessionFactory sf=meta.getSessionFactoryBuilder().build();
        //  Session session=sf.openSession();
 
        //  Transaction  transaction=session.beginTransaction();
 

        //  Car c1=new Car();
        //  c1.setCarBrand("vitara");
        //  c1.setCarColor("blue");


        //  Car c2=new Car();
        //  c2.setCarBrand("vitara");
        //  c2.setCarColor("white");


        //  Car c3=new Car();
        //  c3.setCarBrand("tata");
        //  c3.setCarColor("violet");

        

        //  Car c4=new Car();
        //  c4.setCarBrand("tata");
        //  c4.setCarColor("red");

        //  ArrayList<Car> list1=new ArrayList<Car>();
        //  list1.add(c1);
        //  list1.add(c2);

        //  ArrayList<Car> list2=new ArrayList<Car>();
        //  list2.add(c3);
        //  list2.add(c4);

        //  Owner o1=new Owner();

        //  o1.setOwnerName("Madhu");
        //  o1.setCars(list1);

         
        //  Owner o2=new Owner();

        //  o2.setOwnerName("Abdul");
        //  o2.setCars(list2);

        //  session.persist(o1);
        //  session.persist(o2);

        //  transaction.commit();
        //  session.close();

        //  System.out.println("Stored Successfully (from One Owner to Many Cars )");
     }
    }




