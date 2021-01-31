package com.collection.MyMap;

import java.util.HashMap;
import java.util.HashSet;

public class Annagram {
    /*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı iki yazının anagram olup olmadığını test eden areAnagram isimli
    metodu yazınız ve teste ediniz:

    Tanım: Bir yazının karakterlerinin yerlerinin değiştirilmesiyle ikinci yazı yazılabiliyorsa bu yazılara
    anagram denir
    Örneğin:
    brat ve bart yazıları
----------------------------------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {

        String str1= "brat";
        String str2="bart";
        System.out.println(areAnagram(str1,str2));
    }

    public static boolean areAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;

        var charMap = new HashMap<Character, Integer>();

        incrementCounts(charMap, s1);

        if (!decrementCounts(charMap, s2))
            return false;

        for (var count : charMap.values())
            if (count != 0)
                return false;

        return true;
    }



    private static void incrementCounts(HashMap<Character, Integer> charMap, String s)
    {
        int length = s.length();

        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            int count = 1;

            if (charMap.containsKey(c))
                count = charMap.get(c) + 1;

            charMap.put(c, count);
        }
    }

    private static boolean decrementCounts(HashMap<Character, Integer> charMap, String s)
    {
        int length = s.length();

        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);

            if (!charMap.containsKey(c))
                return false;

            int count = charMap.get(c) - 1;

            if (count < 0)
                return false;

            charMap.put(c, count);
        }

        return true;
    }

}
