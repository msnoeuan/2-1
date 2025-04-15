#include <stdio.h>

int main() {
  char *cp, ch;
  int *ip, idata;
  double *fp, ddata;

  int n = 2;
  cp = &ch;
  ip = &idata;
  fp = &ddata;

  printf("증가 전 포인터의 값 : %12u%12u%12u\n", cp, ip, fp);
  ++cp, ++ip, ++fp;
  getchar();
  printf("증가 후 포인터의 값 : %12u%12u%12u\n", cp, ip, fp);
  cp = cp + n;
  ip = ip + n;
  fp = fp + n;
  getchar();
  printf("+n 후 포인터의 값 : %12u%12u%12u\n", cp, ip, fp);

  return 0;
}


/*
 * <getchar()>
 * - 표준 입력(키보드)으로부터 문자 하나를 읽는 함수
 * - 사용자가 키보드에서 입력함 문자 하나를 읽어서 반환하는 함수
 * - 사용자가 문자를 입력하고 엔터를 눌러야 읽어옴
 * - windows에서 getch() 사용
 *
 */