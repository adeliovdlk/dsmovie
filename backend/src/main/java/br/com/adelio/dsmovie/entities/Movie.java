package br.com.adelio.dsmovie.entities;


import lombok.Data;

@Data
public class Movie {
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public Movie() {
    }

    public Movie(Long id, String title, Double score, Integer count, String image) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }
}
