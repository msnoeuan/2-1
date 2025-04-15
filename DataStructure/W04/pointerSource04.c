#include <stdio.h>

void swap0(int *,  int *);

int main() {
  int x, y, value, hidden = 111, k;

  for(k = 10; k < 30; k += 5) {
    value = k * 5;
    printf("%4d : %4d ", value, hidden);
    swap0(&value, &hidden);
    printf("After swap \n%4d : %4d\n", value, hidden);
  }
}

void swap0(int *xp, int *yp) {
  int tmp;
  tmp = *xp;
  *xp = *yp;
  *yp = tmp;
}