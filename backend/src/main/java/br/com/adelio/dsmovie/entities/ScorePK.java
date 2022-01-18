package br.com.adelio.dsmovie.entities;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class ScorePK implements Serializable {



    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    public ScorePK() {
    }
}
