#include <stdio.h>

int add_product(int*, int);

void main() {
  int x = 10, y = 20, z;
  z = add_product(&x, y);
  printf("x = %d :: y = %d :: z = %d\n", x, y, z);
}

int add_product(int *a, int b) {
  int temp = b;  // temp = 20;
  b = *a + b;  // b = 30;
  *a = *a * temp;
  return b;
}
