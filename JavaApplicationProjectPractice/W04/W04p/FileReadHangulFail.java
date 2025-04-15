package W04p;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulFail {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/YerinBaek.txt");
            in = new InputStreamReader(fin, "US-ASCII");
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while((c = in.read()) != -1)
                System.out.print((char)c);

            in.close();
            fin.close();
        }
        catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
