#include <stdio.h>

// 함수 원형(Function Prototype)
// 매개변수 이름 생략하고 자료형만 적어도 됨
int my_pow(int x, int y);

void main() {
  int k;

  for(k = 2; k < 6; k ++)
    printf("%d ** %d = %d\n", k, k + 1, my_pow(k, k + 1));  // k, k + 1 : argument(인수)
}

// 함수 정의(Function Definition) => 함수 정의를 맨 위에 적으면 함수 원형 안 써도 됨
int my_pow(int x, int y) {  // x, y : paramter(매개변수)
  int i, ans = 1;

  for(i = 0; i < y; i ++)
    ans *= x;

  return ans;
}