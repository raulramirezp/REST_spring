package com.endava.internship8.jersey.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(value = { "crew" , "cast_id", "character", "credit_id","gender", "id", "order", "profile_path"})
public class MovieCast extends MovieDecorator<List<String>> {

    private Integer id;
    private List<Cast> cast = new ArrayList<>();
    private List<String> castNames = new ArrayList<>();
  //  private List<Cast> cast = new ArrayList<>();

    public MovieCast() {
    }

    public MovieCast(Integer id, List<Cast> cast) {
        this.id = id;
        this.cast = cast;
    }

    public MovieCast(String title, int id, List<Cast> cast) {
        super(title, id);
        this.cast = cast;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        for(Cast c : cast)
            castNames.add(c.getName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Action{");
        sb.append("Cast=").append(getCast());
        sb.append('}');
        return sb.toString();
    }
}
