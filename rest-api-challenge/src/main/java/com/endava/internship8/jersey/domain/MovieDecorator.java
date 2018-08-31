package com.endava.internship8.jersey.domain;

import java.util.List;

abstract class MovieDecorator<T> extends Movie {

    private T data;

    public MovieDecorator() {
    }

    public MovieDecorator(String title, int id) {
        super(title, id);
    }
    public MovieDecorator(String title, int id, Double popularity) {
        super(title, id, popularity);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
