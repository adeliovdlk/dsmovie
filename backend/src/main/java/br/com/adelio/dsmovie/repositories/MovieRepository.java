package br.com.adelio.dsmovie.repositories;

import br.com.adelio.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long>{

}
