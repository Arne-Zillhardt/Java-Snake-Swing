package com.company.GUI;

import com.company.Game.InputHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {
    static JFrame frame;
    static JPanel gameArea;
    static JPanel gameInformation;
    static JLabel text;
    static InputHandler handler;
    public static ArrayList<Label> labelList;
    public static ArrayList<Label> freeLabels;

    public static void setUp() {
        frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(((17 * 30) + (17 * 5)), ((17 * 30) + (17 * 5)));

        labelList = new ArrayList<>();

        freeLabels = new ArrayList<>();

        gameArea = new JPanel();
        gameArea.setBackground(Color.GRAY);

        gameInformation = new JPanel();

        text = new JLabel("Informations");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setPreferredSize(new Dimension(frame.getWidth(), 50));

        build();
    }

    public static void refresh() {
        freeLabels.clear();

        for (Label label : labelList) {
            if (!label.snakePart && !label.snakeHead) {
                freeLabels.add(label);
            }

            label.refresh();
        }
    }

    public static void build() {
        frame.setSize(((17 * 30) + (17 * 5)), ((17 * 30) + (17 * 5)));

        labelList.clear();
        freeLabels.clear();

        gameArea.removeAll();
        gameArea.setLayout(new GridLayout(17, 17, 5, 5));
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                Label label = new Label(i, j);

                labelList.add(label);
                gameArea.add(label);
            }
        }

        gameInformation.removeAll();
        gameInformation.add(text);

        frame.add(BorderLayout.CENTER, gameArea);
        frame.add(BorderLayout.NORTH, gameInformation);
        frame.removeKeyListener(handler);
        handler = new InputHandler();
        frame.addKeyListener(handler);
        frame.setSize(((17 * 30) + (17 * 5)), (((17 * 30) + (17 * 5)) + 50));
    }
}
