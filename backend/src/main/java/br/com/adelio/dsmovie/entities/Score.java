package br.com.adelio.dsmovie.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePK id= new ScorePK();

    private  Double value;


    public Score() {
    }

    public void setMovie (Movie movie){
        id.setMovie(movie);
    }

    public void setUser(User user){
        id.setUser(user);
    }


//    public ScorePK getId() {
//        return id;
//    }
//
//    public void setId(ScorePK id) {
//        this.id = id;
//    }
//
//    public Double getValue() {
//        return value;
//    }
//
//    public void setValue(Double value) {
//        this.value = value;
//    }
}
