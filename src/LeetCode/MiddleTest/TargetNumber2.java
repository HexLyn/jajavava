package LeetCode.MiddleTest;

public class TargetNumber2 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    void dfs(int[] numbers, int index, int target, int cur) {
            if(index == numbers.length) {
                if(cur == target) {
                    answer++;
                }
                return;
            }
        dfs(numbers, index+1, target, cur+numbers[index]);
        dfs(numbers, index+1, target, cur-numbers[index]);
    }
}
