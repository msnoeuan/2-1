package W04p;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};

        try {
            FileOutputStream fout = new FileOutputStream("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/test.out");

            for(int i = 0; i < b.length; i ++)
                fout.write(b[i]);  // 배열 b의 바이너리를 그대로 기록
            fout.close();
        }
        catch(IOException e) {
            System.out.println("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/test.out에 저장할 수 없었습니다. 경로명을 확인해주세요");
            return;
        }
        System.out.println("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/test.out을 저장하였습니다.");
    }
}
