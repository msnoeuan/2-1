#include <stdio.h>
#include <stdlib.h>  // malloc() 함수 사용


int main() {
  int *p, *q, n, k, ans, cpoint = 0;

  printf("몇 개의 덧셈 문제를 만들까요? ");
  scanf("%d", &n);

  p = (int *)malloc(sizeof(int) * n);
  q = (int *)malloc(sizeof(int) * n);

  for(k = 0; k < n; k ++) {
    // (p + k) : 주소 p에 숫자 k를 더하는게 아니라 자료형 크기만큼 k칸 이동하라는 의미(ex. int형이면 p + (k * 4)만큼 이동)
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

/*
 * <malloc()>
 * - 아무 자료형도 정해지지 않은 범용 포인터
 * - void * 타입 주소값 반환 : 자료형이 정해지지 않은 포인터
 * - 바로 사용할 수 없고 원하는 자료형의 포인터로 변환(형변환, casting) 해야 함
 * - 데이터 타입과 메모리 크기는 일치해야 함 ex) p = (int *)malloc(sizeof(float) * 5) 불가능
 */