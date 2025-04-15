package W03p;

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("유승민", "서울시", "010-1111-1111", 20230880, "컴소과");
        Student st2 = new Student("학생2", "수원시", "010-2222-2222", 20241111, "경영학과");
        Student st3 = new Student("학생3", "인천", "010-3333-3333", 20228888, "기계공학과");

        st1.print();
        st2.print();
        st3.print();
    }
}
