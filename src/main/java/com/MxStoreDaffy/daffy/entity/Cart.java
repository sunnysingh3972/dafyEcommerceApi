package com.MxStoreDaffy.daffy.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    private double totalPrice;
    @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    @JoinColumn(name="user_id",referencedColumnName = "userId")
    private User user;
    @OneToMany(fetch=FetchType.LAZY,mappedBy = "cart")
    private List<CartProduct> cartProduct;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public  List<CartProduct> getCartProduct() {
        return cartProduct;
    }

    public void setCartProduct(List<CartProduct> cartProduct) {
        this.cartProduct = cartProduct;
    }
}
