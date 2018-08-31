package com.endava.internship8.jersey.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cast {

    private String name;

    public Cast(){

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
        sb.append("name " + getName());
        sb.append('}');
        return sb.toString();
    }
}
