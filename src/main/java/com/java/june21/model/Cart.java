package com.java.june21.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Cart_Table")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Cart_ID")
    private Long cartId;

    @Column(name = "Number_Of_Items")
    private Integer qty;

    @Column(name = "Price")
    private Double price;


   /* @OneToMany(mappedBy = "cart")
    private Set<Item> items;*/
}

