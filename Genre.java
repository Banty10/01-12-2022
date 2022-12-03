package com.spring.data.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;



@Entity
@Table
(name ="genre")

public class Genre {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="id")
	private String nameString;

	
	@Column(name ="name, nullable=false, length =255")
	private String name;
	
	// Implement @OneToMAny between Genre and Movie//
	
	@OneToMany
	@JoinColumn(name ="genre_id")
	private List <Movie> movies;


	private long id;
	
	
	public Genre() {
		super();
		//TODO Auto-generate constructor stub
		
		public Genre(long id, String name, List<Movie> movies) {
			super();
			this.id = id;
			this.name = name;
			this.movies = movies;
		}

		public Genre(String name, List<Movie> movies) {
			super();
			this.name = name;
			this.movies = movies;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Movie> getMovies() {
			return movies;
		}

		public void setMovies(List<Movie> movies) {
			this.movies = movies;
		}

		@Override
		public String toString() {
			return "Genre [id=" + id + ", name=" + name + ", movies=" + movies + "]";
	}
}
