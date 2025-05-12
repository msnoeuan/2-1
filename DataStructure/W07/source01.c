#include <stdio.h>
#include <stdlib.h>  // exit(0)
#include <string.h>

typedef struct ctype *cpointer;
struct ctype {
  char rcode[7];
  int cc;
  cpointer link;
};

int over3000(cpointer ptr) {
  int count = 0;

  for(; ptr != NULL; ptr = ptr -> link) {
    if(ptr -> cc >= 3000) {
      printf("%s\n", ptr ->rcode);
      count ++;
    }
  }

  return count;
}

void main(int argc, char* argv[]) {
  FILE *cardata;
  cpointer first = NULL, before = NULL, ptr, inode;

  inode = (cpointer)malloc(sizeof(struct ctype));

  if((cardata = fopen(argv[1], "r")) == NULL) {
    printf("데이터 파일을 찾을 수 없습니다.");
    exit(0);
  }

  while(fscanf(cardata, "%s %d", inode -> rcode, &(inode -> cc)) != EOF) {
    if(first != NULL) {
      ptr = first;
      while(ptr) {
        before = ptr;
        ptr = ptr -> link;
      }
      before -> link = inode;
    }
    else
      first = inode;

    inode -> link = NULL;

    inode = (cpointer)malloc(sizeof(struct ctype));
  }

  printf("3000cc 이상인 차량수 %d\n", over3000(first));
}