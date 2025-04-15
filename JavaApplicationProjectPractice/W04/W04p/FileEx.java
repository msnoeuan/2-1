package W04p;

import java.io.File;

public class FileEx {
    public static void listDirectory(File dir) {  // list
        System.out.println("-----" + dir.getPath() + "의 서브 리스트입니다.-----");

        File[] subFiles = dir.listFiles();

        for(int i = 0; i < subFiles.length; i ++) {
            File f = subFiles[i];
            long t = f.lastModified();  // lastModified() : 파일의 마지막 수정 시간(밀리초 단위)
            System.out.print(f.getName());
            System.out.print("\t파일 크기 : " + f.length());
            System.out.printf("\t수정한 시간 %tb %td %ta %tT\n", t, t, t, t);
            // System.out.printf() : 출력 형식을 지정할 수 있는 메소드
            // %tb : 월(Month) / %td : 일(Day) / %ta : 요일(Day) / %tT : 시간(HH:mm:ss)
        }
    }

    public static void main(String[] args) {
        File f1 = new File("/Users/yooseungmin/Desktop/privateStudy_JAVA/Section07");
        System.out.println("\n" + f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
        String res = "";
        if(f1.isFile()) res = "파일";
        else if(f1.isDirectory()) res = "디렉터리";
        System.out.println(f1.getPath() + "은 " + res + "입니다.\n");

        File f2 = new File("/Users/yooseungmin/Desktop/pra/Python");
        if(!f2.exists())
            f2.mkdir();
        listDirectory(new File("/Users/yooseungmin/Desktop/pra"));
        f2.renameTo(new File("/Users/yooseungmin/Desktop/pra/Python2"));  // renameTo() : 파일 또는 디렉터리의 이름 변경
        listDirectory(new File("/Users/yooseungmin/Desktop/pra"));
    }
}
