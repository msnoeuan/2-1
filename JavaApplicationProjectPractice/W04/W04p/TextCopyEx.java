package W04p;

import java.io.*;

public class TextCopyEx {
    public static void main(String[] args) {
        File src = new File("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/LastTrain.txt");  // 원본 파일 경로명
        // String src = ""/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/LastTrain.txt" 도 가능
        File dest = new File("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W04/LastTrainCopy.txt");  // 복사 파일 경로명
        int c;

        try {
            // FileReader fr = new FileReader(src);
            BufferedReader br = new BufferedReader(new FileReader(src));
            FileWriter fw = new FileWriter(dest);
            BufferedWriter bw = new BufferedWriter(fw);

            while((c = br.read()) != -1)
                fw.write((char)c);

            bw.close();
            fw.close();
            br.close();

            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
            /*
            * src를 출력하면 getPath()와 같은 결과가 출력
            * src는 File 객체이고, src.getPath()는 문자열
            * */
        }
        catch(IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}

/*
* close() 순서
* - Writer 먼저, Reader 나중
* - Buffered 먼저, File 나중
* */
