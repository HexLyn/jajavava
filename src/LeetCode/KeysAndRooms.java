package LeetCode;

public class KeysAndRooms {

}

// n개의 rooms, 방의 이름은 0부터 n-1 로 정해짐.
// 0번방 빼고는 다 잠겨있다.
// 모든 방을 방문하는게 목표.
// 열쇠없이 잠긴 방을 열 순 없다.

// 각 방에 방문 시, 열쇠를 받는다.
// 각 열쇠는 번호가 적혀있고, 해당 번호의 방을 열 수 있다.

//rooms 배열을 받고, rooms[i]는 방에서 얻을 수 있는 열쇠의 꾸러미.
// i번 room 방문 시, true 반환, 모든 방을 방문 할 수 있으면 true,
// 아니면 false 반환.