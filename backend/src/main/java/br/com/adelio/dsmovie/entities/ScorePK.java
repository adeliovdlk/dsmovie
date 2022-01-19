package br.com.adelio.dsmovie.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ScorePK implements Serializable {



    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    public ScorePK() {
    }
}
