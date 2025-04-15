#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int pcount(int a[]) {
  int result = 0;

  for(int j = 0; j < 10; j ++)
    if (a[j] > 0)
      result ++;

  return result;
}

void main() {
  int data[10], k;

  printf("Enter 10 data : ");

  for(k = 0; k < 10; k ++)
    scanf("%d", &data[k]);

  printf("양의 개수는 %d\n", pcount(data));
}