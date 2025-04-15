#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
  int exarray[100], k;

  printf("Input 10 test data : ");

  for(k = 0; k < 10; k ++)
    scanf("%d", &exarray[k]);
  for(k = 9; k >= 0; k --)
    printf("%d ", exarray[k]);
}
