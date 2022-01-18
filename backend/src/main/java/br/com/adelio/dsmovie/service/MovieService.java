package br.com.adelio.dsmovie.service;


import br.com.adelio.dsmovie.dto.MovieDto;
import br.com.adelio.dsmovie.entities.Movie;
import br.com.adelio.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDto> findAll(Pageable pageable){
       Page <Movie> result = movieRepository.findAll(pageable);
       Page<MovieDto> page= result.map(x -> new MovieDto(x));
       return page;
    }

    @Transactional(readOnly = true)
    public MovieDto findById(Long id){
        Movie result = movieRepository.findById(id).get();
        MovieDto dto= new MovieDto(result);
        return dto;
    }
}
