package W02p;

import java.lang.*;

public class Exam07 {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.setColor("빨강");
        myCar1.setSpeed(0);

        Car myCar2 = new Car();
        myCar2.setColor("파랑");
        myCar2.setSpeed(0);

        Car myCar3 = new Car("초록", 0);

        myCar1.upSpeed(50);
        myCar2.upSpeed(50);
        myCar3.upSpeed(50);

        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());

        myCar2.downSpeed(20);
        myCar3.upSpeed(250);

        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());

        System.out.println("생산된 차의 대수(정적 필드) >> " + Car.carCount);
        System.out.println("생산된 차의 대수(정적 메소드) >> " + Car.currentCarCount());

        System.out.println("차의 최고 제한 속도 >> " + Car.MAXSPEED);

        System.out.println("PI의 값 >> " + Math.PI);
        System.out.println("3의 5제곱 >> " + Math.pow(3, 5));
    }
}
