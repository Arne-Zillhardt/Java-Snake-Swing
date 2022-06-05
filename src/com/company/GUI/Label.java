package com.company.GUI;

import java.awt.*;

public class Label extends java.awt.Label {
    int posX;
    int posY;
    public boolean snakePart;
    public boolean snakeHead;
    public boolean pickUp;

    public Label(int x, int y) {
        posX = x;
        posY = y;
        snakePart = false;
        pickUp = false;

        this.setBackground(Color.WHITE);
    }

    public void refresh() {
        if (snakePart) {
            this.setBackground(new Color(0, 255, 0));
        } else if (pickUp) {
            this.setBackground(Color.RED);
        } else if (snakeHead) {
            this.setBackground(new Color(0, 116, 0));
        } else {
            this.setBackground(Color.WHITE);
        }
    }

    public static Label getLabel(int x, int y) {
        Label label = new Label(0, 0);

        for (Label lab : GUI.labelList) {
            if (lab.posX == x && lab.posY == y) {
                label = lab;
                break;
            }
        }

        return label;
    }
}
