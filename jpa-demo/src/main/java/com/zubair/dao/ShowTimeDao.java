package com.zubair.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.zubair.entity.Movie;
import com.zubair.entity.Multiplex;

public class ShowTimeDao {
	private EntityManagerFactory factory;
	
	public ShowTimeDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public void addMovie(Movie movie) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(movie);
		txn.commit();
		em.close();
	}
	
	public void addMultiplex(Multiplex multiplex) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(multiplex);
		txn.commit();
		em.close();
	}
	
	public void addMovieToMultiplex(int movId, int mpexId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			Movie movie = em.find(Movie.class, movId);
			Multiplex multiplex = em.find(Multiplex.class, mpexId);
			movie.getMultiplexes().add(multiplex);
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
		} finally {
			em.close();
		}
	}
	
	public void removeMovie(int movId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Movie movie = em.find(Movie.class, movId);
		em.remove(movie);
		txn.commit();
		em.close();
	}
	
	public Movie findMovie(int movId) {
		EntityManager em = factory.createEntityManager();
		Movie m = em.find(Movie.class, movId);
		return m;
	}
	
	public Multiplex findMultiplex(int mpexId) {
		EntityManager em = factory.createEntityManager();
		Multiplex m = em.find(Multiplex.class, mpexId);
		return m;
	}
}
