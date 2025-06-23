package com.zubair.test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zubair.dao.ShowTimeDao;
import com.zubair.entity.Movie;
import com.zubair.entity.Multiplex;

public class TestShowTimeDao {
	private static ShowTimeDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new ShowTimeDao();
	}
	
	@Test
	public void testAddMovie() {
		Movie m = new Movie();
		m.setMovId(22);
		m.setTitle("Inception");
		dao.addMovie(m);
	}
	
	@Test
	public void testAddMultiplex() { 
		Multiplex m = new Multiplex();
		m.setMpexId(3);
		m.setName("PVR");
		dao.addMultiplex(m);
	}
	
	@Test
	public void testAddMovieToMultiplex() {
		dao.addMovieToMultiplex(22, 3);
	}
	
	@Test
	public void testRemoveMovie() {
		dao.removeMovie(21);
	}
	
	@Test
	public void testFindMovie() {
		Movie m = dao.findMovie(21);
		assertNotNull(m);
		System.out.println(m.getTitle());
		Set<Multiplex> multiplexs = m.getMultiplexes();
		for (Multiplex mx : multiplexs) {
			System.out.println(mx.getName());
		}
	}
	
	@Test
	public void testFindMultiplex() {
		Multiplex m = dao.findMultiplex(3);
		assertNotNull(m);
		System.out.println(m.getName());
		Set<Movie> movies = m.getMovies();
		for (Movie mv : movies) {
			System.out.println(mv.getTitle());
		}
	}
}
