package com.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.model.Actor;
import com.spring.model.Genre;
import com.spring.model.Movie;
import com.spring.repository.ActorRepository;
import com.spring.repository.GenreRepository;
import com.spring.repository.MovieRepository;

@Controller
public class RepositoryController  {
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Autowired
	private ActorRepository actorRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	public void run() {
		//Inserting
		
		// GenreRepository....
		Genre g1 = new Genre("Action",null);
		Genre g2 = new Genre("Comedy",null);
		
		//Saving objects of type Genre to the database
		genreRepository.save(g1);
		genreRepository.save(g2);
		
		
		// ActorRepository.....

		//inserting the values of Actor's
		Actor a1 = new Actor("Allu","Arjun",1982,null);
		Actor a2 = new Actor("Ram","Charan",1985,null);
		
		Actor a3 = new Actor("Akshay","Kumar",1967,null);
		Actor a4 = new Actor("Ritesh","Deshmukh", 1978,null);
		
		//Saving objects of type Actor to the database
		actorRepository.save(a1);
		actorRepository.save(a2);
		actorRepository.save(a3);
		actorRepository.save(a4);	

		// MovieRepository....
		
		Movie m1 = new Movie("Yevadu",2014 ,null,g1);
		Movie m2 = new Movie("Housefull",2000 ,null,g2);
		
		// adding Movie records to the database
		movieRepository.save(m1);
		movieRepository.save(m2);
		
		//Displaying
		//searching Actor records by name
		System.out.println("\n\n Searching Actor records by name : \n ");
		Actor actor1 = actorRepository.findByName("Ram");
				
		System.out.println(actor1.getId());
		System.out.println(actor1.getName());
		System.out.println(actor1.getLast_name());
		System.out.println(actor1.getYear_of_birth());
		
		//searching for Actor records by id
		System.out.println("\n\n Searching for Actor records by id : \n ");
		Actor actor= actorRepository.findById(1L).get();
		
		System.out.println(actor.getId());
		System.out.println(actor.getName());
		System.out.println(actor.getLast_name());
		System.out.println(actor.getYear_of_birth());
		
		// returning all Actor records
		System.out.println("\n\n Returning all Actor records : \n ");
		List<Actor> actor2 = actorRepository.findAll();
		
		actor2.forEach((a) -> {
	            System.out.println(a.getId());
	            System.out.println(a.getName());
	            System.out.println(a.getLast_name());
	            System.out.println(a.getYear_of_birth());
	      });
		
		//removing Actor record by id from the database
		System.out.println("\n\n Removing Actor record by id from the database : \n ");
		
		actorRepository.deleteById(1L);
		
		System.out.println("\n\n Returning all Actor records after removing : \n ");
		List<Actor> actor3 = actorRepository.findAll();
		
		actor3.forEach((a) -> {
            System.out.println(a.getId());
            System.out.println(a.getName());
            System.out.println(a.getLast_name());
            System.out.println(a.getYear_of_birth());
		});
		
		// searching for Genre records by name
		System.out.println("\n\n Searching for Genre records by name : \n ");
		Genre genre1 = genreRepository.findByName("Action");
				
		System.out.println(genre1.getId());
		System.out.println(genre1.getName());
		
		//searching for Genre records by id
		System.out.println("\n\n Searching for Genre records by id : \n ");
		Genre genre = genreRepository.findById(1L).get();
		
		System.out.println(genre.getId());
		System.out.println(genre.getName());
		
		// returning all Genre records
		System.out.println("\n\n Returning all Genre records : \n ");
		List<Genre> genre2 = genreRepository.findAll();
		
		genre2.forEach((g) -> {
	            System.out.println(g.getId());
	            System.out.println(g.getName());
	      });
		
		//removing Genre records from the database
		System.out.println("\n\n Removing Genre records from the database : \n ");
		
		genreRepository.deleteById(1L);
		
		System.out.println("\n\n Returning all Genre records after removing : \n ");
		List<Genre> genre3 = genreRepository.findAll();
		
		genre3.forEach((g) -> {
            System.out.println(g.getId());
            System.out.println(g.getName());
			});
		
		//searching Movie records by title
		System.out.println("\n\n Searching Movie records by title : \n ");
		Movie movie1 = movieRepository.findByTitle("Yevadu");
				
		System.out.println(movie1.getId());
		System.out.println(movie1.getTitle());
		System.out.println(movie1.getYear_of_release());
		
		//searching for Movie records by id
		System.out.println("\n\n Searching for Movie records by id : \n ");
		Movie movie = movieRepository.findById(1L).get();
		
		System.out.println(movie.getId());
		System.out.println(movie.getTitle());
		System.out.println(movie.getYear_of_release());
		
		// removing Movie records from the database
		System.out.println("\n\n Removing Movie records from the database : \n ");
		
		movieRepository.deleteById(1L);
		
		System.out.println("\n\n Returning all Genre records after removing : \n ");
		List<Movie> movie3 = movieRepository.findAll();
		
		movie3.forEach((m) -> {
            System.out.println(m.getId());
            System.out.println(m.getTitle());
            System.out.println(m.getYear_of_release());     
			});
		
		// returning all Movie records
		System.out.println("\n\n Returning all Movie records : \n ");
		List<Movie> movie2 = movieRepository.findAll();
		
		movie2.forEach((m) -> {
	            System.out.println(m.getId());
	            System.out.println(m.getTitle());
	            System.out.println(m.getYear_of_release());         
	      });
	}
}