package LeetCode;

class NumberOfIslands {
        static boolean visited[][];
        // 해당 좌표의 방문 여부를 저장.

        boolean isInRange(int r, int c, int rowLength, int colLength){
            return (r >= 0 && r < rowLength) && (c >= 0 && c < colLength);
            // r이 0보다 크고, rowLength보다 작으며(AND), c가 0보다 크고 colLength보다 작을 때.
            // 0보다 크다는 조건은 최소 범위가 grid 배열로 주어지므로 0보다 작은건 설정한 경계 바깥임을 의미.
            // rowLength, colLength 보다 작음 또한 주어진 grid 배열의 가로, 세로 길이를 의미. 이를 벗어날 수 없음.
        }

        // 섬의 개수를 세기 위한 메서드
        public int numIslands(char[][] grid) {
            int numberOfIslands = 0;
            // 반환할 섬의 개수 초기값 0 설정.

            int rowLength = grid.length;
            // 주어진 grid의 세로 길이

            int colLength = grid[0].length;
            // 주어진 grid의 0번째 배열의 길이를 통해 가로길이

            visited = new boolean[rowLength][colLength];
            // visited boolean 배열의 초기화.

            //Grid의 순회
            for( int i = 0; i < rowLength; i++ ) {
                for ( int j = 0; j < colLength; j++ ){
                    if ((grid[i][j] == '1') &&  (!visited[i][j])){
                        //grid[i][j]가 1이고(땅), 그 땅에 아직 방문하지 않았다면,
                        // 문제에서 grid 배열의 값들은 전부 문자열이다.
                        //"1", "0", 조건문 걸어줄 때에도 문자열 처리 해줘야 함.

                        dfs(i,j, grid);
                        //dfs 메서드 실행.

                        numberOfIslands++;
                        // 섬 개수 카운트.
                    }
                }
            }
            return numberOfIslands;
            // for문이 끝나고 최종 섬의 개수 반환.
        }

        public void dfs(int r, int c, char[][] grid){
            int rowLength = grid.length;
            int colLength = grid[0].length;
            int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            // dir는 이동가능한 방향(상하좌우)을 설정해주는 역할이다.

            visited[r][c] = true;
            //현재 위치를 방문한 것으로 처리(true).
            // r,c의 경우, dfs를 호출할 때, (i,j)를 받아온다.
            // 해당 반복문 내에서 visited[i][j]로 처리.

            for (int[] d : dir){
                // 향상된 for문을 이용해 정수배열 d와 dir를 연결.

                int nextRow = r + d[0];
                // 다음 행: r(i)에 d[0]번째를 더함.
                int nextCol = c + d[1];
                // 다음 열: c(j)에 d[1]번째를 더함.

                if(isInRange(nextRow, nextCol, rowLength, colLength)){
                    // 위에서 isInRange는 참, 거짓을 반환하는 함수(제공된 범위 내에 위치하는지 여부).
                    // 이를 통해 이동한 위치가 범위 내에 위치하는지를 확인한다.

                    if (grid[nextRow][nextCol] == '1' && !(visited[nextRow][nextCol])){
                        // 만약, 이동한 결과의 grid 위치가 1이고, visited가 not(false)라면,
                        // 먼저 계산한 섬과는 떨어진 다른 섬이므로 다시 한 번 dfs를 호출(재귀)한다.
                        dfs(nextRow, nextCol, grid);
                    }
                }
            }
        }
    }

// 2차원 배열 grid를 받는다. 1은 땅, 0은 물이다.
// 섬의 개수를 반환하라. 수평, 수직으로 연결되어 있어야 하나의 섬으로 본다.
// 범위 바깥의 값이 없는 영역 또한 0과같이 통과 불가능하다.

//Input: grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//Output: 1
// 위 예제에서 모든 땅(1)은 연결되어 있으니 섬은 1개.

// 1이면서 visited가 체크안된(false) 위치를 찾는다(섬 찾기).
// 연결된 모든 곳에 visited를 체크해준 뒤(dfs/bfs), 섬을 센다(count++).
// 위 과정 반복.