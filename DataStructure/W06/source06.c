#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_CNUM 50

typedef struct ctype *carlistp;
struct ctype {
    char rcode[10];
    unsigned cc;
    carlistp next;
};

int over3000(carlistp ptr) {
    int over = 0;

    for(; ptr; ptr = ptr -> next) {
      if(ptr -> cc >= 3000) {
        printf("%s\n", ptr -> rcode);
        over ++;
      }
    }
    return over;
}

void main(int argc, char* argv[]) {
    carlistp first = NULL, inode;
    FILE *cardata;

    if((cardata = fopen(argv[1], "r")) == NULL) {
        printf("데이터 파일을 열 수 없습니다.\n");
        exit(1);  // 프로그램을 즉시 종료시키는 함수(exit(0) : 정상 종료 / exit(1), exit(-1) : 비정상 종료)
    }

    inode = (carlistp)malloc(sizeof(struct ctype));

    while(fscanf(cardata, "%s %u", inode -> rcode, &(inode -> cc)) != EOF) {
        if(first != NULL)
            inode -> next = first;
        else
            inode -> next = NULL;
        first = inode;
        inode = (carlistp)malloc(sizeof(struct ctype));
    }

    printf("배기량이 3000cc 이상인 차량의 등록코드를 출력하고, \n");
    printf("3000cc 이상인 차량수 함수 over3000()에서 리턴받아 출력하시오\n");
    printf("3000cc 이상인 차량수 %d대입니다.\n", over3000(first));
}


