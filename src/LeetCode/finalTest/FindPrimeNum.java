package LeetCode.finalTest;

public class FindPrimeNum {
    public int solution(String numbers) {
        int counter = 0;

        for(int j = 0; j < numbers.length(); j++) {
            for(int i : numbers.toCharArray()) {

            }
        }
//        for (int i = 0; i < nums.length-2; i++) {
//            for (int j = i+1; j < nums.length-1; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if(isPrime(nums[i]+nums[j]+nums[k])) counter++;
//                }
//            }
//        }

        return counter;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// 한자리 수가 적힌 종이조각들이 있다.
// 이 종이조각들을 붙여 소수를 몇개 만들 수 있는지 여부.
// 각 종이 조각에 적힌 숫자가 들은 문자열 numbers가 주어질 때,
// 만들 수 있는 소수가 몇개인지 반환.

// numbers는 길이가 1이상 7이하.
// numbers는 0~9인 숫자로 이루어짐.
// "013"의 경우 0, 1, 3 종이조각들이 있다는 의미.

// 배열의 요소들을 통해 모든 숫자 조합들을 만든다.
// 소수 판별하며 개수를 센다.



