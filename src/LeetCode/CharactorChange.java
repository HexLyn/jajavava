import java.util.*;

static Map<String, List<String>> wordsGraph = new HashMap<>();
static Map<String, Boolean> visited = new HashMap<>();

public class Solution {
    public static int CharactorChange(String begin, String target, String[] words) {
        int answer = 0;

        //Graph 초기화
        List<String> allwords = new ArrayList<>(Arrays.asList(words));
        allwords.add(begin);

        // 그래프 생성
        for (String word : allwords) {
            wordsGraph.put(word, new ArrayList<>());
            for (String nextWord : allwords) {
                if (isOneCharDiff(word, nextWord)) {
                    wordsGraph.get(word).add(nextWord);
                }
            }
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(begin);
        visited.put(begin, true);

        while (!queue.isEmpty()) {
            int size = queue.size();
            answer++;
            for (int i = 0; i < size; i++) {
                String curWord = queue.poll();
                for (String nextWord : wordsGraph.get(curWord)) {
                    if (nextWord.equals(target)) {
                        return answer;
                    }
                    if (!visited.getOrDefault(nextWord, false)) {
                        visited.put(nextWord, true);
                        queue.add(nextWord);
                    }
                }
            }
        }
        return 0;
    }

    private static boolean isOneCharDiff(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
        }
        return diffCount == 1;
    }
}
public static void main(String[] args) {
}

// 두 개의 단어, begin, target과 단어의 집합 words가 있다.
// 한 번에 한 개의 알파벳만 바꿀 수 있다.
// words에 있는 단어로만 변환 가능하다.

//begin ="hit", target="cog",
//words =["hot","dot","dog","lot","log","cog"] 라면,
// "hit" -> "hot" -> "dot" -> "dog" -> "cog" 와 같이 4단계를 거쳐 변환한다.
//최소 몇단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return

// BFS로 가장 빨리 begin == target이 될 때를 반환한다.
// 매 회전에서 begin의 글자와 words[i]번째 글자 간 차이를 확인,
// 차이가 1개일 때 선택가능. 선택하면서 단계(answer)++로 계산. 같아질 때 ansswer를 반환.