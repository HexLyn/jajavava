package LeetCode.finalTest;

public class LeastCostStairs {
    public int solution(int[] cost) {
        int[] dp= new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i=2;i<=cost.length;i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-2], dp[i-2] + cost[i-2]);
        }
        return dp[cost.length];
    }
}

// 정수배열 cost가 주어진다.
// cost[i]는 i번째 계단을 오르는데 드는 비용.
// 한번에 한 계단, 또는 두 계단을 이동할 수 있다.
// 시작지점 또한 0, 1번째에서 시작 선택 가능.
// 계단을 오르는데 드는 최소 비용 반환.

// ex) cost = [10,15,20] 일 경우,
// 1번째, cost[1]=15에서 시작, 두칸을 뛰어 바로 끝내면 최소, 총 비용 15반환.
