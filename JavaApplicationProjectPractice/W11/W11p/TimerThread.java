package W11p;

public class TimerThread extends Thread{  // 스레드 클래스 정의
    int n = 0;

    @Override
    public void run() {  // 스레드 코드 작성
        while(true) {  // 무한루프
            System.out.println(n);
            n ++;

            try {
                Thread.sleep(1000);  // Thread 클래스 상속받았기 때문에 sleep(1000)이라 작성해도 됨
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    public static void main(String[] args) {
        TimerThread th = new TimerThread();  // 스레드 객체 생성
        th.start();  // 스레드 시작
    }
}
