package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PERMUTATIONcompre{
void backtrack
        (List<Integer> curr,
         int[] nums,
         boolean[] visited,
         List<List<Integer>> result)
//        backtrack에선 정수 리스트 curr, 정수배열 nums,
//        boolean 배열 visited, 정수 리스트 리스트 result 선언
{
    // Base Case
    if(curr.size() == nums.length){
//        curr리스트의 크기가 nums의 길이와 같다면,
        result.add(new ArrayList<>(curr));
//        result에 curr을 추가.
        return;
    }

    // Recursive Call
    for(int i = 0; i <nums.length; i++){
        if(visited[i]) continue;
//        visited는 참/거짓, 참일 시 통과,

        curr.add(nums[i]);
        visited[i] = true;

//
        backtrack(curr, nums, visited, result);

//        curr
        curr.remove(curr.size() - 1);
        visited[i] = false;
    }
}
}
