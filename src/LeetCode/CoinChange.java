package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // Queue.offer(amount)
        // coins(4원, 3원, 1원), amount (11) => { 7->(3,4,6), 8->(4,5,7) ,10->(6,7,9)}
        boolean[] visited = new boolean[amount + 1];
        Queue<coinCount> queue = new ArrayDeque<>();
        queue.offer(new coinCount(amount, 0));
        visited[amount] = true;

        while(!queue.isEmpty()) {
            coinCount cur = queue.poll();
            if(cur.amount == 0) {
                return cur.cnt;
            }
            for(int i = 0; i < coins.length; i++) {
                int nextAmount = cur.amount - coins[i];
                if(visited[nextAmount] && nextAmount > 0) {
                    queue.offer(new coinCount(nextAmount, cur.cnt + 1));
                    visited[nextAmount] = true;
                }
            }
        }
        return -1;
    }


    class coinCount {
        int amount;
        int cnt;
        coinCount(int amount, int cnt) {
            this.amount = amount;
            this.cnt = cnt;
        }
    }
}

// 정수 배열 coins 를 받는다.
// 코인 별 가치가 다름을 의미.
// 정수 amount는 총 재화의 크기 의미.
// 주어진 amount를 충족시키기 위한 최소한의 코인 수를 반환.
// 주어진 amount를 만족할 수 없다면 -1 반환.
// 주어진 종류의 코인 숫자는 무한하다 가정.
// ex) coins= [1,2,5] , amount = 11일 시,
// 5+ 5+ 1 =11 로 주어진 종류의 코인은 문제 만족까지 무제한 사용 가능.

//bfs로 가까운 것들 다같이 내려가면서 제일 먼저 충족된 경우 = 최소한의 코인 수