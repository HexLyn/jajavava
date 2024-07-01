package LeetCode;
class Solution5 {
    public int[] solution(int[] sequence, int k) {
        //✅ 정답 범위의 초기값을 (0, 1,000,000)으로 설정한다.
        int[] answer = {0, 1_000_000};

        int total = 0;
        int start = 0;

        //✅ end를 0 ~ sequence.length - 1 까지 순회한다.
        for (int end = 0; end < sequence.length; end++) {
            //✅ end 부분을 합계에 더한다.
            total += sequence[end];

            //✅ 합계가 k보다 작거나 같을때까지 start를 증가시킨다.
            while (total > k) {
                total -= sequence[start];
                start++;
            }

            //✅ 합계가 k와 같고, 현재 윈도우가 우선순위가 더 높다면 정답을 현재 범위로 바꾼다.
            if (total == k) {
                if ((end - start) < (answer[1] - answer[0])) {
                    answer[0] = start;
                    answer[1] = end;
                }
            }
        }
        //✅ 정답을 반환한다.
        return answer;
    }
}



// 비내림차순 정렬된 수열.(걍 오름차순이라 생각)
// 기존 수열에서 임의의 두 인덱스 원소, 그리고 그 두 원소 사이의 모든 원소를 포함하는 부분수열
// 이 부분수열의 합은 k.
// 합이 k인 부분수열이 여러개일 경우 더 짧은 배열의 수열을 찾는다.
// 길이가 짧은 수열이 여러개이면 앞쪽(시작 인덱스가 작은) 수열을 찾는다.

// ex) sequence=[1,1,1,2,3,4,5], k=5 일 때 result=[6,6]
// 본 배열에서 합이 5(k)인 연속된 부분수열은 [1,1,1,2], [2,3], [5] 세가지.
// 이 중 [5]가 제일 짧으므로 해당 수열의 시작 인덱스와 마지막 인덱스를 담은 [6,6]을 반환
// sequence[6]=5 이므로 시작 6 끝 6이라 [6,6] 반환한다는 뜻.

// 1. 모든 연속된 배열의 경우를 구하고 그 중 k와 일치하는걸 찾는다.
// 배열 최대길이가 1,000,000 ;;;

// 2. 가능한 한 짧은 부분수열을 출력= 현재 오름차순의 배열이니 뒤에서부터 시도를 한다.
//public class Solution5 {
//    public int[] solution(int[] sequence, int k) {
//        int[] answer = new int[2];
//        int minLength = Integer.MAX_VALUE;
//
//        for(int i=sequence.length-1; i>=0; i--) {
//            int sum= 0;
//            for (int j = i; j>=0; j--) {
//                sum += sequence[j];
//                if(sum == k) {
//                    int length = i-j+1;
//                    if(length < minLength) {
//                        minLength = length;
//                        answer[0] = j;
//                        answer[1] = i;
//                    }
//                    break;
//                } else if (sum > k) {
//                    break;
//                }
//            }
//        }
//        return answer;
//    }
//}
// 맨 뒤에서 부터 1개 배열 충족여부.
// 충족안되면 그 뒤에까지 이어서.
// 잇는 과정에서 k를 초과해버리면 sequence.length -1 부터 다시 수행.
// '길이가 짧은 수열이 여러개이면 앞쪽(시작 인덱스가 작은) 수열을 찾는다.' 요구조건 충족안됨.
// +비효율적

// 3. 앞에서부터 조합 찾기.
//class Solution5 {
//    public int[] solution(int[] sequence, int k) {
//        int[] answer = new int[2];
//        int minLength = Integer.MAX_VALUE;
//
//        for (int i = 0; i < sequence.length; i++) {
//            int sum = 0;
//            for (int j = i; j < sequence.length; j++) {
//                sum += sequence[j];
//                if (sum == k) {
//                    int length = j - i + 1;
//                    if (length < minLength) {
//                        minLength = length;
//                        answer[0] = i;
//                        answer[1] = j;
//                    }
//                    break;  // k를 초과하지 않기 위해 현재 루프 종료
//                } else if (sum > k) {
//                    break;  // k를 초과하면 다음 i로 넘어감
//                }
//            }
//        }
//
//        return answer;
//    }
// 정답은 나오지만 큰값이 들어오면 비효율적(시간초과)

// 4. sequence 내의 특정범위를 윈도우(window)라 규정.
// 해당 범위의 시작, 끝 인덱스를 start, end라 할 때.
// start, end는 0부터 시작. <<배열에서 0이면 값있는거 아닌가
// 시작 시 end를 1증가시켜 요소 하나를 윈도우 안으로 포함.
// 윈도우 내부의 합을 k와 비교.
// k 보다 작으면 값 추가 = end를 늘려 한칸 옮긴다.
// k 보다 크면 값을 빼야한다 = start를 한 칸 옮긴다.
// k 와 같다면 이전에 찾았던 윈도우와 비교하여 우선순위가 높을 때 교체.


