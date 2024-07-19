package LeetCode;

class TargetNumber {
    int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
            dfs(0,0, numbers, target);
        return answer;
    }

        void dfs(int cur, int idx, int[] numbers, int target) {
//            base case
            if (idx == numbers.length) {
                if (target == cur) {
                    answer++;
                }
                return;
            }


//            recursive cal
            dfs(cur + numbers[idx], idx+1, numbers, target);
            dfs(cur - numbers[idx], idx+1, numbers, target);

        }
    }


// n개의 음이 아닌 정수들.
// 이 정수들을 순서 바꾸지 않고, 더하거나 빼서 타겟 넘버를 만든다.
// 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
//        -1+1+1+1+1 = 3
//        +1-1+1+1+1 = 3
//        +1+1-1+1+1 = 3
//        +1+1+1-1+1 = 3
//        +1+1+1+1-1 = 3

//사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때
//숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 반환.

//dfs로 끝까지 내려가면서 target이 나오면 1, 안나오면 0
//다 더하면 방법의 수.

// 그래프를 구할 때 +, -의 경우를 나눠야 한다. 다 더하는데 *(-1)하는 경우가 빼기인걸로.
// 배열을 받으면 해당 배열의 역, 전부 *(-1)한 배열 생성, 두 배열을 합친다?
// 합치면 dfs할 때 배열 길이가 두배가 된다. 안됨.

