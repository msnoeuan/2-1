// 다음의 ssum과 psum을 계산하는 알고리즘을 작성하시오.
// ssum = 1 + (1+2) + . . . + (1+2 +. . . +n)
// psum = 1 + (1*2) + . . . + (1*2 *. . . *n)
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
  int n, ssum = 0, psum = 0;

  printf("n을 입력하세요 >> ");
  scanf("%d", &n);

  for(int i = 1; i <= n; i ++) {
    int temp1 = 0, temp2 = 1;
    for(int j = 1; j <= i; j ++) {
      temp1 += j;
      temp2 *= j;
    }
    ssum += temp1;
    psum += temp2;
  }
  printf("부분합 : %d, 부분곱 : %d\n", ssum, psum);
}