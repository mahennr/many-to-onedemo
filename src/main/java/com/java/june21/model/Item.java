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

   @ManyToOne
   private Cart cart;
}
