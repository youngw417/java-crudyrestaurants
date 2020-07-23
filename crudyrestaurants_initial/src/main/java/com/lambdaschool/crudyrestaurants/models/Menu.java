package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;

@Entity
@Table(name ="menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuid;

    @Column(nullable = false, unique = true)
    private String dish;

    private double price;

    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable=false)
    private Restaurant restaurant;

    public Menu() {
    }

    public Menu(String dish, double price, Restaurant restaurant){
        this.dish = dish;
        this.price = price;
        this.restaurant = restaurant;
    }

    public long getMenuid() {
        return menuid;
    }

    public String getDish() {
        return dish;
    }

    public double getPrice() {
        return price;
    }

    public void setMenuid(long menuid) {
        this.menuid = menuid;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
