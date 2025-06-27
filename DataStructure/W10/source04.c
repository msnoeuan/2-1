#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int key;
  char grade;
} element;

typedef struct node {
  element data;
  struct node* next;
} StackNode;

StackNode* top = NULL;
void pushlist(element data);
element poplist();

void main() {
  element data;
  int i = 0, n, cond = 1;

  while(cond) {
    printf("데이터 입력 : ");
    scanf("%d %c", &data.key, &data.grade);

    if(data.key != 0) {
      pushlist(data);
      i ++;
    }

    printf("스택에 데이터를 계속 입력하실래요?(1 / 0)");
    scanf("%d", &cond);
  }

  printf("입력한 데이터의 개수 : %d\n", i);

  printf("스택에서 몇 개의 데이터가 필요하세요?");
  scanf("%d", &n);

  printf("스택에서 삭제한 데이터 :\n");
  for(i = 0; i < n; i ++) {
    data = poplist();
    printf("%d\t %c\n", data.key, data.grade);
  }
}

void pushlist(element item) {
  StackNode* inode;
  inode = (StackNode*)malloc(sizeof(StackNode));
  inode -> data = item;
  inode -> next = top;
  top = inode;
}

element poplist() {
  element item;
  StackNode* dnode;

  if(top == NULL) {
    printf("Stack is empty!!");
    exit(1);
  }
  else {
    dnode = top;  // top은 연결된 노드들의 출발점 역할
    item = dnode -> data;
    top = top -> next;
    free(dnode);

    return item;
  }
}

/*
 * 구조체 대신 구조체 포인터를 사용하는 이유(top, inode, dnode 등)
 * - 데이터 연결을 위해 : 구조체 자체를 넣으면 원본이 아니라 복사본이 들어가게 됨
 * - 동적할당 사용 : malloc() 함수는 주소를 반환함
 */