package com.java.june21.controller;

import com.java.june21.model.Cart;

import com.java.june21.service.CartService;
import com.java.june21.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cart-api")
public class CartController {
    @Autowired
    private CartService cartService;

    // Save operation
    @PostMapping("/addCart")
    public void addCart(@Valid @RequestBody Cart cart)
    {
        cartService.addCart(cart);
    }

    // Read operation
    @GetMapping("/cartList")
    public List<Cart> fetchCartList()
    {
        return cartService.fetchCartList();
    }

    // Update operation
    @PutMapping("/cart/{id}")
    public Cart updateCart(@RequestBody Cart cart,
                     @PathVariable("id") Long cartId)
    {
        return cartService.updateCart(cart,cartId);
    }

    // Delete operation
    @DeleteMapping("/cart/{id}")
    public String deleteCartById(@PathVariable("id") Long cartId)
    {
        cartService.deleteCartById(cartId);
        return "Deleted Cart Successfully";
    }

}
