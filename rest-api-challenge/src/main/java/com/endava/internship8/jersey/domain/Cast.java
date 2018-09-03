package com.endava.internship8.jersey.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cast {
    private int movie_id;
    private String name;

    public Cast(){

    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer("Action{");
        sb.append("movie_id " + movie_id +" ,");
        sb.append("name " + getName());
        sb.append('}');
        return sb.toString();
    }
}
