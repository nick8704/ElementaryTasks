package com.anikonets.task1;

public class Board {

    private int height;
    private int width;
    private String evenLine;
    private String oddLine;
    private final char BLACK_CELL = '*';
    private final char WHITE_CELL = ' ';

    public Board(int width, int height) {
        this.height = height;
        this.width = width;
        evenLine = initializationEvenLine(height);
        oddLine = initializationOddLine(height);
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

    private String initializationEvenLine(int height) {
        return defaultLine(height);
    }

    private String initializationOddLine(int height) {
        StringBuilder line = new StringBuilder(defaultLine(height));
        if(line.toString().equals("")) {
            return line.toString();
        }
        if(defaultLine(height).endsWith(" ")) {
            line.append(BLACK_CELL);
        }
        return line.toString().substring(1);
    }

    private String defaultLine(int height) {
        StringBuilder line = new StringBuilder();
        if(height <= 0) {
            return line.toString();
        }
        for (int i = 0; i < height; i++) {
            if(i % 2 == 0) {
                line.append(BLACK_CELL);
            } else {
                line.append(WHITE_CELL);
            }
        }
        return line.toString();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}