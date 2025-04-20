#include <stdio.h>
#include <stdlib.h>

typedef struct list_node *list_pointer;
struct list_node {
  int data;
  list_pointer link;  // 자기 참조 구조체
};

void print_list(list_pointer ptr);
list_pointer make_node();
int nodesum(list_pointer ptr);
int nodenumber(list_pointer ptr);

void main() {
  list_pointer ptr;
  ptr = make_node();
  
  print_list(ptr);

  printf("list안의 data 합 : %d\n", nodesum(ptr));
  printf("list안의 data 수 : %d\n", nodenumber(ptr));

}

list_pointer make_node() {
  list_pointer first, second, third;
  
  first = (list_pointer)malloc(sizeof(struct list_node));
  second = (list_pointer)malloc(sizeof(struct list_node));
  third = (list_pointer)malloc(sizeof(struct list_node));

  first -> link = second;
  second -> link = third;
  third -> link = NULL;
  
  first -> data = 100;
  second -> data = 200;
  third -> data = 300;

  return first;
}

void print_list(list_pointer ptr) {
  printf("The list contains : ");
  while(ptr != NULL) {
    printf("%4d", ptr -> data);
    ptr = ptr -> link;
  }
  printf("\n");
}

int nodesum(list_pointer ptr) {
  int sum = 0;

//  while(ptr) {  // NULL은 false로 간주
//    sum += ptr -> data;
//    ptr = ptr -> link;
//  }

  for(; ptr; ptr = ptr -> link)
    sum += ptr -> data;

  return sum;
}

int nodenumber(list_pointer ptr) {
  int count = 0;

//  while(ptr) {
//    count ++;
//    ptr = ptr -> link;
//  }

  for(; ptr; ptr = ptr -> link)
    count ++;

  return count;
}