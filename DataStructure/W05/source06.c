#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_SIZE 1000

// 1-1. 주어진 파일을 위한 구조체타입 ctype 선언
typedef struct carRegist {
  char registCode[7];
  int displacement;
} ctype;

int over3000(ctype a[], int n);

int main(int argc, char *argv[]) {
  int i = 0, num = 0;
  char sregistCode[7];
  int sdisplacement;
  FILE *cardb;
  // 1-2. 최대사이즈가 1000인 배열 car를 선언
  ctype car[MAX_SIZE];

  if((cardb = fopen(argv[1], "r")) == NULL) {
    printf("자동차 등록 파일을 열 수 없습니다.\n");
    exit(1);
  }

  while(fscanf(cardb, "%s %d", car[i].registCode, &(car[i].displacement)) != EOF)  // 문자열을 배열이어서 주소 그대로 전달, 정수는 변수니까 주소 연산자 &를 붙여서 전달
    i ++;

  num = i;

 // 2-1. 배기량이 3000cc이상인 차량의 등록코드를 출력
  for(i = 0; i < num; i ++)
    if(car[i].displacement  >= 3000)
      printf("배기량이 3000cc이상인 차량의 등록코드 : %s\n", car[i].registCode);

  int carCount = over3000(car, num);
  printf("3000cc이상인 차량 수 : %d\n", carCount);

  fclose(cardb);
}

// 2-2. 3000cc이상인 차량 수를 return하는 함수 int over3000(ctype a[], int n)을 작성하시오
int over3000(ctype a[], int n) {
  int count = 0;

  for(int i = 0; i < n; i ++)
    if(a[i].displacement >= 3000)
      count ++;

  return count;
}