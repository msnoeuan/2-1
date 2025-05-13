#include <stdio.h>
#include <stdlib.h>
#define MAX_STACK_SIZE 50

typedef struct {
  int key;
  char grade;
} element;

int top = -1;
element stack[MAX_STACK_SIZE];
void push(element data);
element pop();

void main() {
  element data;
  int num = 0, n, cond = 1;

  while(cond) {
    printf("Input data: ");
    scanf("%d %c", &data.key, &data.grade);

    if(data.key != 0) {
      push(data);
      num ++;
    }

    printf("Continue..(1 / 0)");
    scanf("%d", &cond);
  }

  printf("입력한 데이터의 개수 : %d\n", num);

  printf("스택에서 몇 개의 데이터가 필요하세요?");
  scanf("%d", &n);

  for(int i = 0; i < n; i ++) {
    data = pop();
    printf("%d\t %c\n", data.key, data.grade);
  }
}

void push(element item) {
  if(top >= MAX_STACK_SIZE - 1)
    printf("Stack is overflow!!\n");
  else {
    top ++;
    stack[top] = item;
  }
}

element pop() {
  if (top == -1) {
    printf("Stack is empty!!!");
    exit(1);
  }
  else
    return stack[top --];
}

