package ru.cs.vsu.dii.elements;

import java.awt.*;

public class Poster {
    public int x;
    private final int y;
    private final int width;
    private final int height;
    private final int delta;
    private final Color c;

    public Poster(int x, int y, int width, int height, int delta, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.delta = delta;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        g.setColor(c);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times", Font.PLAIN, 30));
        g.drawString("Быть воином", x + 55, y + delta * 4);
        g.drawString("Жить вечно", x + 55, y + delta * 6);

    }
}
