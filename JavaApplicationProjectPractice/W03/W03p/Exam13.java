package W03p;

interface ClickListener {
    void print();
}

public class Exam13 {
    public static void main(String[] args) {
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("100.123");

        String str = "안녕하세요";
        if(str.equals("안녕하세요")) {  // if(str.equals((String)"안녕하세요")) { 도 가능
            //문자열이 같으면 이곳을 수행
        }

        ClickListener listener = (new ClickListener() {
            public void print() {
                System.out.println("클릭 리스너입니다.");
            }
        });

        listener.print();
    }
}

/*
* <익명 내부 클래스>
* - 익명 내부 클래스는 이름이 없는 클래스
* - 일회성 클래스를 정의할 때 사용
* - 인터페이스나 추상 클래스를 구현해야 하는 상황에서 별도의 클래스를 만들지 않고 즉석에서 정의하여 사용할 수 있음
*
* <특징>
* - 이름이 없음 => new 키워드로 객체를 생성할 때 즉시 클래스 정의
* - 인터페이스 또는 추상 클래스 구현 가능
* - 한 번만 사용되는 클래스(재사용이 어렵고, 해당 코드 블록 내에서만 사용됨)
* - 메소드를 오버라이딩하여 즉석에서 구현 가능
* - 주로 이벤트 처리, 스레드 구현 등에 많이 사용
* */
