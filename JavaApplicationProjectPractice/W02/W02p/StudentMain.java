package W02p;

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("유승민", 20230880, 23);
        Student st2 = new Student("홍길동", 20240000, 22);

        System.out.println(st1.toString());
        System.out.println(st2.toString());
    }
}
