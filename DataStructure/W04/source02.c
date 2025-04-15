#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void insert_data(int exarray[], int n, int k, int idata);
int is_search(int exarray[], int n, int sdata);
int delete_data(int exarray[], int n, int k);

void main() {
    int exarray[100], n, i, idata, k;

    printf("The number of data : ");
    scanf("%d", &n);
    printf("Input %d test data : ", n);
    for (i = 0; i < n; i ++)
        scanf("%d", &exarray[i]);

    printf("Input index k and its data(to be inserted) : ");
    scanf("%d %d", &k, &idata);

    insert_data(exarray, n, k, idata);

    printf("\nAfter inserting : ");
    for (i = 0; i < n + 1; i ++)
        printf("%d ", exarray[i]);

    printf("\n\nSearch Test---\n");
    k = is_search(exarray, n + 1, idata);
    if (k != -1)
        printf("%d is in this list at %d", idata, k);
    else
        printf("%d : Not fount in this list", idata);

    printf("\n\nDeleted data : %d", delete_data(exarray, n, k));
    printf("\nAfter deletion : ");

    for (i = 0; i < n; i ++)
        printf("%d ", exarray[i]);
}

void insert_data(int exarray[], int n, int k, int idata) {  // 배열, 원소 개수, 인덱스, 새로 넣고싶은 값
    int i;
    i = n - 1;

    while (i >= k) {
        exarray[i + 1] = exarray[i];
        i --;
    }
    exarray[k] = idata;
}

int is_search(int exarray[], int n, int sdata) {  // 배열, 원소 개수, 새로 넣은 데이터
    int i;

    for (i = 0; i < n; i ++)
        if (exarray[i] == sdata)
            return i;

    return -1;
}

int delete_data(int exarray[], int n, int k) {
    int i, ddata = exarray[k];

    i = k;

    while (i < n) {
        exarray[i] = exarray[i + 1];
        i ++;
    }

    return ddata;
}

