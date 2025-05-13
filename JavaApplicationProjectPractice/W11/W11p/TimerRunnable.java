package W11p;

public class TimerRunnable implements Runnable {
    int n = 0;

    @Override
    public void run() {
        while(true) {
            System.out.println(n);
            n ++;

            try {
                Thread.sleep(1000);  // 상속받고 있지 않기 때문에 클래스명 작성 필수
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(new TimerRunnable());
        th.start();
    }
}
