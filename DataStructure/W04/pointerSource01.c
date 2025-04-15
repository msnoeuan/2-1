#include <stdio.h>

int main() {
  int intk = -101;
  char ch = 'A';
  char str[20] = "소중한 오늘";
  float fdata = 12.357;
  double ddata = -12.357;

  printf("------초기값으로 선언된 데이터값의 출력-----\n");
  printf("int data : %d\n", intk);
  printf("char data : %c\n", ch);
  printf("str data : %s\n", str);  // str은 배열의 이름 &str[0]
  printf("float data : %.3f\n", fdata);
  printf("double data : %.3f\n", ddata);

  printf("\n\n------선언된 데이터의 주소값 출력-----\n");
  printf("int 주소 : %u\n", &intk);
  printf("char 주소 : %u\n", &ch);
  printf("str 주소 : %u\n", &str);  // str은 배열의 이름 &str[0]
  printf("float 주소 : %u\n", &fdata);
  printf("double 주소 : %u\n", &ddata);

  return 0;
}
