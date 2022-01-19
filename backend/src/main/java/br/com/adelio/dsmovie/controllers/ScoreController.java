package br.com.adelio.dsmovie.controllers;


import br.com.adelio.dsmovie.dto.MovieDto;
import br.com.adelio.dsmovie.dto.ScoreDto;
import br.com.adelio.dsmovie.service.MovieService;
import br.com.adelio.dsmovie.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDto saveScore(@RequestBody ScoreDto scoreDto){
        MovieDto movie=scoreService.saveScore(scoreDto);
        return movie;
    }






}
