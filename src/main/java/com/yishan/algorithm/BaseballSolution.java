package com.yishan.algorithm;

import java.util.Stack;

public class BaseballSolution{
//
//    public int calPoints(String[] ops) {
//        int sum = 0;
//
//        Stack<Integer> stack = new Stack();
//
//            for (int i = 0; i < ops.length; i++) {
//                String op = ops[i];
//                switch (op) {
//                    case "+":
//                        int top = stack.pop();
//                        int tops = stack.peek();
//                        stack.push(top);
//                        stack.push(top+tops);
//                        sum+= stack.peek();
//                        break;
//                    case "C":
//                       sum-= stack.pop();
//                        break;
//                    case "D":
//                        stack.push( 2 * stack.peek());
//                        sum+= stack.peek();
//                        break;
//
//                    default:
//                        stack.push(Integer.valueOf(op));
//                        sum+=Integer.valueOf(op);
//                        break;
//                }
//            }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        BaseballSolution bs = new BaseballSolution();
//        String[] input = {"5","-2","4","C","D","9","+","+"};
//        System.out.println(bs.calPoints(input));
//    }
//}


    public int calPoints(String[] ops) {
        int sum = 0;

        Stack<Integer> stack = new Stack();


        for(int i=0; i<ops.length; i++){
            String op = ops[i];
            switch(op){
                case "+":
                    int top = stack.pop();
                    int topDuo = stack.peek();
                    stack.push(top);
                    stack.push(top+topDuo);
                    sum+= stack.peek();
                    break;

                case "C":
                    sum-= stack.pop();
                    break;

                case "D":
                    stack.push(2*stack.peek());
                    sum+= stack.peek();
                    break;

                default:
                    stack.push(Integer.valueOf(op));
                    sum+= Integer.valueOf(op);
                    break;

            }
        }

        return sum;



    }

    public static void main(String[] args) {
          BaseballSolution s = new BaseballSolution();
        String[] input = {"5","-2","4","C","D","9","+","+"};
         System.out.println("The total score is: " + s.calPoints(input) + " !!!");
    }


}