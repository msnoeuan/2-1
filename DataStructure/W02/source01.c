// 포인터의 개념 이해
#include <stdio.h>

void main() {
    int *ip, idata;
    double *fp, fdata;

    idata = -911;
    fdata = 3.1416;

    ip = &idata;
    fp = &fdata;

    printf("int pointer = %u\n", ip);  // 부호 없는 10진수(unsigned int)로 출력할 때 사용하는 형식 지정자
    printf("int pointer = %p\n", ip);
    printf("int data = %d\n", *ip);
    printf("double pointer = %u\n", fp);
    printf("double data = %.4f\n", *fp);
}