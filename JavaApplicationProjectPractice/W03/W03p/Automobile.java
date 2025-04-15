package W03p;


public class Automobile extends Car {
    int seatNum;

    Automobile() {}

    Automobile(String color, int speed, int seatNum) {
        super(color, speed);
        this.seatNum = seatNum;
    }

    int getSeatNum() {
        return seatNum;
    }

    void upSpeed(int value) {
        if(getSpeed() + value >= 300)
            setSpeed(300);
        else
            setSpeed(getSpeed() + (int)value);
    }
}
