// 양의 정수를 읽어 끝자리 숫자부터 출력하는 알고리즘을 작성하시오.
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
    int num, r = 0;

    printf("양의 정수를 입력하세요 >> ");
    scanf("%d", &num);

    while (num > 0) {
        r = num % 10;
        num = num / 10;
        printf("%d ", r);
    }
}