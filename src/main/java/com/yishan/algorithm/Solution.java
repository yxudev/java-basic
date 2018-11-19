package com.yishan.algorithm;
import java.util.ArrayList;
import java.util.List;

public class Solution{
    public List<String> solution(int n) {
        List<String> array = new ArrayList<>();

        for (int k = 1; k <= n; k++) {
            if ((k % 3 == 0) && (k % 5 == 0)) {
                array.add("FizzBuzz");
            } else if (k % 3 == 0) {
                array.add("Fizz");
            } else if (k % 5 == 0) {
                array.add("Buzz");
            } else {
                array.add(String.valueOf(k));
            }
        }
        return array;
    }
    public static List<String> solutionStatic(int n){
        List<String> array = new ArrayList<>();

        for (int k = 1; k <= n; k++) {
            if ((k % 3 == 0) && (k % 5 == 0)) {
                array.add("FizzBuzz");
            } else if(k % 3 == 0) {
                array.add("Fizz");
            } else if(k % 5 == 0) {
                array.add("Buzz");
            }else {array.add(String.valueOf(k));
            }
        }
        return array;
    }


    public static void main(String args[]){
        Solution sl = new Solution();
        List<String> result = sl.solution(100);
        System.out.println(result);

        System.out.println(Solution.solutionStatic(100));
    }

}
