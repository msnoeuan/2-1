// 0-100점인 n명 학생의 성적을 입력받아 평균과 최고점을 출력하는 알고리즘을 작성하시오.
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
  int n, score, max = 0;
  double avg = 0;

  printf("학생 수를 입력하세요 >> ");
  scanf("%d", &n);

  for(int i = 0; i < n; i ++) {
    printf("성적을 입력하세요 >> ");
    scanf("%d", &score);
    avg += score;

    if(score > max)
      max = score;
  }

  avg /= n;

  printf("평균 : %f, 최고점 : %d\n", avg, max);
}