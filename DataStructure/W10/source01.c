#include <stdio.h>
#include <stdlib.h>
#define MTSIZE 50

typedef struct agent {
  char aid[4];
  int apart;
  int wn;  // waiting number
} agentType;

agentType max_waiting(agentType a[], int n);  // 함수 원형

void main(int argc, char* argv[]) {
  agentType atable[MTSIZE], maxa;
  int k = 0;
  FILE* afile;

  if((afile = fopen(argv[1], "r")) == NULL) {
    printf("입력 파일을 사용할 수 없습니다.\n");
    exit(1);
  }

  while(fscanf(afile, "%s %d %d", atable[k].aid, &(atable[k].apart), &(atable[k].wn)) != EOF)
    k ++;

  printf("이 콜센터의 상담원의 수 : %d명\n", k);

  for(int i = 0; i < k; i ++)
    printf("%10s %3d %5d\n", atable[i].aid, atable[i].apart, atable[i].wn);

  maxa = max_waiting(atable, k);

  printf("최대 대가 상담원 %s\t %d\t %d\n", maxa.aid, maxa.apart, maxa.wn);
}

agentType max_waiting(agentType a[], int n) {
  int maxk = 0;

  for(int k = 1; k < n; k ++)
    if (a[k].wn > a[maxk].wn)
      maxk = k;

  return a[maxk];
}