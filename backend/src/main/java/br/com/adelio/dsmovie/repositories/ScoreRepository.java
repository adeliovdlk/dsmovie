package br.com.adelio.dsmovie.repositories;

import br.com.adelio.dsmovie.entities.Score;
import br.com.adelio.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScoreRepository extends JpaRepository <Score, ScorePK>{

}
