package HashMapTreeSet;

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet 생성
        TreeSet<Integer> scores = new TreeSet<>();

        // 1. 데이터 추가
        System.out.println("=== 데이터 추가 ===");
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        System.out.println("TreeSet: " + scores); // 자동으로 오름차순 정렬됨

        // 2. 크기 관련 메소드
        System.out.println("\n=== 크기 관련 메소드 ===");
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));

        // 3. 범위 검색
        System.out.println("\n=== 범위 검색 ===");
        System.out.println("80점 이상 90점 이하: " + scores.subSet(80, true, 90, true));
        System.out.println("90점 미만: " + scores.headSet(90));
        System.out.println("90점 이상: " + scores.tailSet(90));

        // 4. 내림차순 정렬
        System.out.println("\n=== 내림차순 정렬 ===");
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        System.out.println("내림차순 정렬: " + descendingSet);

        // 5. 순회 예제
        System.out.println("\n=== 순회 예제 ===");
        System.out.println("오름차순 순회:");
        for (Integer score : scores) {
            System.out.print(score + " ");
        }

        System.out.println("\n내림차순 순회:");
        for (Integer score : scores.descendingSet()) {
            System.out.print(score + " ");
        }

        // 6. 특정 범위 삭제
        System.out.println("\n\n=== 범위 삭제 ===");
        scores.remove(80); // 특정 원소 삭제
        System.out.println("80점 삭제 후: " + scores);

        // 7. pollFirst/pollLast 메소드
        System.out.println("\n=== poll 메소드 ===");
        System.out.println("가장 낮은 점수 꺼내기: " + scores.pollFirst());
        System.out.println("가장 높은 점수 꺼내기: " + scores.pollLast());
        System.out.println("poll 후 TreeSet: " + scores);

        // 8. String TreeSet 예제
        System.out.println("\n=== String TreeSet 예제 ===");
        TreeSet<String> names = new TreeSet<>();
        names.add("김철수");
        names.add("이영희");
        names.add("박민수");
        names.add("최지은");
        System.out.println("이름 정렬: " + names); // 가나다순 정렬

        // 9. clear
        scores.clear();
        System.out.println("\n=== 초기화 후 ===");
        System.out.println("비어있나요? " + scores.isEmpty());
    }
}