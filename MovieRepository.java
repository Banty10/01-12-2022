package com.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Movie;

@Repository
public class MovieRepository extends JpaRepository<Movie, Long>{
	
	public Movie findByTitle(String title);

	Optional<Movie> findById(Long id);
	
	List<Movie> findAll();
	
	void deleteById(Long id);
}