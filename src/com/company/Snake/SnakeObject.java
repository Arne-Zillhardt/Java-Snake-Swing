package com.company.Snake;

import com.company.GUI.Label;

public class SnakeObject {
    int posX;
    int posY;
    SnakeObject parent;
    Label label;

    public SnakeObject() {

    }

    public SnakeObject(SnakeObject p) {
        parent = p;
        posX = parent.posX;
        posY = parent.posY - 1;

        //label = Label.getLabel(posX, posY);
        //label.snakePart = true;
    }

    public void clear() {
        if (label != null) {
            label.snakePart = false;
        }
    }

    public void move() {
        posX = parent.posX;
        posY = parent.posY;

        label = Label.getLabel(posX, posY);
        label.snakePart = true;
    }
}
