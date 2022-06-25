package com.java.june21.service;

import com.java.june21.model.Cart;
import com.java.june21.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepo;

    // Save
    @Override
    public void addCart(Cart cart) {
        cartRepo.save(cart);
    }

//Read
    @Override
    public List<Cart> fetchCartList() {
        return cartRepo.findAll();
    }

    @Override
    public Cart updateCart(Cart cart, Long cartId) {
       return cartRepo.save(cart);
    }

    @Override
    public void deleteCartById(Long cartId) {
        cartRepo.deleteById(cartId);
    }


}
