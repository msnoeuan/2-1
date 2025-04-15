package W02p;

public class Exam06 {
    static int var = 100;
    // static 변수는 클래스 수준의 변수이므로 main 메소드 안에서 선언할 수 없음
    // 객체 생성 없이 클래스 이름을 통해 접근할 수 있음

    public static void main(String[] args) {
        int num1 = 100, num2 = 0;

        try {
            System.out.println(num1 / num2);
        }
        catch(Exception e) {   // catch(java.lang.ArithmeticException e)와 동일
            e.printStackTrace();  // 예외가 발생했을 때 예외의 발생 원인과 위치를 추적하여 출력하는 메소드
            System.out.println("계산에 문제가 있습니다.");
        }
    }
}
