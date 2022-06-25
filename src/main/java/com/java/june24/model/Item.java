package com.java.june21.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Item_Table")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Item_ID")
    private Long itemId;
    private String itemName;
    private Double itemPrice;

   // @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
   //  @JoinColumn(name = "Item_Id")

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @ManyToOne
   private Cart cart;
}
