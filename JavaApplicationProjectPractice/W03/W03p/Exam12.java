package W03p;

interface IAnimal {
    void eat();  // public abstract 생략
}

class ICat implements IAnimal {
    public void eat() {  // 인터페이스 메소드를 오버라이딩할 때는 반드시 public으로 구현
        System.out.println("생선을 좋아한다.");
    }
}

class ITiger extends Animal implements IAnimal {
    void move() {
        System.out.println("어흥~");
    }

    public void eat() {
        System.out.println("멧돼지를 잡아먹는다.");
    }
}

public class Exam12 {
    public static void main(String[] args) {
        ICat cat = new ICat();
        cat.eat();

        ITiger tiger = new ITiger();
        tiger.move();
        tiger.eat();
    }
}
