package LeetCode;

class PerfectTriangle {
    public int solution(int[] sides) {
        int answer = 0;

        for(int i= 0; i<sides.length; i++){
            if(sides[i] > sides[i+1]){

            }
        }


        return answer;
    }
}

// 선분 세 개로 삼각형을 만들기 위한 조건.
// '가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 한다.'
// 삼각형 세 변의 길이가 담긴 배열 sides가 매개변수로 주어질 때,
// 세 변으로 삼각형을 만들 수 있다면 1, 없다면 2를 반환.