#!/usr/bin/env python
# coding: utf-8

import pygame
import random 

# Pygame 초기화
pygame.init()

# 화면 크기 설정
WIDTH, HEIGHT = 300, 600
ROWS, COLS = 20, 10
BLOCK_SIZE = WIDTH // COLS

# 색상 정의
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
BLUE = (0, 0, 255)
RED = (255, 0, 0)

# 블록 모양 정의(I, O, T, S, Z, L, J)
SHAPES = [
    [[1, 1, 1, 1]], # I
    [[1, 1], [1, 1]], # O
    [[0, 1, 0], [1,1, 1]], # T
    [[0, 1, 1], [1, 1, 0]], # S
    [[1, 1, 0], [0, 1, 1,]], # Z
    [[1, 0, 0], [1, 1, 1]], # L
    [[0, 0, 1], [1, 1, 1]] # J
]

# 게임 보드 초기화
def create_board() :
    return [[0 for _ in range(COLS)] for _ in range(ROWS)]

# 블록 회전 함수
def rotate_block(block) :
    return [list(row) for row in zip(*block[::-1])]

# 블록 그리기 함수
def draw_block(screen, shape, x, y) :
    for row_idx, row in enumerate(shape) :
        for col_idx, cell in enumerate(row) :
            if cell :
                pygame.draw.rect(
                    screen,
                    BLUE,
                    (x + col_idx * BLOCK_SIZE, y + row_idx * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE),
                )

# 보드 그리기 함수
def draw_board(screen, board) :
    for row_idx, row in enumerate(board) :
        for col_idx, cell in enumerate(row) :
            if cell :
                pygame.draw.rect(
                    screen,
                    RED,
                    (col_idx * BLOCK_SIZE, row_idx * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE),
                )

# 충돌 감지 함수
def check_collision(board, shape, x, y) :
    for row_idx, row in enumerate(shape) :
        for col_idx, cell in enumerate(row) :
            if cell :
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y = (y // BLOCK_SIZE) + row_idx

                if board_x < 0 or board_x >= COLS or board_y >= ROWS :
                    return True
                if board_y >= 0 and board[board_y][board_x] != 0 :
                    return True
    return False

# 블록 고정 함수
def place_block(board, shape, x, y) :
    for row_idx, row in enumerate(shape) :
        for col_idx, cell in enumerate(row) :
            if cell :
                board_x = (x // BLOCK_SIZE) + col_idx
                board_y = (y // BLOCK_SIZE) + row_idx

                if 0 <= board_x < COLS and 0 <= board_y < ROWS :
                    board[board_y][board_x] = 1

# 라인 삭제 함수
def clear_lines(board) :
    cleared_rows = 0
    new_board = []

    for row in board :
        if all(cell == 1 for cell in row) :  # 해당 행이 꽉 찬 경우
            cleared_rows += 1
        else :
            new_board.append(row)

    # 위쪽에 빈 행 추가
    for _ in range(cleared_rows) :
        new_board.insert(0, [0] * COLS)

    return new_board, cleared_rows

# 점수 시스템 함수
def calculate_score(cleared_rows) :
    score_table = {1 : 100, 2 : 300, 3 : 500, 4 : 800}
    return score_table.get(cleared_rows, 0)

def main() :
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption("Tetris - 블록 회전과 충돌 처리")

    clock = pygame.time.Clock()
    board = create_board()
    running = True

    current_block = random.choice(SHAPES)
    block_x, block_y = 4 * BLOCK_SIZE, 0
    
    score = 0
    
    while running : 
        screen.fill(BLACK)

        # 이벤트 처리
        for event in pygame.event.get() :
            if event.type == pygame.QUIT :
                running = False
            if event.type == pygame.KEYDOWN :
                if event.key == pygame.K_UP :
                    rotated_block = rotate_block(current_block)
                    if not check_collision(board, rotated_block, block_x, block_y) :
                        current_block = rotated_block

        # 키 입력 처리
        keys = pygame.key.get_pressed()
        if keys[pygame.K_LEFT] :
            if not check_collision(board, current_block, block_x - BLOCK_SIZE, block_y) :
                block_x -= BLOCK_SIZE
        if keys[pygame.K_RIGHT] :
            if not check_collision(board, current_block, block_x + BLOCK_SIZE, block_y) :
                block_x += BLOCK_SIZE
        if keys[pygame.K_DOWN] :
            if not check_collision(board, current_block, block_x, block_y + BLOCK_SIZE) :
                block_y += BLOCK_SIZE

        # 블록 자동 하강
        block_y += BLOCK_SIZE if not check_collision(board, current_block, block_x, block_y + BLOCK_SIZE) else 0

        # 충돌 시 블록 고정 및 새로운 블록 생성
        if check_collision(board, current_block, block_x, block_y + BLOCK_SIZE) :
            place_block(board, current_block, block_x, block_y)
            board, cleared = clear_lines(board)  # 충돌 시 라인 삭제

            if cleared > 0 :
                gain_score = calculate_score(cleared)
                score += gain_score
                print(f"{gain_score}점 획득(총점 : {score})")

                speed = max(50, 500 - (cleared * 20)) # 최소 50ms까지 제한
            
            current_block = random.choice(SHAPES)
            block_x, block_y = 4 * BLOCK_SIZE, 0

        # 보드 및 블록 그리기
        draw_board(screen, board)
        draw_block(screen, current_block, block_x, block_y)

        pygame.display.flip()
        clock.tick(10)

    pygame.quit()

if __name__ == "__main__" :
    main()
