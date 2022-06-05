package com.company.GUI;

import com.company.Game.InputHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {
    static JFrame frame;
    static JPanel gameArea;
    static JPanel gameInformation;
    public static ArrayList<Label> labelList;

    public static void setUp() {
        frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(((17 * 30) + (17 * 5)), ((17 * 30) + (17 * 5)));

        labelList = new ArrayList<>();

        gameArea = new JPanel();
        gameArea.setBackground(Color.GRAY);
        gameArea.setLayout(new GridLayout(17, 17, 5, 5));
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                Label label = new Label(i, j);

                labelList.add(label);
                gameArea.add(label);
            }
        }

        gameInformation = new JPanel();

        JLabel text = new JLabel("Informations");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setPreferredSize(new Dimension(frame.getWidth(), 50));

        gameInformation.add(text);
        frame.addKeyListener(new InputHandler());
        frame.add(BorderLayout.CENTER, gameArea);
        frame.add(BorderLayout.NORTH, gameInformation);
        frame.setSize(((17 * 30) + (17 * 5)), (((17 * 30) + (17 * 5)) + 50));
    }

    public static void refresh() {
        for (Label label : labelList) {
            label.refresh();
        }
    }
}
