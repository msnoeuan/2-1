#include <stdio.h>
#include <stdlib.h>

int main() {
  int* pi, k;  // pi는 int* / k는 int형 변수
  pi = (int*)malloc(5 * sizeof(int));

  if(pi == NULL) {
    printf("메모리 할당 오류\n");
    exit(1);
  }

  *pi = 10;  // pi[0] = 20;
  *(pi + 1) = 20;  // pi[1] = 20;
  *(pi + 2) = 30;  // pi[2] = 30;
  *(pi + 3) = 40;  // pi[3] = 40;
  *(pi + 4) = 55;  // pi[4] = 50;

  printf("포인터 표현으로 출력 : ");

  for(k = 0; k < 5; k ++)
    printf("%4d", *(pi + k));  // *pi + k = 10, 11, 12, 13, 14(*pi의 우선 순위가 높음)

  printf("\n");

  printf("배열 표현으로 출력 : ");

  for(k = 0; k < 5; k ++)
    printf("%4d", pi[k]);

  printf("\n");

  free(pi);

  return 0;
}