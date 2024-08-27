package LeetCode;

class Solution3 {
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