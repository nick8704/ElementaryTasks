package com.anikonets.task1;

public class Board {

    private int height;
    private int width;
    private String oddLine;
    private String evenLine;

    public Board() {
    }

    public Board(int width, int height) {
        this.height = height;
        this.width = width;
        initializationLines(height);
    }

    private void initializationLines(int height) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < height; i++) {
            if(i % 2 == 0) {
                line.append("*");
            } else {
                line.append(" ");
            }
        }
        evenLine = line.toString();
        if(evenLine.endsWith(" ")) {
            line.append("*");
        }
        oddLine = line.toString().substring(1);
    }

    public void drawBoard() {
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.println(evenLine);
            } else {
                System.out.println(oddLine);
            }
        }
    }

}