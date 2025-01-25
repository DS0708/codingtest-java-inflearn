package HashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 1. 데이터 추가 (put)
        map.put("김철수", 95);
        map.put("이영희", 88);
        map.put("박민수", 76);
        map.put("최지은", 92);

        // 2. 데이터 조회 (get)
        System.out.println("김철수의 점수: " + map.get("김철수")); // 95 출력

        // 3. 키가 존재하는지 확인 (containsKey)
        System.out.println("박민수라는 학생이 있나요? " + map.containsKey("박민수")); // true 출력

        // 4. 값이 존재하는지 확인 (containsValue)
        System.out.println("90점을 받은 학생이 있나요? " + map.containsValue(90)); // false 출력

        // 5. 데이터 삭제 (remove)
        map.remove("최지은");

        // 6. HashMap 크기 확인 (size)
        System.out.println("총 학생 수: " + map.size()); // 3 출력

        // 7. 모든 키-값 쌍 출력
        System.out.println("\n전체 학생 성적 출력:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 8. 모든 키 출력
        System.out.println("\n전체 학생 명단:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 9. 모든 값 출력
        System.out.println("\n전체 점수:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 11. keySet을 이용한 전체 데이터 접근
        Set<String> keySet = map.keySet();
        System.out.println("\n== keySet을 이용한 전체 출력 ==");
        for (String key : keySet) {
            System.out.println("학생: " + key + ", 점수: " + map.get(key));
        }

        // 12. values를 이용한 점수 통계
        Collection<Integer> values = map.values();
        System.out.println("\n== 점수 통계 ==");
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int score : values) {
            sum += score;
            max = Math.max(max, score);
            min = Math.min(min, score);
        }

        System.out.println("평균 점수: " + (sum / values.size()));
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);

        // 13. getOrDefault 사용
        System.out.println("\n== getOrDefault 사용 ==");
        System.out.println("장민호(없는 학생)의 점수: " + map.getOrDefault("장민호", -1));

        // 14. putIfAbsent 사용
        System.out.println("\n== putIfAbsent 사용 ==");
        map.putIfAbsent("김철수", 80); // 이미 있는 학생
        map.putIfAbsent("장민호", 85); // 새로운 학생
        System.out.println("김철수 점수: " + map.get("김철수")); // 기존 점수 유지
        System.out.println("장민호 점수: " + map.get("장민호")); // 새로 추가된 점수

        // 10. HashMap 비우기 (clear)
        map.clear();
        System.out.println("\n전체 삭제 후 학생 수: " + map.size()); // 0 출력
    }
}