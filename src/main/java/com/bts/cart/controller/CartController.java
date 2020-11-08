package com.bts.cart.controller;

import com.bts.cart.model.Item;
import com.bts.cart.model.CartResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CartController {


   @GetMapping(value = "/getCartItems", produces = MediaType.APPLICATION_JSON_VALUE)
    public CartResponse getCartItems(){

       // Item1
       Item item1 = new Item();
       item1.setName("pen");
       item1.setColour("red");

       // Item2
       Item item2 = new Item();
       item2.setName("pencil");
       item2.setColour("blue");

       // populate list of items.
       List<Item> items = new ArrayList<>();
       items.add(item1);
       items.add(item2);

       // populate Cart Response
       CartResponse cartResponse = new CartResponse();
       cartResponse.setCartItems(items);

       return cartResponse;

    }


}
