package com.bts.cart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CartResponse {

    @JsonProperty("cartItems")
    List<Item> items;

    public List<Item> getCartItems() {
        return items;
    }

    public void setCartItems(List<Item> items) {
        this.items = items;
    }
}
