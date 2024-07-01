package LeetCode;

class Solution2 {
    public int solution(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(isPrime(nums[i]+nums[j]+nums[k])) counter++;
                }
            }
        }
        return counter;
    }
    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// 주어진 숫자 중 3개의 수를 더했을 때, 소수가 되는 경우의 개수 리턴
//숫자들이 들어있는 배열 nums가 주어진다.
//nums의 숫자들 중 3개를 골라 더했을 때 소수가되는 경우 리턴

//1. 모든 경우의 수 계산
//123 234 345 456,..., n-2 n-1 n번째까지.
//6, 9, 12, 15 ,... , 3n-3
//
//public int solution(int[] nums) {
//    int answer = -1;
//    int count = 0;
//    int i = 0;
//    int combine = nums[i] + nums[i+1] + nums[i+2];
//
//    for(i = 0; i< (nums.length)-2; i++) {
//        if(combine % i == 0) {
////                count++;
//            if(i != combine / i) {
//                count++;
//            }
//        }
//    }
//
//    return answer;
//}