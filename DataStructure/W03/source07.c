#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define DNUM 10

int range(int a[], int n);

void main() {
  int data[DNUM], k, n;

  printf("The number of data : ");
  scanf("%d", &n);
  printf("Enter %d data\n", n);

  for(k = 0; k < n; k++)
    scanf("%d", &data[k]);

  printf("The Diference between the largest and the smallest value = %d\n", range(data, n));
}

int range(int a[], int n) {
  int k, max, min;

  max = min = a[0];

  for(k = 1; k < n; k ++) {
    if(a[k] > max)
      max = a[k];

    if(a[k] < min)
      min = a[k];
  }

  return max - min;
}
