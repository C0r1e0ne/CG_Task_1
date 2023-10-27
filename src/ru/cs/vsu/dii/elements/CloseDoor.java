package ru.cs.vsu.dii.elements;

import java.awt.*;

public class CloseDoor {
    public int x;
    private final int y;
    private final int width;
    private final int height;
    private final int r;

    public CloseDoor(int x, int y, int width, int height, int r) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.r = r;
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(38, 38, 38));
        g.fillRect(x, y, width, height);
        g.setColor(new Color(82, 80, 80));
        g.fillOval(x + width - r * 2, y + height / 2, r, r);

    }
}
