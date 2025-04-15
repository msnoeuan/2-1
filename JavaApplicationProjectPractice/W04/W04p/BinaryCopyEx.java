package W04p;

import java.io.*;

public class BinaryCopyEx {
    public static void main(String[] args) {
        File src = new File("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/DMU.png");
        File dest = new File("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/DMUCopy.png");
        int c;

        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            while((c = fi.read()) != -1)
                fo.write((byte)c);

            fi.close();
            fo.close();
            System.out.println(src + "를 " + dest + "로 복사하였습니다.");
        }
        catch(IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
