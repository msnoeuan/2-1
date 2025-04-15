package W04p;

import java.io.*;
import java.util.*;

public class UserMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<User> userList = new ArrayList<>();
        String outputFile = "/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/UserOutput.txt";

        while(true) {
            System.out.print("이름을 입력하세요(그만 입력 시 종료) >> ");
            String name = sc.nextLine();

            if(name.equals("그만"))
                break;

            System.out.print("나이를 입력하세요 >> ");
            int age = sc.nextInt();
            sc.nextLine();  // 버퍼에 남아있는 개행 문자 제거

            User user = new User(name, age);
            userList.add(user);
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            for(User user : userList)
                bw.write(user.toString());
            System.out.println("입력한 정보가 " + outputFile + " 파일에 저장되었습니다.");
            bw.close();
        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println("오류가 발생하였습니다.");
        }
        sc.close();
    }
}
