package W12p;

interface MyFunction {  // 함수형 인터페이스
    int calc(int x, int y);  // 람다식으로 구현할 추상 메소드
}

public class LambdaEx01 {
    public static void main(String[] args) {
        // 람다식은 인터페이스를 구현한 객체
        MyFunction add = (x, y) -> {return x + y;};  // 람다식
        MyFunction minus = (x, y) -> x- y;  // 람다식, {}와 return 생략

        System.out.println(add.calc(1, 2));  // 합 구하기
        System.out.println(minus.calc(1, 2));  // 차 구하기
    }
}
