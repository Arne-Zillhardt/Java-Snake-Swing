package com.company.Snake;

import com.company.GUI.Label;
import com.company.Game.PickUp;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    public static ArrayList<SnakeObject> snake = new ArrayList<>();
    static Head snakeHead;
    static Label headLabel;
    public static int moveHorizontal = 1;
    public static int moveVertical = 0;

    public Snake() {
        snakeHead = new Head();
        headLabel = Label.getLabel(snakeHead.posX, snakeHead.posY);
        headLabel.snakeHead = true;
        snake.add(snakeHead);
    }

    public void move() {
        for (int i = snake.size() - 1; i > 0; i--) {
            SnakeObject body = snake.get(i);
            body.clear();
        }

        for (int i = snake.size() - 1; i > 0; i--) {
            SnakeObject body = snake.get(i);
            body.move();
        }

        snakeHead.posX += moveVertical;
        snakeHead.posY += moveHorizontal;

        headLabel.snakeHead = false;

        headLabel = Label.getLabel(snakeHead.posX, snakeHead.posY);
        headLabel.snakeHead = true;

        if (headLabel.pickUp) {
            PickUp.eaten();
            add();
        }
    }

    public void add() {
        SnakeObject body = new SnakeObject(snake.get(snake.size() - 1));
        snake.add(body);
    }

    public void changeDirection(int x, int y) {
        if (snake.size() > 1) {
            int tmpX = snakeHead.posX + x;
            int tmpY = snakeHead.posY + y;

            if (tmpX != snake.get(1).posX || tmpY != snake.get(1).posY) {
                moveVertical = x;
                moveHorizontal = y;
            }
        } else {
            moveVertical = x;
            moveHorizontal = y;
        }
    }
}