package com.java.june21.service;

import com.java.june21.model.Cart;

import java.util.List;

public interface CartService {

    // Save operation
    void addCart(Cart cart);

    // Read operation
    List<Cart> fetchCartList();

    // Update operation
    Cart updateCart(Cart cart, Long cartId);

    // Delete operation
    void deleteCartById(Long cartId);
}
