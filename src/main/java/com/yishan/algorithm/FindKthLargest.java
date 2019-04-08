package com.yishan.algorithm;

public class FindKthLargest {

//    public static int getSecondLargest(int[] arr, int total) {
//
//        Arrays.sort(arr);

        //int temp;
//        for (int i = 0; i < total; i++) {
//            for (int j = i + 1; j < total; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr[total - 2];
//    }

//    public static int findKthLargest(int[] arr, int k) {
//
//        PriorityQueue<Integer> q = new PriorityQueue<>(k);
//
//        for (int i : arr) {
//            q.offer(i);
//
//            if (q.size() > k) {
//                q.poll();
//            }
//        }
//
//        return q.peek();
//    }
    public static int FindKthLargest(int[] arr) {

        int l = arr[0];
        int sl = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > l) {
                sl = l;
                l = arr[i];

            } else if (arr[i] > sl) {
                sl = arr[i];

            }
        } return sl;
    }

    public static void main(String args[]) {
       int[] zz = {-1, 1, 2, -7};
//        System.out.println("The 2nd large value is:" + "\n" + getSecondLargest(zz, 4) + "\n");
        int [] arr = { 1,2,3,4,5 };

        System.out.println("\n\nSecond largest number is:\n" + FindKthLargest(zz));



    }

}
