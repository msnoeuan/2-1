#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_CNUM 50

typedef struct {
  char rcode[10];
  unsigned cc;
} ctype;

int over3000(ctype a[], int n);

void main(int argc, char* argv[]) {
  int i = 0, dnum;
  ctype car[MAX_CNUM];
  FILE *cardata;

  if((cardata = fopen(argv[1], "r")) == NULL) {
    printf("데이터 파일을 열 수 없습니다.\n");
    exit(1);  // 프로그램을 즉시 종료시키는 함수(exit(0) : 정상 종료 / exit(1), exit(-1) : 비정상 종료)
  }

  while(fscanf(cardata, "%s %u", car[i].rcode, &(car[i].cc)) != EOF)
    i ++;
  dnum = i;

  printf("배기량이 3000cc 이상인 차량의 등록코드를 출력하고, \n");
  printf("3000cc 이상인 차량수 함수 over3000()에서 리턴받아 출력하시오\n");
  printf("3000cc 이상인 차량수 %d대입니다.\n", over3000(car, dnum));
}

int over3000(ctype a[], int n) {
  int k, over = 0;

  for(k = 0; k < n; k ++) {
    if(a[k].cc >= 3000) {
      printf("%s\n", a[k].rcode);
      over ++;
    }
  }
  return over;
}