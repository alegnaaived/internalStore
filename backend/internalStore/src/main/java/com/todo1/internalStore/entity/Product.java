package com.todo1.internalStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * sku as unique identifier
 */
@Entity
public class Product {
    /**
     * Product identity
     */
    private @Id @GeneratedValue long sku;
    private String name;
    private String type;
    private String superhero;
    private String brand;
    /**
     * Product inventory value
     */
    private int minimalAmount;
    private double averagePrice;
    private int currentAmount;

    public Product() {
    }
    /**
     * Constructor without inventory
     * @param sku
     * @param name
     * @param type
     * @param superhero
     * @param brand
     */
    public Product(long sku, String name, String type, String superhero, String brand) {
        this.sku = sku;
        this.name = name;
        this.type = type;
        this.superhero = superhero;
        this.brand = brand;
    }

    public long getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
    public String getSuperhero() {
        return superhero;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getMinimalAmount() {
        return minimalAmount;
    }

    public void setMinimalAmount(int minimalAmount) {
        this.minimalAmount = minimalAmount;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    /*
     * Get string with Product identity values
     */
    @Override
    public String toString() {
        return "Product [sku=" + sku + ", name=" + name + ", type=" + type + ", superhero=" + superhero + ", brand="
                + brand + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (sku ^ (sku >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((superhero == null) ? 0 : superhero.hashCode());
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (sku != other.sku)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (superhero == null) {
            if (other.superhero != null)
                return false;
        } else if (!superhero.equals(other.superhero))
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }

}
