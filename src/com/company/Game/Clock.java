package com.company.Game;

import com.company.GUI.GUI;
import com.company.Snake.Snake;

public class Clock extends Thread {
    Snake snake;
    PickUp pickUp;

    public Clock() {
        snake = new Snake();
        pickUp = new PickUp();
        GUI.refresh();
    }

    @Override
    public void run() {
        try {
            while (!interrupted()) {
                GUI.refresh();
                snake.move();
                GUI.refresh();

                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
