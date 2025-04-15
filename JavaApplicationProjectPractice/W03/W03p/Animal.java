package W03p;

abstract class Animal {
    String name;
    abstract void move();
}

class Tiger extends Animal {
    int age;

    void move() {
        System.out.println("네 발로 이동한다");
    }
}

class Eagle extends Animal {
    String home;

    void move() {
        System.out.println("날개로 이동한다");
    }
}
