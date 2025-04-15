package W02p;

public class Car {
    private String color;
    private int speed = 0;
    static int carCount = 0;
    final static int MAXSPEED = 200;
    final static int MINSPEED = 0;

    Car() {
        //초기값 지정 안 하면 String은 NULL / int는 0으로 지정
        carCount ++;
    }

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
        carCount ++;
    }

    static int currentCarCount() {
        return carCount;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void upSpeed(int value) {
        if(speed + value >= 200)
            speed = 200;
        else
            speed = speed + value;
    }

    void downSpeed(int value) {
        if(speed - value <= 0)
            speed = 0;
        else
            speed = speed - value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
