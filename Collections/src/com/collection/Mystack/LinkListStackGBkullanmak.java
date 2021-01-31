package com.collection.Mystack;

import java.util.LinkedList;

public class LinkListStackGBkullanmak {

    public static void main(String [] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; ++i)
            list.addFirst(i * 10);

        while (!list.isEmpty())
            System.out.printf("%d ", list.pollFirst());

        System.out.println();
    }
}
