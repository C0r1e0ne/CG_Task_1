package ru.cs.vsu.dii.elements;

import java.awt.*;

public class Window {
    public int x;
    private final int y;
    private final int width;
    private final int height;
    private final int delta;

    public Window(int x, int y, int width, int height, int delta) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.delta = delta;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.fillRect(x + delta, y + delta, width - delta * 2, height - delta * 2); //Окно

        g.setColor(Color.YELLOW);
        g.fillOval(x + width / 2, y + height / 5, height / 5, height / 5); //Солнце

        g.setColor(Color.WHITE);
        g.fillOval(x + delta * 5, y + delta * 5, width / 100, width / 100);
        g.fillOval(x + delta * 8, y + delta * 7, width / 100, width / 100);
        g.fillOval(x + delta * 9, y + delta * 10, width / 100, width / 100);
        g.fillOval(x + delta * 30, y + delta * 15, width / 100, width / 100);
        g.fillOval(x + delta * 15, y + delta * 17, width / 100, width / 100);
        g.fillOval(x + delta * 34, y + delta * 8, width / 100, width / 100);
        g.fillOval(x + delta * 29, y + delta * 9, width / 100, width / 100);
        g.fillOval(x + delta * 25, y + delta * 13, width / 100, width / 100);
        g.fillOval(x + delta * 17, y + delta * 11, width / 100, width / 100);
        g.fillOval(x + delta * 5, y + delta * 16, width / 100, width / 100); //Звёзды
    }
}
