//package com.yishan.oop;
//
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        Main abc = new Main();
//
//        int[] original={1,1,1,9,9,9};
//
//        System.out.println(Arrays.toString(abc.addOne(original)));
//
//
//    }
//
//
//    public int[] addOne(int[] original) {
//
//
//        for (int i = original.length - 1; i >= 0; i--) {
//
//            if (original[i] + 1 == 10) {
//
//                original[i] = 0;
//
//                if (i == 0) {
//                    int[] trans = new int[original.length + 1];
//                    trans[0] = 1;
//                    System.arraycopy(original, 0, trans, 1, original.length);
//                    original = trans;
//                }
//
//            } else {
//                original[i]++;
//                break;
//            }
//        }
//
//        return original;
//    }
//}
