#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


int main() {
  int *p, *q, n, k, ans, cpoint = 0;

  printf("몇 개의 덧셈 문제를 만들까요? ");
  scanf("%d", &n);

  p = (int *)malloc(sizeof(int) * n);
  q = (int *)malloc(sizeof(int) * n);

  for(k = 0; k < n; k ++) {
    *(p + k) = k + 20;
    *(q + k) = (k + 1) * 20 - 15;

    printf("%d + %d = ", *(p + k), *(q + k));
    scanf("%d", &ans);

    if(ans == (*(p + k) + *(q + k))) {
      printf("Correct!!!\n");
      cpoint++;
    }
    else
      printf("Wrong!!! Answer = %d\n", *(p + k) + *(q + k));
  }

  printf("%d개의 문제 중 %d개 계산 패스했습니다...\n", n, cpoint);
}