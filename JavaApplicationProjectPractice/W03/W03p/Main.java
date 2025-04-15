package W03p;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("은색", 0);
        Automobile myAuto = new Automobile("흰색", 0, 6);

        myCar.upSpeed(300);
        System.out.println(myCar.getColor() + ", " + myCar.getSpeed());
        myAuto.upSpeed(300);
        System.out.println(myAuto.getColor() + ", " + myAuto.getSpeed() + ", " + myAuto.getSeatNum());
    }
}
