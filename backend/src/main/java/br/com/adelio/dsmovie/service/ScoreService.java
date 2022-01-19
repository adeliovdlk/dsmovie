package br.com.adelio.dsmovie.service;


import br.com.adelio.dsmovie.dto.MovieDto;
import br.com.adelio.dsmovie.dto.ScoreDto;
import br.com.adelio.dsmovie.entities.Movie;
import br.com.adelio.dsmovie.entities.Score;
import br.com.adelio.dsmovie.entities.User;
import br.com.adelio.dsmovie.repositories.MovieRepository;
import br.com.adelio.dsmovie.repositories.ScoreRepository;
import br.com.adelio.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDto saveScore(ScoreDto scoreDto){
        User user= userRepository.findByEmail(scoreDto.getEmail());
        if (user==null){
            user= new User();
            user.setEmail(scoreDto.getEmail());
            user=userRepository.saveAndFlush(user);
        }
        Movie movie=movieRepository.findById(scoreDto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(scoreDto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum=0.0;
        for (Score s: movie.getScores()){
            sum=sum + s.getValue();
        }

        double avg=sum/movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie= movieRepository.save(movie);

        return new MovieDto(movie);
    }


}
