package com.MxStoreDaffy.daffy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CartProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartProductId;
    @Column(name = "cart_id", insertable = false, updatable = false)
	private int cartId;

	@Column(name = "product_id", insertable = false, updatable = false)
	private int productId;
    private int quantity;
    @ManyToOne
    @JoinColumn(name="cart_id",referencedColumnName = "cartId")
    private Cart cart;
    @ManyToOne
    @JoinColumn(name="product_id",referencedColumnName = "productId")
    private Product product;
    
    public int getCartId() {
        return cartId;
    }
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getCartProductId() {
        return cartProductId;
    }
    public void setCartProductId(int cartProductId) {
        this.cartProductId = cartProductId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    
}
