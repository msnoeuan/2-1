#include <stdio.h>

int main() {
    int intk = -101, *ip;
    char ch = 'A', *cp;
    char str[20] = "소중한 오늘", *sp;
    float fdata = 12.357, *fp;
    double ddata = -12.357, *dp;

    ip = &intk;
    cp = &ch;
    sp = str;  // sp = &str[0];
    fp = &fdata;
    dp = &ddata;

    printf("------연결된 포인터를 통해 데이터값 출력-----\n");
    printf("int data : %d\n", *ip);
    printf("char data : %c\n", *cp);
    printf("str data : %s\n", sp);  // %s : 문자열 포인터 주소를 달라!
    printf("float data : %.3f\n", *fp);
    printf("double data : %.3f\n", *dp);

    printf("\n\n------포인터 변수(주소)값 출력-----\n");
    printf("int 주소 : %u\n", ip);
    printf("char 주소 : %u\n", cp);
    printf("str 주소 : %u\n", sp);  // str은 배열의 이름 &str[0]
    printf("float 주소 : %u\n", fp);
    printf("double 주소 : %u\n", dp);

    return 0;
}
