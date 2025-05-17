#!/usr/bin/env python
# coding: utf-8

# ### mac에서 pygame 실행
# 1. py 파일 생성
# - File -> Save and Export Notebook As -> Executable Script -> py파일 원하는 폴더로 이동
# 
# 2. 실행
# - 터미널 -> 현재 위치를 파일이 있는 위치로 이동 -> python3 tetris.py

import sys
import pygame
import random  # 무작위로 블록을 뽑기 위해 사용
# Pygame 초기화
pygame.init()

# 화면 크기 설정
WIDTH, HEIGHT = 300, 600  # 너비, 높이 - 픽셀
ROWS, COLS = 20, 10  # 행, 열 - 칸
BLOCK_SIZE = WIDTH // COLS  # 한 칸(한 블록)의 가로 크기 : 300 // 10 = 30

# 색상 정의
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)  # 배경색
BLUE = (0, 0, 255)  # 블록색

# 블록 모양 정의(I, O, T, S, Z, L, J)
SHAPES = [
    [[1, 1, 1, 1]],  # I
    [[1, 1], [1, 1]],  # O
    [[0, 1, 0], [1, 1, 1]],  # T
    [[0, 1, 1], [1, 1, 0]],  # S
    [[1, 1, 0], [0, 1, 1]],  # Z
    [[1, 0, 0], [1, 1, 1]],  # L
    [[0, 0, 1], [1, 1, 1]]  # J
]

# 게임 보드 초기화
# 0으로 채워진 2차원 리스트(20행 X 10열) 생성
# 블록이 내려오면 0 -> 1로 변경
def create_board() :
    return [[0 for _ in range(COLS)] for _ in range(ROWS)]  # 중첩 for문과 비슷한 구조?
    
# 블록 그리기 함수
def draw_block(screen, shape, x, y) :
    # enumerate(list) : 리스트를 반복하면서 현재 인덱스와 값 둘 다 반환해주는 함수
    for row_idx, row in enumerate(shape) :
        for col_idx, cell in enumerate(row) :
            if cell :  # if cell == 1
                pygame.draw.rect(  # pygame.draw.rect(화면, 색상, (x좌표, y좌표, 너비, 높이))
                    screen,  # 화면에
                    BLUE,  # BLUE(rgb 저장값) 색상으로
                    (
                        x + col_idx * BLOCK_SIZE,  # x좌표
                        y + row_idx * BLOCK_SIZE,  # y좌표
                        BLOCK_SIZE,  # 너비
                        BLOCK_SIZE  # 높이
                    )  # ,(콤마) 생략 가능
                )

def check_collision(board, shape, x, y):
    for row_idx, row in enumerate(shape):
        for col_idx, cell in enumerate(row):
            if cell:
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y = (y // BLOCK_SIZE) + row_idx
                # 경계 밖으로 나가거나, 이미 고정된 블록이 있는 경우 충돌
                if board_x < 0 or board_x >= COLS or board_y >= ROWS:
                    return True
                if board_y >= 0 and board[board_y][board_x] != 0:
                    return True
    return False

def place_block(board, shape, x, y):
    for row_idx, row in enumerate(shape):
        for col_idx, cell in enumerate(row):
            if cell:
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y = (y // BLOCK_SIZE) + row_idx
                if 0 <= board_x < COLS and 0 <= board_y < ROWS:
                    board[board_y][board_x] = 1

def main() :
    screen = pygame.display.set_mode((WIDTH, HEIGHT))  # 게임 화면 열기
    pygame.display.set_caption("Tetris")  # 제목 설정

    clock = pygame.time.Clock()  # 타이머 생성
    drop_time = 0
    elapsed = 0
    
    board = create_board() 
    running = True  # 게임 루프를 돌릴지 여부(False면 실행되지 않음)

    current_block = random.choice(SHAPES)  # random 라이브러리
    block_x, block_y = 4 * BLOCK_SIZE, 0  # 블록이 떨어지기 시작할 위치 설정

    while running :
        screen.fill(BLACK)

        for event in pygame.event.get() :
            if event.type == pygame.QUIT :  # 이벤트 중에서 창 닫기 버튼(X)을 눌렀는지 확인
                running = False

        # 블록 이동 로직
        keys = pygame.key.get_pressed()  # 키보드에서 어떤 키가 눌렸는지 확인

        # -는 왼쪽 이동 +는 오른쪽 이동
        if keys[pygame.K_LEFT]:
            if block_x > 0: # 왼쪽 경계를 벗어나지 않도록
                block_x -= BLOCK_SIZE
        if keys[pygame.K_RIGHT]:
            if block_x + len(current_block[0]) * BLOCK_SIZE < WIDTH: # 오른쪽 경계를 벗어나지 않도록
                block_x += BLOCK_SIZE
        if keys[pygame.K_DOWN]:
            block_y += BLOCK_SIZE

        drop_time += elapsed  # 지난 루프에서 측정된 시간 누적
        if drop_time > 100:
            block_y += BLOCK_SIZE
            drop_time = 0

        if check_collision(board, current_block, block_x, block_y) :
            block_y -= BLOCK_SIZE
            place_block(board, current_block, block_x, block_y)  # 블록 고정
            current_block = random.choice(SHAPES)
            block_x, block_y = 4 * BLOCK_SIZE, 0

        for row_idx, row in enumerate(board):
            for col_idx, cell in enumerate(row):
                if cell:
                    draw_block(screen, [[1]], col_idx * BLOCK_SIZE, row_idx * BLOCK_SIZE)

            
        # 게임 보드와 블록 그리기
        draw_block(screen, current_block, block_x, block_y)

        pygame.display.flip()  # 실제 화면에 그린 결과를 보여줌
        
        clock.tick(10)  # 초당 최대 10프레임으로 속도 제한
        elapsed = clock.get_rawtime()

    pygame.quit()
    

# 파일을 실행했을 때만 main() 함수 실행
if __name__ == "__main__" :
    main()

