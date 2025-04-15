#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int cal(int *a, float b) {
    int c;
    c = (*a) * b;
    *a = (*a) * 2;

    return c;
}

void main() {
    int num1 = 100, num2;
    float ratio = 0.5;

    num2 = cal(&num1, ratio);

    printf("%d == %d\n", num1, num2);
}

// 포인터를 선언할 때의 *과 사용할 때의 *은 다른 역할
// 선언할 때 int *a : 포인터 변수 선언(int형 주소를 저장하겠다)
// 사용할 때 *a : a가 가리키는 주소의 값을 사용(역참조)