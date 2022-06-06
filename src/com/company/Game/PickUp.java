package com.company.Game;

import com.company.GUI.GUI;
import com.company.GUI.Label;

public class PickUp {
    static int posX;
    static int posY;
    static Label pickUpLabel;

    public PickUp() {
        posX = 8;
        posY = 13;

        if (pickUpLabel != null) {
            pickUpLabel.pickUp = false;
        }

        pickUpLabel = Label.getLabel(posX, posY);
        pickUpLabel.pickUp = true;
    }

    public static void eaten() {
        pickUpLabel.pickUp = false;

        pickUpLabel = GUI.freeLabels.get(((int) (Math.random() * (GUI.freeLabels.size() - 1))));
        pickUpLabel.pickUp = true;
    }
}
