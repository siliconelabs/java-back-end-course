package com.collection.MySet;

import java.util.HashSet;
import java.util.Scanner;

public class AreCharactersDistinct {

        public static void main(String [] args)
        {
            System.out.println("string giriniz");
            Scanner input=new Scanner(System.in);
            String x=input.next();

            System.out.println(areCharactersDistinct(x));


        }

        public static boolean areCharactersDistinct(String str)
        {
            var hashset = new HashSet<Character>();
            var length =  str.length();

            for (int i = 0; i < length; ++i)
                hashset.add(str.charAt(i));

            return hashset.size() == length;

/*
            var hashset = new HashSet<Character>();
            var length =  str.length();

            for (int i = 0; i < length; ++i)
                if (!hashset.add(str.charAt(i)))
                    return false;

            return true;
            */



        }
    }

