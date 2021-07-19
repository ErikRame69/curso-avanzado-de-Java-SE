package dao;

import java.util.ArrayList;

import com.anncode.amazonviewer.model.Movie;

public interface MovieDAO {
	
	default Movie setMovieViewed()Movie movie {
		return movie;
	}
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList<>();
		return movie;
	}
	
	private boolean getMovieViewed (){
		
		return false; 
		
	}
	
}
