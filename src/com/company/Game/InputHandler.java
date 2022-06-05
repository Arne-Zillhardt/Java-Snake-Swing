package com.company.Game;

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
            clock.start();
        }

        if (e.getKeyCode() == KeyEvent.VK_W) {
            clock.snake.moveVertical = -1;
            clock.snake.moveHorizontal = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            clock.snake.moveVertical = 1;
            clock.snake.moveHorizontal = 0;
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            clock.snake.moveVertical = 0;
            clock.snake.moveHorizontal = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            clock.snake.moveVertical = 0;
            clock.snake.moveHorizontal = -1;
        }

        if (e.getKeyCode() == KeyEvent.VK_1) {
            clock.snake.add();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
