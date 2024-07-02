package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
//      Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

//        객체 추가 put(key, value)
        map.put("신용권", 83);
        map.put("홍길동", 84);
        map.put("신용권3", 86);
//        홍길동의 값이 덮어씌워진다.
        map.put("홍길동", 80);
        System.out.println(map.size());
        System.out.println();

//        키를 통해 값 얻기.
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + value);
        System.out.println();

//        키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + v);
        }
        System.out.println();

//        엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + v);
        }
        System.out.println();

//        키로 엔트리 삭제(키로 구분하는 Map이기 때문에)
        map.remove("홍길동");

        System.out.println(map.size());
        System.out.println();
    }
}
