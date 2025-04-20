#include <stdio.h>
#include <string.h>  // strcpy()
#include <stdlib.h>  // malloc()

typedef struct simple_list *simple_pointer;

struct simple_list {
  char state[3];
  int count;
  simple_pointer next;
};

simple_pointer state_list();
void append(simple_pointer ptr, simple_pointer inode);
void print_list(simple_pointer ptr);

void main() {
  simple_pointer ptr, inode;
  ptr = state_list();

  inode = (simple_pointer)malloc(sizeof(struct simple_list));
  strcpy(inode -> state, "TX");  // 선언하면서 초기화할 땐 문자열을 바로 배열에 넣을 수 있지만, 선언된 배열에 문자열을 넣을 땐 strcpy() 사용
  inode -> count = 7;
  append(ptr, inode);

  inode = (simple_pointer)malloc(sizeof(struct simple_list));
  strcpy(inode -> state, "CA");
  inode -> count = 20;
  append(ptr, inode);

  print_list(ptr);
}

simple_pointer state_list() {
  simple_pointer node1, node2;

  node1 = (simple_pointer)malloc(sizeof(struct simple_list));
  node2 = (simple_pointer)malloc(sizeof(struct simple_list));

  // 구조체 변수는 .
  // 구조체 포인터는 ->
  strcpy(node1 -> state, "NY");  // state는 문자열 배열이라 단순 대입으로 값을 할당할 수 없음
  node1 -> count = 5;
  node1 -> next = node2;

  strcpy(node2 -> state, "FL");
  node2 -> count = 10;
  node2 -> next = NULL;

  return node1;
}

void append(simple_pointer ptr, simple_pointer inode) {
  simple_pointer before = NULL;

  while(ptr != NULL) {
    before = ptr;
    ptr = ptr -> next;  // next의 있는 주소를 ptr에 넣음
  }

  before -> next = inode;
  inode -> next = NULL;
}

void print_list(simple_pointer ptr) {
  printf("The singly linked list containts : \n");
  while(ptr != NULL) {
    printf("%s : %d\n", ptr -> state, ptr -> count);
    ptr = ptr -> next;
  }
}