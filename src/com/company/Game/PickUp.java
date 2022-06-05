package com.company.Game;

import com.company.GUI.Label;

public class PickUp {
    static int posX;
    static int posY;
    static Label pickUpLabel;

    public PickUp() {
        posX = 8;
        posY = 13;

        pickUpLabel = Label.getLabel(posX, posY);
        pickUpLabel.pickUp = true;
    }

    public static void eaten() {
        pickUpLabel.pickUp = false;

        posX = (int) (Math.random() * 17);
        posY = (int) (Math.random() * 17);

        pickUpLabel = Label.getLabel(posX, posY);
        pickUpLabel.pickUp = true;
    }
}
