package com.company.Snake;

import com.company.GUI.Label;

public class Body extends SnakeObject {
    SnakeObject parent;
    Label label;

    public Body(SnakeObject p) {
        super(p);
    }
}
