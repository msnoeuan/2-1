package W04p;

import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;

        try {
            fin = new FileReader("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/LastTrain.txt");
            int c;

            while((c = fin.read()) != -1) {  // 파일 끝(EOF, End Of File)에 도달하면 -1을 반환
                // fin.read()는 파일에서 1 바이트씩 읽고, 해당 문자의 유니코드(정수)를 반환
                System.out.print((char) c);
            }
            fin.close();  // 자원을 다른 사람들이 쓸 수 있도록 닫아줌
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("존재하지 않는 파일입니다.");
        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println("입출력 오류");
        }
    }
}
