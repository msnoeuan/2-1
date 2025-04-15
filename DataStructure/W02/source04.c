// 10개의 수(data)를 읽어 들여 그 수가 0보다 크면 pos_sum에 더하고 0보다 작으면 nega_sum에 더하여 그 결과 pos_sum과 nega_sum을 출력하시오.
#define _CRT_SECURE_NO_WARNINGS
// 배열 크기나 반복 횟수를 하나의 이름으로 통일해서 관리하면 나중에 값을 변경하고 시을 때 SIZE값 하나만 바꾸면 됨
// 요즘엔 const int SIZE = 10;으로도 많이 사용(안정성, 가독성, 최적화)
#define SIZE 10
#include <stdio.h>

void main() {
  int data[SIZE], pos_sum = 0, nega_sum = 0;

  printf("Enter 10 integers: ");
  for (int i = 0; i < SIZE; i ++) {
    scanf("%d", &data[i]);

    if (data[i] > 0)
      pos_sum += data[i];
    else
      nega_sum += data[i];
  }

  printf("Positive sum = %d\n", pos_sum);
  printf("Negative sum = %d\n", nega_sum);

}