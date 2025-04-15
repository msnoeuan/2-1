// 세 수를 읽어들여서 그 중 가장 큰 값을 찾아 출력하는 알고리즘을 작성하시오.
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
    int n1, n2, n3, large = 0;

    printf("Enter three numbers : ");
    scanf("%d %d %d", &n1, &n2, &n3);

    if (n1 > n2)
        large = n1;
    else
        large = n2;

    if (n3 > large)
        large = n3;

    printf("The large number is %d\n", large);
}