import pygame

# Configuración de pantalla
screen = pygame.display.set_mode((800, 600))
clock = pygame.time.Clock()
running = True
dt = 0

# Posición de jugador
player_pos = pygame.Vector2(screen.get_width() / 2, screen.get_height() / 2)

# Velocidad del jugador
player_speed = 5

# Bucle inicial
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Detectar las teclas para mover
    keys = pygame.key.get_pressed()

    # Movimientos del jugador
    if keys[pygame.K_LEFT]:  # Tecla izquierda
        player_pos.x -= player_speed
    if keys[pygame.K_RIGHT]:  # Tecla derecha
        player_pos.x += player_speed
    if keys[pygame.K_DOWN]:  # Tecla abajo
        player_pos.y += player_speed
    if keys[pygame.K_UP]:  # Tecla arriba
        player_pos.y -= player_speed

    # Limpiar la pantalla
    screen.fill("green")

    # Dibujar al jugador
    pygame.draw.circle(screen, (255, 0, 0), (int(player_pos.x), int(player_pos.y)), 10)

    # Actualizar pantalla
    pygame.display.flip()

    # Control de velocidad
    clock.tick(60)

pygame.quit()  # Cierre del programa
