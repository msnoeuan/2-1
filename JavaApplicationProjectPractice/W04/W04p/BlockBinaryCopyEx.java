package W04p;

import java.io.*;

public class BlockBinaryCopyEx {
    public static void main(String[] args) {
        File src = new File("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/puppy.jpg");
        File dest = new File("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/puppyCopy.jpg");

        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            // 사용자 정의 버퍼링 : 수동으로 만든 byte[] buf 자체가 버퍼 역할
            byte[] buf = new byte [1024 * 10];  // 10KB 버퍼, 가독성을 위해 1024 * 10으로 표현

            while(true) {
                int n = fi.read(buf);  // 버퍼 크기만큼 읽기, 루프 돌 때마다 새로운 데이터 읽어서 채움
                fo.write(buf, 0, n);  // buf[0]부터 n 바이트 쓰기

                if (n < buf.length)  // EOF(-1)을 직접 비교하지 않고 블록 크기와 비교해서 루프 탈출
                    break;
            }
            fi.close();
            fo.close();

            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        }
        catch(IOException e) {
            System.out.println("파일 오류 복사");
        }
    }
}
/*
* read()는 항상 1바이트씩 처리함
*
* <BinaryCopyEx.java>
* - byte는 1바이트(8비트)라 0xFF(10진수로 255)가 -1로 해석됨
* - 그러면 EOF(-1)과 충돌될 수 있기 때문에 int로 c를 받음
*
* <BlockBinaryCopyEx.java>
* - int는 4바이트(32비트)라 0xFF(10진수로 255)가 255 그대로 유지
* - EOF(-1)과 구분 가능
* */
