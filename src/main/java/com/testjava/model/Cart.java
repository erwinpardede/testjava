package com.testjava.model;

import com.testjava.util.Constant;

/**
 * Created by erwin on 3/30/18.
 */
public class Cart {

    private Integer id;
    private Product product;
    private Integer quantity;
    private Customer customer;
    private Integer status;
    private String statusValue;
    private Shipping shipping;

    public Cart() {
    }

    public Cart(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusValue() {
        return Constant.status.get(status);
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = Constant.status.get(status);
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        return id.equals(cart.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
