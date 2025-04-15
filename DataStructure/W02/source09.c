// 음수가 나올 때까지 양수를 읽은 후, 입력된 데이터 수와 최대 값을 구하는 알고리즘을 작성하시오(단 처음부터 음수를 입력하는 경우“No data!!”라고 출력하고 끝낸다).
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
  int num, size = 0, max = 0;

  printf("숫자를 입력하세요 >> ");
  scanf("%d", &num);

  while(num > 0) {
    size ++;

    if(num > max)
      max = num;

    printf("숫자를 입력하세요 >> ");
    scanf("%d", &num);
  }

  printf("데이터의 수 : %d, ", size);

  if(size == 0)
    printf("No data!!");
  else
    printf("최대 값 : %d", max);
}