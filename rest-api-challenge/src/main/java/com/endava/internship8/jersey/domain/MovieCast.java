package com.endava.internship8.jersey.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(value = { "crew" , "cast_id", "character", "credit_id","gender", "id", "order", "profile_path"})
public class MovieCast{

    private Integer id;
    private List<Cast> cast = new ArrayList<>();
  //  private List<Cast> cast = new ArrayList<>();

    public MovieCast() {
    }


    public List<Cast> getCast() {
        return cast;
    }


    public void setMovieId(int movieId){
        for( Cast cast : cast)
            cast.setMovie_id(movieId);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
