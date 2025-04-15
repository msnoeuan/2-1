// 주어진 두 개의 문자열 결합 프로그램
#include <stdio.h>
#include <string.h>

void main() {
    char carray[40], carray1[20], carray2[20];

    int k, i;

    printf("Enter string1 : ");
    fgets(carray1, sizeof(carray1), stdin);
    printf("Enter string2 : ");
    fgets(carray2, sizeof(carray2), stdin);

    // 개행문자를 제거하고 싶을 때 사용
    // strcspn(const char *str1, const char *str2) : str1 문자열에서 str2에 포함된 어떤 문자라도 처음으로 등장하는 위치의 인덱스를 반환
    // carray1[strcspn(carray1, "\n")] = '\0';
    // carray2[strcspn(carray2, "\n")] = '\0';

    printf("the length of string = %d\n", strlen(carray1));  // strlen() : 문자열의 길이를 반환하는 함수 / <string.h>에 포함
    printf("the length of string = %d\n", strlen(carray2));


    strcpy(carray, carray1);  // strcpy(복사될 대상, 복사할 원본 문자열) : 문자열 복사 함수 / <string.h>에 포함

    k = strlen(carray1);

    for (i = 0; carray2[i] != '\0'; i ++)  // '\0' : 널 문자, 아스키코드 0번, C언어에서 문자열의 끝을 나타내는 특수한 문자
        carray[k++] = carray2[i];
    carray[k] = '\0';
    printf("the length of string = %d\n", strlen(carray));

    puts(carray);
}

/*
 * <fgets()>
 * gets()는 보안상 위험한 함수로, C11 이후 표준에서는 제거된 함수
 * => 대신 fgets() 사용
 * char *fgets(char *str, int n, FILE, *stream) => 개행 문자 포함
 * 1. 문자열을 저장할 배열
 * 2. 읽을 최대 문자 수
 * 3. 입력 스트림(stdin = standard input) 사용
 *  - stdin : 표준 입력(키보드)
 *  - stdout : 표준 출력(화면-모니터)
 *  - stderr : 표준 에러 출력(화면 - 모니터)
 *
 * <fgets() VS scanf()>
 * 1. fgets()
 *  - 문자열 전체를 줄 단위로 읽기
 *  - 공백 포함해서 읽음
 *  - 안전
 *  - 개행 문자(\n)까지 읽고 포함
 *
 * 2. scanf()
 *  - 형식에 맞춰서 읽기
 *  - 공백에서 끊김
 *  - 위험(입력 초과 시 버퍼 오버플로 가능)
 *  - 기본적으로 공백/개행에서 끊김(개행 저장 안 함)
 */