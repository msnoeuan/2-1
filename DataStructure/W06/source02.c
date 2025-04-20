#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct fnode *fpointer;
struct fnode {
  char animal[10];
  int item;
  fpointer next;
};

void main() {
  fpointer head = NULL, ptr, another, before = NULL;
  int how_many = 0;

  head = (fpointer)malloc(sizeof(struct fnode));
  strcpy(head -> animal, "dog");
  head -> item = 10;
  head -> next = NULL;

  for(int k = 0; k < 4; k ++) {  // 4개의 동물을 입력받음
    another = (fpointer)malloc(sizeof(struct fnode));
    printf("Enter the sort of animal and its number : ");
    scanf("%s %d", another -> animal, &another -> item);

    ptr = head;

    while(ptr != NULL) {
      before = ptr;
      ptr = ptr -> next;  // ptr -> next는 다음 값의 주소
    }
    before -> next = another;
    another -> next = NULL;
  }

  printf("====================\n");
  ptr = head;

  while(ptr != NULL) {
    printf("%s : %d\n", ptr -> animal, ptr -> item);
    how_many += ptr -> item;
    ptr = ptr -> next;
  }

  printf("Total number of item : %d\n", how_many);
}