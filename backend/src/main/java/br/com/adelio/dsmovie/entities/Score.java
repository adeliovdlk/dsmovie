package br.com.adelio.dsmovie.entities;


import lombok.Data;

@Data
public class Score {
    private ScorePK id= new ScorePK();
    private  Double value;


    public Score() {
    }

    public  void setMovie(Movie movie){
        
    }
    public Score(ScorePK id, Double value) {
        this.id = id;
        this.value = value;
    }
}
