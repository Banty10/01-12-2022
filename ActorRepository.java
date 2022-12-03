package com.spring.boot.demo.Repository;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.jpa.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{
		
		public Actor findByNAme(String Name);
		
		Optional<Actor>findById(Long id) ;
		
		List<Actor> findAll();
		
		void deleteById(Long id);
}

		
		
		
		
		
	
	
	


