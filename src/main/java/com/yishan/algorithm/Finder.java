package com.yishan.algorithm;


public class Finder {


    public int solFinder (String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 == 0 || n1 < n2)
            return 0;


        if (s1.substring(0, n2).equals(s2))
            return solFinder(s1.substring(n2 - 1), s2) + 1;

        return solFinder(s1.substring(n2 - 1), s2);
    }


    public static void main(String args[])
    {
        Finder f = new Finder();
        String s1 = "bcbccbcb";
        String s2 = "bc";
        System.out.println("The key is: " + s2);
        System.out.println("The target is: " + s1);
        System.out.println("The key appeared " + f.solFinder(s1, s2) +" times in target.");

        s1 = "sssssssssbsssss";
        s2 = "sb";
        System.out.println("The key is: " + s2);
        System.out.println("The target is: " + s1);
        System.out.println("The key appeared " + f.solFinder(s1, s2) +" times in target.");

    }
}




