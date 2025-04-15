#include <stdio.h>
#define DNUM 100

double avg(int *a, int n);
int over_avg(int *a, int n, double average);

int main() {
  int data[DNUM], k, n;
  double aver;

  printf("The number of data : ");
  scanf("%d", &n);
  printf("Enter %d data\n", n);

  for(k = 0; k < n; k ++) {
    scanf("%d", data + k);
  }

  aver = avg(data, n);

  printf("입력된 데이터의 평균은? %.2f\n", aver);
  printf("The number of data(over average) : %d\n", over_avg(data, n, aver));
}

double avg(int *a, int n) {
  int sum = 0, i;

  for(i = 0; i < n; i ++)
    sum += *(a + i);

  return (double) sum / n;
}

int over_avg(int a[], int n, double average) {
  int over = 0, i;

  for(i = 0; i < n; i ++)
    if(*(a + i) > average)
      over++;

  return over;
}