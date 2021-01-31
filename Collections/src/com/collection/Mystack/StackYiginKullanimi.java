package com.collection.Mystack;

import java.util.LinkedList;
import java.util.Stack;

public class StackYiginKullanimi {

    public static void main(String[] args) {

        Stack<String> yigin=new Stack<>();

        yigin.push("murat");
        yigin.push("hakkı");
        yigin.push("ayse");

        System.out.println(yigin);

        System.out.println(yigin.pop());
        System.out.println(yigin);

        System.out.println(yigin.peek());
        System.out.println(yigin);
        System.out.println(yigin.push("Can"));
        System.out.println(yigin);
        System.out.println(yigin.search("Hasan"));
        System.out.println(yigin.empty());

        LinkedList<String> yigin2=new LinkedList<>();
        yigin2.push("asa");
        yigin2.push("ali");
        yigin2.push("isa");
        yigin2.add("9999999999999999");
        yigin2.push("ensoneleman");

        System.out.println(yigin2.pop());
        System.out.println(yigin2.pop());
        System.out.println(yigin2);

    }
}
