package pinhsuanyaomovie.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pinhsuanyaomovie.movies.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovieById(ObjectId _id){
        // probably return null, so it is Optional
        return movieRepository.findById(_id);
    }

    public Optional<Movie> singleMovieByImdbId(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
