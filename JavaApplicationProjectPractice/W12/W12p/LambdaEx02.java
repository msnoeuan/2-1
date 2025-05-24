package W12p;

interface MyFunction02 {  // 함수형 인터페이스
    int calc2(int x);  // 람다식으로 구현할 추상 메소드
}

public class LambdaEx02 {
    public static void main(String[] args) {
        MyFunction02 square = x -> x * x;
        System.out.println(square.calc2(2));
    }
}
