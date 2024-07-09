package LeetCode;

import java.util.*;

public class TwoQue {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        // int q1Sum 으로 지정하면 문제 발생.
        long q1Sum = 0, q2Sum = 0;
        long totalSum = 0;

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        for (int value : queue1) {
            q1.add(value);
            q1Sum += value;
        }
        for (int value : queue2) {
            q2.add(value);
            q2Sum += value;
        }

        totalSum = q1Sum + q2Sum;

        // 두 큐의 합이 홀수이면 절대 같아질 수 없음
        if (totalSum % 2 != 0) return -1;

        long target = totalSum / 2;
        int i = 0, j = 0, operations = 0;

        while (i < 2 * n && j < 2 * n) {
            if (q1Sum == target) {
                return operations;
            } else if (q1Sum > target) {
                int value = q1.poll();
                q2.add(value);
                q1Sum -= value;
                q2Sum += value;
                i++;
            } else {
                int value = q2.poll();
                q1.add(value);
                q2Sum -= value;
                q1Sum += value;
                j++;
            }
            operations++;
        }

        return -1;
    }
}




//public class TwoQue {
//    public int solution(int[] queue1, int[] queue2) {
//        int n = queue1.length;
//
//        Queue<Integer> q1 = new ArrayDeque<>();
//        Queue<Integer> q2 = new ArrayDeque<>();
//
//        int q1Sum = 0;
//        int q2Sum = 0;
//
//        for (int value : queue1) {
//            q1.add(value);
//            q1Sum += value;
//        }
//        for (int value : queue2) {
//            q2.add(value);
//            q2Sum += value;
//        }
//
//        for(int i=0; i<4*n; i++) {
//            if (q1Sum > q2Sum) {
//                int value = q1.remove();
//                q2.add(value);
//                q1Sum -= value;
//                q2Sum += value;
//            } else if (q1Sum < q2Sum) {
//                int value = q2.remove();
//                q1.add(value);
//                q2Sum -= value;
//                q1Sum += value;
//            } else {
//                return i;
//            }
//        }
//        return -1;
//    }
//    }









//ghswk
//public class TwoQue {
//    public int solution(int[] queue1, int[] queue2) {
//        Deque<Integer> que1 = new ArrayDeque<>();
//        Deque<Integer> que2 = new ArrayDeque<>();
//
//        int temp = 0;
//        int sum1 = 0;
//        int sum2 = 0;
//        int count = 0;
//
//        for( int i = 0; i< queue1.length; i++ ) {
//            sum1 += queue1[i];
//        }
//        for( int i = 0; i< queue2.length; i++ ) {
//            sum2 += queue2[i];
//        }
//
//        while( sum1 != sum2) {
//        if (sum1 > sum2) {
//            temp = que1.pop();
//            que2.push(temp);
//        } else if (sum1 < sum2) {
//            temp = que2.pop();
//            que1.push(temp);
//        }
//        if (count >= 200) {
//            return -1;
//        }
//        count++;
//        }
//        return count;
//    }
//}

//길이가 같은 두 개의 큐가 주어진다.
//하나의 큐를 골라 원소를 추출(pop), 추출된 원소를 다른 큐에 집어넣음(insert).
//각 큐의 원소 합이 같도록 만든다.
//이 때 필요한 작업의 최소 횟수. 한 번의 pop+한 번의 insert 합쳐서 작업 1회로 친다.

// 두 개의 큐 중, 더 큰쪽(1. 큐 끼리 크기 비교)에서 원소를 빼 더 작은쪽으로 넘겨준다(2. pop, push).
// 두 큐의 합이 같으면 종료, 불가능하면 -1 리턴(3. equals)

