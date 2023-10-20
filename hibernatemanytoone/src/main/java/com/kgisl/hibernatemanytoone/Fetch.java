package com.kgisl.hibernatemanytoone;

import javax.persistence.TypedQuery;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
// import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main( String[] args )
    {
        // System.out.println( "Hibernate many-to-one Configuration from Many Employee to One Address!" );

        // StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        // Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        // SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        // Session session=factory.openSession();  

        // TypedQuery query=session.createQuery("from Employee e");

        // List<Employee> list=query.getResultList();

        // Iterator<Employee> itr=list.iterator();

        // while(itr.hasNext())
        // {
        //     Employee emp=itr.next();
        //     System.out.println("***********Employee Details are*********");
        //     System.out.println(emp.getName()+" "+emp.getEmail());

        //     Address add=emp.getAddress();
        //     System.out.println("***********Employee Address Details are*********");
        //     System.out.println(add.getAddressLine1()+" "+add.getCity()+" "+add.getState()+" "+add.getCountry()+" "+add.getCountry());

        // }

        // session.close();
        // System.out.println("Fetched Success from Many Employee to One Address");


        //from Many Address to One Employee

        // System.out.println( "Hibernate many-to-one Configuration from Many Address to One Employee!" );

        // StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        // Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        // SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        // Session session=factory.openSession();  

        // TypedQuery query=session.createQuery("from Address a");

        // List<Address> list=query.getResultList();

        // Iterator<Address> itr=list.iterator();

        // while(itr.hasNext())
        // {
        //     Address add=itr.next();
        //     System.out.println("***********Employee Address Details are*********");
        //     System.out.println(add.getAddressLine1()+" "+add.getCity()+" "+add.getState()+" "+add.getCountry()+" "+add.getPincode());

        //     Employee emp=add.getEmployee();
        //     System.out.println("***********Employee Address Details are*********");
        //     System.out.println(emp.getName()+emp.getEmail());

        // }

        // session.close();
        // System.out.println("Fetched Success from Many Address to One Employee");

        

         //from One Address to One Employee

         System.out.println( "Hibernate many-to-one Configuration from One Address to One Employee!" );

         
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        TypedQuery<Address> query = session.createQuery("FROM Address", Address.class);
        List<Address> list = query.getResultList();

        System.out.println(list.size());

        Iterator<Address> itr = list.iterator();

        while (itr.hasNext()) {
            Address add = itr.next();
            System.out.println("***********Employee Address Details are*********");
            System.out.println(
                    add.getAddressId() + " " + add.getAddressLine1() + " " + add.getCity() + " " + add.getState()
                            + " " + add.getCountry() + " " + add.getPincode() + " " + add.getEmployee());

            Employee emp = add.getEmployee();
            System.out.println("***********Employee Details are*********");
            System.out.println(emp.getName() + " " + emp.getEmail());

        }
 
         session.close();
         System.out.println("Fetched Success from One Address to One Employee");
 


        //form One Owner to Many Cars
        // System.out.println("Hibernate Configuration from One Owner to Many Cars");

        // StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernateconfig.xml").build();
        // Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        // SessionFactory factory = meta.getSessionFactoryBuilder().build();
        // Session session = factory.openSession();

        // TypedQuery<Owner> query = session.createQuery("FROM Owner", Owner.class);
        // List<Owner> list = query.getResultList();

        // System.out.println(list.size());

        // Iterator<Owner> itr = list.iterator();
        //  while(itr.hasNext())
        //  {
        //     Owner o = itr.next();
        //     System.out.println("**********Owner Details***********");
        //     System.out.println(o.getOwnerName()+" ");

        //  List<Car> list2=o.getCars();
        //  Iterator<Car> itr2=list2.iterator();

        //  while(itr2.hasNext())
        //  {
        //     Car c=itr2.next();
        //     System.out.println("**********Car Details***********");
        //     System.out.println(c.getCarBrand()+" "+c.getCarColor());
        //  }

        //  }

        //  session.close();
        //  System.out.println("Successfully Fetched Details for One Owner to Many Cars");
}
}