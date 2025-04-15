#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define DNUM 100

int pcount(int a[], int n);
double avg(int a[], int n);
int large(int a[], int n);
int small(int a[], int n);

void main() {
  int data[DNUM], k, n;

  printf("처리할 데이터의 수 : ");
  scanf("%d", &n);
  printf("%d개의 정수를 입력하세요. ", n);

  for(k = 0; k < n; k ++)
    scanf("%d", &data[k]);

  printf("양의 개수는 %d\n", pcount(data, n));
  printf("데이터 평균 = %.2f\n", avg(data, n));
  printf("최대값 = %d\n", large(data, n));
  printf("최소값 = %d\n", small(data, n));
}

int pcount(int a[], int n) {
  int result = 0, i;

  for(i = 0; i < n; i ++)
    if (a[i] > 0)
      result ++;

  return result;
}

double avg(int a[], int n) {
  double sum = 0;

  for(int i = 0; i < n; i ++)
    sum += a[i];

  return sum / n;
}

int large(int a[], int n) {
  int max = a[0], i;

  for(i = 1; i < n; i ++)
    if(a[i] > max)
      max = a[i];

  return max;
}

int small(int a[], int n) {
  int min = a[0], i;

  for(i = 1; i < n; i ++)
    if(a[i] < min)
      min = a[i];

  return min;
}