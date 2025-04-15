package W07p;

import java.util.ArrayList;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("홍길동");
        nameList.add("이순신");
        nameList.add("동미래");
//        nameList.add(100);  => nameList는 문자열 타입

        for(String name : nameList) {
            System.out.println(name);
        }

        ArrayList<Integer> ageList = new ArrayList<Integer>();  // int 말고 Integer로 쓴 이유 => 클래스 이름을 적어야 하기 때문
//        ageList.add("10");  => ageList은 정수형 타입
        ageList.add(10);
        ageList.add(20);
        ageList.add(21);
        ageList.add(23);
        ageList.add(22);

        for(int age : ageList)
            System.out.println(age);

        ArrayList<Student> stuList = new ArrayList<>();

        Student s1 = new Student("동미래", "2024001", "컴소과", "객체지향프로그래밍");
        stuList.add(s1);

        Student s2 = new Student("홍길동", "2025001", "인공지능소프트웨어과", "자바프로그래밍");
        stuList.add(s2);

        Student s3 = new Student("이순신", "1600001", "해군과", "배 운항과");
        stuList.add(s3);

        for(Student stuone : stuList) {
            System.out.println(stuone);
        }
    }

}
