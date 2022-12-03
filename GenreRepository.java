package com.spring.boot.demo.Repository;

import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository

public class GenreRepository {
	
	public interface GenreRepository extends JpaRepository<Genre,Long> {
		
		public Genre findByName(String name);
		
		Optional<Genre> findById(Long id);
		
		List<Genre> findAll();
		
		//void deleteAllByIdInBatch(Iterable<Genre> ids);
		void deleteById(Long id);
	

	}
}
