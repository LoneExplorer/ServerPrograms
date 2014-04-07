package edu.cst.nyt.jpa.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.cst.nyt.jpa.model.People;
import edu.cst.nyt.jpa.model.Title;

public class MainTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("08.Lesson");//08.Lesson in persistance.xml

		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Title> result = entityManager.createQuery("from Title t",//connects to title table. Remember to use 'Title t' and not title because you are not sending a query to the database, but rather a call to the object which would call the database through preprogrammed commands 
				Title.class).getResultList();
		for (Title title : result) {//loops though each table row in order to make that row equal a line in result
			System.out.println("Title (" + title.getTitleId() + ") : "
					+ title.getDescription());
		}

		List<People> result2 = entityManager.createQuery("from People p",//connects to people table. 
				People.class).getResultList();
		for (People people : result2) {
			System.out.println("People (" + people.getPeopleId() + ") : "
					+ people.getFirstName());
		}
		entityManager.close();

	}

}
