// n 개의 양의 정수를 입력 받아 홀수의 합과 짝수의 합을 구하는 알고리즘을 작성하시오.
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
  int n, num, oddsum = 0, evensum = 0, count = 0;
  printf("입력할 숫자의 개수 : ");
  scanf("%d", &n);

  while(count < n) {
    printf("Enter a number: ");
    scanf("%d", &num);

    if(num % 2 == 0)  // !(num % 2)
      evensum += num;
    else
      oddsum += num;

    count++;
  }

  printf("짝수의 합 : %d / 홀수의 합 : %d\n", evensum, oddsum);
}