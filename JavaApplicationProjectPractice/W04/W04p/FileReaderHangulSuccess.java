package W04p;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            // 바이트 스트림
            // 문서는 문자로 되어있지만, 컴퓨터는 모든 데이터를 바이트로 저장하고 읽음. 따라서 텍스트 파일도 결국 바이트 단위로 저장
            fin = new FileInputStream("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/YerinBaek.txt");
            // 문자 스트림
            in = new InputStreamReader(fin, "UTF-8");
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

/*
* <FileReader>
* - 플랫폼 기본 인코딩과 동일한 텍스트 파일을 읽을 때 권장
*
* <FileInputStream + InputStreamReader>
* - 다양한 인코딩의 텍스트 파일을 읽을 때
* */
