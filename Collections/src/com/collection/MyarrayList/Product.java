package com.collection.MyarrayList;

import java.util.Comparator;
import java.util.Objects;

public class Product
{
    private final String name;
    private final int weight;

    public Product(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public static Product ProductFactory(String name, int weight)
    {
        return new Product(name,weight);
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


}
