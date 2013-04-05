package com.project.business.domain.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.project.business.entity.Person;
import com.project.transaction.utils.HibernateUtil;


public class PersonTestMain {

	public static void main(String[] args) {
		
		// Read
		System.out.println("******* READ PERSON*******");
		List<Person> persons = list();
		System.out.println("Total persons: " + persons.size());
		Person personRead = read("41452973G");
		System.out.println("Found person from 'person' table: " + personRead.getDni() + "," + personRead.getFirstname() + "," + personRead.getSurname());
		
		// Write
		System.out.println("******* ADD PERSON *******");
		Person personSaved = new Person("66666G", 
								 "Ramon6", 
								 "Albareda6", 
								 'F', 
								 "raj@g6.com",
								 "Barcelona6",
								 new Date());
		personSaved = save(personSaved);
		System.out.println("Added person to 'person' table: " + personSaved.getDni() + "," + personSaved.getFirstname() + "," + personSaved.getSurname());
		
		
//		// Update
//		System.out.println("******* UPDATE *******");
//		Person person2 = read("41452973G"); // read person with DNI 12345678A
//		System.out.println("Name before Update:" + person2.getFirstname());
//		person2.setFirstname("James");
//		update(person2);	// save the updated personoyee details
//		
//		person2 = read("41452973G"); // read again person with DNI 23498191B
//		System.out.println("Name after Update:" + person2.getFirstname());
//		
//		
//		// Delete
//		System.out.println("******* DELETE *******");
//		delete(person); 
//		Person person3 = read(person.getDni());
//		System.out.println("Object:" + person3);
	}

	@SuppressWarnings("unchecked")
	private static List<Person> list() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		List<Person> persons = session.createQuery("from Person").list();
		session.close();
		return persons;
	}
	private static Person read(String dni) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Person person = (Person) session.get(Person.class, dni);
		session.close();
		return person;
	}
	private static Person save(Person person) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();

		String dni = (String) session.save(person);
		person.setDni(dni);
		
		session.getTransaction().commit();
		
		session.close();

		return person;
	}

	private static Person update(Person person) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();

		session.merge(person);
		
		session.getTransaction().commit();
		
		session.close();
		return person;
	}

	private static void delete(Person person) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.delete(person);
		
		session.getTransaction().commit();
		
		session.close();
	}
	
}
