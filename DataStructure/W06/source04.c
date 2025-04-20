#include <stdio.h>
#include <stdlib.h>

typedef struct cnode *npointer;
struct cnode {
  int num;
  char grade;
  npointer link;
};

void build(npointer node);
void c_print();
int how_many();
npointer ptr = NULL;  // 전역변수

void main() {
  int cond = 1;
  npointer temp;
  
  while(cond) {
    temp = (npointer)malloc(sizeof(struct cnode));
    printf("Enter id and grade : ");
    scanf("%d %c", &temp -> num, &temp -> grade);
    build(temp);
    printf("Continue?(0/1) : ");
    scanf("%d", &cond);
  }

  c_print();
  printf("The number of nodes in this list = %d\n", how_many());
}

void build(npointer inode) {
  if(!ptr) {  // ptr이 NULL이면
    inode -> link = inode;  // 자기 자신을 가리키는 원형 노드
    ptr = inode;
  }
  else {
    inode -> link = ptr -> link;
    ptr -> link = inode;
  }
}

void c_print() {
  npointer temp = ptr;

  if(ptr) {
    do {
      temp = temp -> link;
      printf("%d : %c\n", temp -> num, temp -> grade);
    }
    while (temp != ptr);
  }
}

int how_many() {
  npointer temp;
  int count = 0;

  if(ptr) {
    temp = ptr;

    do{
      temp = temp -> link;
      count ++;
    }
    while(temp != ptr);
  }
  return count;
}