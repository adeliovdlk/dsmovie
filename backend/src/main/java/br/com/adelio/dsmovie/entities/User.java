package br.com.adelio.dsmovie.entities;


import lombok.Data;

@Data
public class User {

    private Long id;
    private String email;

    public User() {
    }

    public User(Long id, String email) {
        this.id = id;
        this.email = email;
    }
}
