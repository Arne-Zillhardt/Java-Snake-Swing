package com.company.Game;

import com.company.GUI.GUI;
import com.company.Snake.Snake;

public class Clock extends Thread {
    public static Snake snake;
    public static PickUp pickUp;
    public boolean running = false;

    public Clock() {
        if (snake == null && pickUp == null) {
            snake = new Snake();
            pickUp = new PickUp();
        }

        GUI.refresh();
    }

    public void clock() {
        try {
            while (running) {
                GUI.refresh();
                snake.move();
                GUI.refresh();

                Thread.sleep(300);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void run() {
        clock();
    }
}
