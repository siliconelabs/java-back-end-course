package com.collection.IteratorExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import com.collection.MyarrayList.ArrayListSilicon;
import com.collection.MyarrayList.Product;


 class CollectionConcepts
{
    public static void main(String[] args)
    {

        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
       // products.add(door);
        products.add(floorPanel);
        products.add(window);

        // Iterating with foreach
        for (Product product : products)
        {
            System.out.println(product);
        }

        // Broken removal using foreach
        /*for (Product product : products) {
            if (product.getWeight() > 20)
            {
                System.out.println(product);
            }
            else
            {
                products.remove(product);
            }
        }*/

        // Refactor to use iterator to remove products.
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext())
        {
            final Product product = iterator.next();
            if (product.getWeight() > 20)
            {
                iterator.remove();
            }
        }
        System.out.println(products);

        // 4. other methods
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(floorPanel));
        products.remove(floorPanel);
        System.out.println(products.contains(floorPanel));

        // 5. removeAll
        List<Product> toRemove = new ArrayList<>();
        //toRemove.add(door);
        toRemove.add(floorPanel);

        products.removeAll(toRemove);
        System.out.println(products);
    }
}
