package com.example.demo.domain;

import com.example.demo.validators.ValidDeletePart;
import com.example.demo.validators.ValidInventory;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Entity
@ValidDeletePart
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="part_type",discriminatorType = DiscriminatorType.INTEGER)
@Table(name="Parts")
@ValidInventory
public abstract class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @NotNull(message = "Name is required")
    String name;
    @NotNull(message = "Price is required")
    @Min(value = 0, message = "Price value must be positive")
    double price;
    @NotNull(message = "Inventory is required")
    @Min(value = 0, message = "Inventory value must be positive")
    Integer inv;
    @NotNull(message = "Max inventory is required")
    @Min(value = 0, message = "Max Inventory value must be positive")
    Integer maxInv;
    @NotNull(message = "Min inventory is required")
    @Min(value = 0, message = "Min Inventory value must be positive")
    Integer minInv;

    @ManyToMany
    @JoinTable(name="product_part", joinColumns = @JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    Set<Product> products= new HashSet<>();

    public Part() {
    }

    public Part(String name, double price, Integer inv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
    }

    public Part(long id, String name, double price, Integer inv) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
    }

    public Integer getMaxInv() {
        return maxInv;
    }

    public void setMaxInv(Integer maxInv) {
        this.maxInv = maxInv;
    }

    public Integer getMinInv() {
        return minInv;
    }

    public void setMinInv(Integer minInv) {
        this.minInv = minInv;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getInv() {
        return inv;
    }

    public void setInv(Integer inv) {
        this.inv = inv;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        return id == part.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
