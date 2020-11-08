package com.bts.cart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty("name")
    private String name;

    @JsonProperty("colour")
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
