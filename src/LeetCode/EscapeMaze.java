package LeetCode;

public class EscapeMaze {
    public int solution(String[] maps) {




        return -1;
    }
}


// 각 칸은 통로/ 벽으로 구성. 벽은 통과 불가. 통로만 이동가능
// 통로 중 미로를 나가는 문 있으며, 레버를 당겨야 열 수 있다.
// 즉, 나가기 위해선 먼저 레버를 당기고, 탈출구로 도착해야함.
// 레버를 당기지 않았더라도 탈출구가 있는 칸을 통과할 수는 있다.
// 미로 1칸을 이동하는데 1초가 걸린다 할 때, 최대한 빠르게 미로를 빠져나가는 시간 구하기.

//maps[i]는 다음 5개의 문자들로만 이루어져 있습니다.
//S : 시작 지점
//E : 출구
//L : 레버
//O : 통로
//X : 벽
// E, L, O 는 하나씩, 위치는 겹치지 않는다.
// ex) maps = ["SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"]	result = 16
// 각 행이 문자열로 주어지므로 분해를 한다.
//`int[] answer = new int[n];`
//n의 길이를 가진 정수 배열 초기화, 정수 배열 초기값은 0으로, n=4면
//answer = [0, 0, 0, 0]인 배열 초기화.




// 미로를 나타낸 문자열 배열 maps가 주어질 때,
// 탈출에 필요한 최소시간을 반환, 탈출할 수 없다면 -1

// 최대한 빠르게 탐색 = bfs
// 레버에 도달 - 탈출구 도착
// 이미 지나간 곳을 못지나가던지의 제한이 없으므로
// 최단시간 =
// 시작점에서 레버까지의 최단시간
// + 레버에서 탈출구까지의 최단시간.

