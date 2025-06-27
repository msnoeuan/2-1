#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct exnode* expointer;
struct exnode {
  char state[3];
  int sdata;
  expointer nlink;
};

void make_list1(expointer inode);
void make_list2(expointer inode);
void print_list();

expointer head = NULL;

void main() {
  expointer inode;
  int k;
  char ltype;

  head = (expointer)malloc(sizeof(struct exnode));
  strcpy(head -> state, "NY");
  head -> sdata = 5;
  head -> nlink = NULL;

  printf("Select linked list type?(Q / S)");
  ltype = getchar();

  for(k = 0; k < 3; k ++) {
    inode = (expointer)malloc(sizeof(struct exnode));
    printf("Enter state_name and order : ");
    scanf("%s %d", (inode -> state), &(inode -> sdata));

    if(ltype == 'Q')
      make_list1(inode);
    else if(ltype == 'S')
      make_list2(inode);
    else
      printf("Type Error ----\n");  // exeption handling
  }

  printf("=====================\n");
  print_list();
}

void make_list1(expointer inode) {
  expointer ptr = head, before = NULL;

  while(ptr != NULL) {
    before = ptr;
    ptr = ptr -> nlink;
  }
  before -> nlink = inode;
  inode -> nlink = NULL;
}

void make_list2(expointer inode) {
  inode -> nlink = head;
  head = inode;
}

void print_list() {
  expointer ptr = head;
  printf("The singly linked list containis : \n");

  while(ptr != NULL) {
    printf("%s : %d\n", ptr ->  state, ptr -> sdata);
    ptr = ptr -> nlink;
  }
}