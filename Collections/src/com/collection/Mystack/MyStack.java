package com.collection.Mystack;

import com.collection.MyarrayList.Product;

import java.util.*;

public class MyStack {

    public static void main(String[] args) {


        StackFromArrayList <Integer> stack = new StackFromArrayList<>();

        for (int i = 0; i < 10; ++i)
            stack.push(i + 1);

        int index = stack.search(4);

        while (!stack.empty())
            System.out.printf("%d ", stack.pop());

        System.out.printf("%nIndex:%d%n", index);

        System.out.println(index);


    }
}
