package ru.cs.vsu.dii.elements;

import java.awt.*;

public class Ventilation {
    public int x;
    private final int y;
    private final int width1;
    private final int height1;
    private final int width2;
    private final int height2;
    private final int n;
    private final int r;
    private final int delta;

    public Ventilation(int x, int y, int width1, int height1, int width2, int height2, int n, int r, int delta) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;
        this.width2 = width2;
        this.height2 = height2;
        this.n = n;
        this.r = r;
        this.delta = delta;
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(161, 161, 161));
        g.fillRoundRect(x, y, width1, height1, r, r); //прямоугольник

        g.setColor(new Color(54, 54, 54));
        int i = 0;
        while (width1 > delta * i) {
            g.fillOval(x + delta * i, y + delta, width2, height2);
            i += 2;
        } //отверстия

        g.setColor(Color.BLACK);
        g.fillOval(x + r / (delta / 3), y + delta / 2, r / delta, r / delta);
        g.fillOval(x + width1 - r + r / (delta / 3), y + delta / 2, r / delta, r / delta);
        g.fillOval(x + r / (delta / 3), y + height1 - delta, r / delta, r / delta);
        g.fillOval(x + width1 - r + r / (delta / 3), y + height1 - delta, r / delta, r / delta); //болты

    }
}
