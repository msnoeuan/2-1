package W04p;

import java.util.Scanner;

public class InOutEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름과 나이를 입력하세요 >> ");
        String name = sc.next();
        int age = sc.nextInt();
        // 한 줄씩 받으려면 nextLine();

        System.out.println(name + "님, 당신의 나이는 " + age + "살입니다.");
        sc.close();
    }
}
