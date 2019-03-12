//package com.yishan.algorithm;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//class CombinationSum {
//
//    List<List<Integer>> result = new ArrayList<>();
//
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        Array.sort(candidates, 0, target, new ArrayList<>());
//        return result;
//    }
//
//    private void backtrack(int[] candidates, int start, int target, List<Integer> currList) {
//        if (target == 0) {
//            result.add(new ArrayList<>(currList));
//            return;
//        }
//        if (start == candidates.length || target < candidates[start])
//            return;
//        int idx = start + 1, num = candidates[start];
//        while (idx < candidates.length && candidates[idx] == num) idx++;
//        backtrack(candidates, idx, target, currList);
//
//        for (int i = start; i < idx; i++) {
//            currList.add(candidates[i]);
//            target -= num;
//            backtrack(candidates, idx, target, currList);
//        }
//
//        for (int i = 0; i < idx - start; i++) currList.remove(currList.size() - 1);
//    }
//}
