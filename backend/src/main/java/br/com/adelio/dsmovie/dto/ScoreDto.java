package br.com.adelio.dsmovie.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreDto {

    private Long movieId;
    private String email;
    private Double score;

    public ScoreDto() {
    }
}
