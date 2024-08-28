package LeetCode.finalTest;

public class ExchangeCoin {
    public int solution(int[] coins, int amount) {
        int answer = dp(coins, amount);
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public int dp(int[] coins, int amount) {
        int result = Integer.MAX_VALUE;

        if(amount == 0) return 0;

        for(int coin : coins) {
            if(amount - coin >= 0) {
                result = Math.min(result, dp(coins,amount-coin));
            }
        }
        return result == Integer.MAX_VALUE ? result : result +1;
    }
}

// 정수 배열 coins가 주어진다.
// coins에는 각기 다른 가치를 지닌 동전들이 있다.
// 정수 amount가 주어진다.
// amount는 총 가치를 의미.
// amount를 맞추는데 필요한 최소한의 동전 수를 반환해야 한다.
// 만약 주어진 coins로 amount를 맞출 수 없다면 -1을 반환.
// 배열의 각 동전들은 개수가 무한대.
// ex) coins = [1, 3, 5], amount=11일 시, 1+5+5로 3 반환.
// ex) coins = [2], amount=3은 충족 불가능 하니 -1 반환.