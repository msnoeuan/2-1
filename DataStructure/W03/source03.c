#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
  int num, n, p, count = 0;

  printf("양의 정수 입력 : ");
  scanf("%d", &n);

  num = n;
  while((num % 2) == 0) {
    printf("%4d", 2);
    num /= 2;
    count ++;
  }

  p = 3;
  while(num != 1) {
    if((num % p) == 0) {
      printf("%4d", p);
      num /= p;
      count ++;
    }
    else
      p += 2;
  }
  printf("\ncount = %d\n", count);
}