package com.endava.internship8.jersey.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "vote_count","original_title", "video", "vote_average","poster_path","original_language" ,"genre_ids", "backdrop_path", "adult", "overview", "release_date" } )
public class Movie{
    private String title;
    private Integer id;
    private Double popularity;

    public Movie(String title, Integer id, Double popularity) {
        this.title = title;
        this.id = id;
        this.popularity = popularity;
    }

    public Movie(String title, Integer id) {
        this.title = title;
        this.id = id;
    }

    public Movie(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer("Action{");
        sb.append("title " + getTitle());
        sb.append('}');
        return sb.toString();
    }
}
