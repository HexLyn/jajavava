package LeetCode.finalTest;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeNum {
    Set<Integer> candidates = new HashSet<>();
    public int solution(String numbers) {
        permutation("", numbers);

        int answer = 0;
        for(int num : candidates) {
            if(isPrime(num)) answer++;
        }

        return answer;
    }

    void permutation(String prefix, String remaining) {
        if (!prefix.isEmpty()) {
            candidates.add(Integer.parseInt(prefix));
        }
        for (int i = 0; i < remaining.length(); i++) {
            permutation(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }

    private boolean isPrime(int num) {
        if(num < 2) return false;

        for(int i=2; i*i <= num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}


// 배열의 요소들을 붙여 소수를 몇개 만들 수 있는지 여부.
// 숫자가 들은 문자열 numbers가 주어질 때,
// 만들 수 있는 소수가 몇개인지 반환.

// numbers는 길이가 1이상 7이하.
// numbers는 0~9인 숫자로 이루어짐.
// "013"의 경우 0, 1, 3 숫자들이 있다는 의미.

// 배열의 요소들을 통해 모든 숫자 조합들을 만든다.
// 소수 판별하며 개수를 센다.



