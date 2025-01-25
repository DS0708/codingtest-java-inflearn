package HashMapTreeSet;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Comparator;

class Student implements Comparable<Student> {
    private String name;
    private int height;

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', height=" + height + "}";
    }

    // 키 기준 오름차순 정렬을 위한 기본 비교 메서드
    @Override
    public int compareTo(Student other) {
        return this.height - other.height;
    }
}

public class TreeSetExample2 {
    public static void main(String[] args) {
        // 학생 데이터 생성
        Student student1 = new Student("김철수", 170);
        Student student2 = new Student("이영희", 165);
        Student student3 = new Student("박민수", 180);
        Student student4 = new Student("최지은", 168);

        // 1. 키 기준 오름차순 정렬 (Comparable 인터페이스 사용)
        TreeSet<Student> heightAscSet = new TreeSet<>();
        System.out.println("=== 키 기준 오름차순 정렬 ===");
        heightAscSet.add(student1);
        heightAscSet.add(student2);
        heightAscSet.add(student3);
        heightAscSet.add(student4);

        for (Student student : heightAscSet) {
            System.out.println(student);
        }

        // 2. 키 기준 내림차순 정렬 (Comparator 사용)
        //TreeSet<Student> heightDescSet = new TreeSet<>((s1, s2) -> s2.getHeight() - s1.getHeight());
        TreeSet<Student> heightDescSet = new TreeSet<>(Collections.reverseOrder());
        System.out.println("\n=== 키 기준 내림차순 정렬 ===");
        heightDescSet.add(student1);
        heightDescSet.add(student2);
        heightDescSet.add(student3);
        heightDescSet.add(student4);

        for (Student student : heightDescSet) {
            System.out.println(student);
        }

        // 3. 이름 기준 오름차순 정렬 (Comparator 사용)
        TreeSet<Student> nameAscSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("\n=== 이름 기준 오름차순 정렬 ===");
        nameAscSet.add(student1);
        nameAscSet.add(student2);
        nameAscSet.add(student3);
        nameAscSet.add(student4);

        for (Student student : nameAscSet) {
            System.out.println(student);
        }

        // 4. 이름 기준 내림차순 정렬 (람다식 사용)
        TreeSet<Student> nameDescSet = new TreeSet<>((s1, s2) ->
                s2.getName().compareTo(s1.getName())
        );

        System.out.println("\n=== 이름 기준 내림차순 정렬 ===");
        nameDescSet.add(student1);
        nameDescSet.add(student2);
        nameDescSet.add(student3);
        nameDescSet.add(student4);

        for (Student student : nameDescSet) {
            System.out.println(student);
        }

        // 5. TreeSet의 추가 기능 활용
        System.out.println("\n=== TreeSet 추가 기능 ===");
        // 키가 가장 작은/큰 학생
        System.out.println("가장 작은 학생: " + heightAscSet.first());
        System.out.println("가장 큰 학생: " + heightAscSet.last());

        // 170cm 바로 위/아래 학생
        System.out.println("170cm 바로 아래 학생: " + heightAscSet.lower(student1));  // 170cm 미만
        System.out.println("170cm 바로 위 학생: " + heightAscSet.higher(student1));   // 170cm 초과

        // 170cm 이하/이상 학생
        System.out.println("170cm 이하 학생: " + heightAscSet.floor(student1));   // 170cm 포함
        System.out.println("170cm 이상 학생: " + heightAscSet.ceiling(student1)); // 170cm 포함
    }
}