package com.company.Game;

import com.company.GUI.GUI;
import com.company.Snake.SnakeObject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class InputHandler implements KeyListener {
    Clock clock;

    public InputHandler() {
        clock = new Clock();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            clock.running = true;
            clock.start();
        }
        if (e.getKeyCode() == KeyEvent.VK_R) {
            clock.running = false;
            clock.interrupt();
            GUI.build();
        }

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP) {
            clock.snake.changeDirection(-1, 0);
        }
        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
            clock.snake.changeDirection(1, 0);
        }

        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            clock.snake.changeDirection(0, 1);
        }
        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
            clock.snake.changeDirection(0, -1);
        }

        if (e.getKeyCode() == KeyEvent.VK_1) {
            clock.snake.add();
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            for (int i = 0; i < ((17 * 17) - 1); i++) {
                clock.snake.add();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
