package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWeek3{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<=nums.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j= 0; j<i; j++){
                list.add(nums[j]);
            }
            res.add(list);
        }
        return res;
    }
}
// i=0, j= 012
//길이가 없는 []배열은 반환하면 안된다.

// 중복 없는 정수배열 nums가 주어진다.
// 모든 가능한 배열 조합들을 반환한다.
// 조합의 중복은 신경안쓴다.
// ex) nums = [0,1] 이 주어질 시,
//  [[0,1],[1,0]] 반환.
// 반환의 순서는 상관 없다.

//package week3.permutations;
//
//import java.util.*;
//
//class Solution {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        boolean[] visited = new boolean[nums.length];
//        backtrack(new ArrayList<>(), nums, visited, result);
//        return result;
//    }
//
//    // 순열을 만들어서 result에 추가하는 함수
//    void backtrack(List<Integer> curr, int[] nums, boolean[] visited, List<List<Integer>> result) {
//        // basecase
//        if (curr.size() == nums.length) {
//            result.add(new ArrayList<>(curr));
//            return;
//        }
//
//        // recursive call
//        for (int i = 0; i < nums.length; i++) {
//            if (visited[i]) continue;
//
//            curr.add(nums[i]); // add
//            visited[i] = true;
//            backtrack(curr, nums, visited, result);
//            curr.remove(curr.size() - 1); // remove 마지막 원소
//            visited[i] = false;
//        }
//    }
//    }
//}
