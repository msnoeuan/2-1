#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
  int i, answer, score = 0, num, correct;

  for(i = 0; i < 5; i ++) {
    correct = 0;
    num = 0;

    while(num < 3 && !correct) {
      printf("%d + %d = ", i * i, i * 10);
      scanf("%d", &answer);

      if(answer == (i * i) + (i * 10)) {
        printf("%d번째 Correct!!\n", num + 1);
        correct = 1;
        score += (20 - num * 3);
      }
      else
        printf("Try Again!!\n");
      num ++;
    }
  }
  printf("당신의 덧셈 성적은? %d\n", score);
}