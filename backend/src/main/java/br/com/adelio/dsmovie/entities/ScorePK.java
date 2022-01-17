package br.com.adelio.dsmovie.entities;

import lombok.Data;

@Data
public class ScorePK {

    private User user;

    private Movie movie;

    public ScorePK() {
    }
}
