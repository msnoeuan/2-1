# ### mac에서 pygame 실행
# 1. py 파일 생성
# - File -> Save and Export Notebook As -> Executable Script -> py파일 원하는 폴더로 이동
# 
# 2. 실행
# - 터미널 -> 현재 위치를 파일이 있는 위치로 이동 -> python3 tetris.py

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

# 블록 시계 방향 회전 함수
def rotate_clockwise(block) :
    return [list(row) for row in zip(*block[::-1])]
    
# 블록 반시계 방향 회전 함수
def rotate_counterclockwise(block) :
    return [list(row) for row in zip(*block)][::-1]

def new_block() :
    return random.choice(SHAPES)

# 초기 설정
current_block = new_block()
next_block = new_block()

# 다음 블록을 현재로 옮기고 새로운 블록 생성
def shift_block() :
    global current_block, next_block
    current_block = next_block
    next_block = new_block()

# pygame을 이용한 미리보기 출력 예시 함수
def draw_next_block(screen, font, block, x, y) :
    for row_idx, row in enumerate(block) :
        for col_idx, val in enumerate(row) :
            if val :
                pygame.draw.rect(screen, (150, 150, 150), (x + col_idx * 20, y + row_idx * 20, 18, 18))

    # 텍스트 출력
    label = font.render("Next", True, (255, 255, 255))
    screen.blit(label, (x, y - 30))

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

# 라인 삭제 함수
def clear_lines(board) :
    cleared_rows = 0
    new_board = []
    for row in board :
        if all(cell == 1 for cell in row) :  # 해당 행이 꽉 찬 경우
            cleared_rows += 1
        else :
            new_board.append(row)
    for _ in range(cleared_rows) :
        new_board.insert(0, [0] * COLS)
    return new_board, cleared_rows

# 점수 계산 함수
def calculate_score(cleared_rows) :
    score_table = {1 : 100, 2 : 300, 3 : 500, 4 : 800}
    return score_table.get(cleared_rows, 0)

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

def main() :
    global current_block
    shift_block()
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption("Tetris - 완성")

    clock = pygame.time.Clock()
    board = create_board()
    running = True

    block_x, block_y = 4 * BLOCK_SIZE, 0
    drop_time = 0
    speed = 50
    total_score = 0
    
    while running : 
        screen.fill(BLACK)

        # 시간 기반 블록 하강
        drop_time += clock.get_rawtime()
        clock.tick(30)

        font = pygame.font.SysFont("Arial", 24)
        draw_next_block(screen, font, next_block, WIDTH - 100, 50)
        
        if drop_time > speed :
            if not check_collision(board, current_block, block_x, block_y + BLOCK_SIZE) :
                block_y += BLOCK_SIZE
            else :
                place_block(board, current_block, block_x, block_y)
                board, cleared_rows = clear_lines(board)
                total_score += calculate_score(cleared_rows)
                speed = max(50, speed - (cleared_rows * 20))  # 속도 증가
                shift_block()
                block_x, block_y = 4 * BLOCK_SIZE, 0

                # 게임 종료 조건
                if check_collision(board, current_block, block_x, block_y) :
                    print('Game Over!')
                    running = False

        # 이벤트 처리
        for event in pygame.event.get() :
            if event.type == pygame.QUIT :
                running = False
            if event.type == pygame.KEYDOWN :
                if event.key == pygame.K_UP :  # 시계 방향
                    rotated_block = rotate_clockwise(current_block)
                    if not check_collision(board, rotated_block, block_x, block_y) :
                        current_block = rotated_block
                elif event.key == pygame.K_z : # 반시계 방향
                    rotated_block = rotate_counterclockwise(current_block)
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


        # 보드 및 블록 그리기
        draw_board(screen, board)
        draw_block(screen, current_block, block_x, block_y)

        # 점수 표시
        score_text = font.render(f"Score : {total_score}", True, WHITE)
        screen.blit(score_text, (10, 10))
        pygame.display.flip()
        clock.tick(10)

    pygame.quit()

if __name__ == "__main__" :
    main()