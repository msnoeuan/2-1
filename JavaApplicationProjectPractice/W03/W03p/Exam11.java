package W03p;

// 다형성(Polymorphism) 개념을 활용한 업캐스팅(Upcasting)
public class Exam11 {
    public static void main(String[] args) {
        Animal animal;

        animal = new Tiger();  // Tiger 객체를 생성하여 부모 타입(Animal) 변수에 저장
        animal.move();

        animal = new Eagle();
        animal.move();
    }
}

/*
* animal이라는 부모 타입 변수에 Tiger 또는 Eagle 객체를 대입하면서 동적 바인딩(Dynamic Binding)이 발생함
*
* 1) 다형성
* - 하나의 부모 타입으로 여러 자식 객체를 다룰 수 있는 개념
*
* 2) 업캐스팅
* - 자식 객체를 부모 타입 변수에 저장하는 과정
* - 자식 클래스가 부모 클래스를 상속받으면서 부모 타입으로 변수를 선언할 수 있음
* - 업캐스팅을 하면 부모 클래스의 기능만 직접 호출 가능하지만, 오버라이딩 메소드는 동적으로 바인딩됨
*
* 3) 동적 바인딩
* - animal.move()를 호출할 떼, 컴파일 시점에서 Animal 클래스의 move() 메소드를 찾지만, 실제 실행될 때는 객체의 타입의 move()가 실행됨
* - 메소드 오버라이딩(Override)된 메소드가 실행되는 것
* */