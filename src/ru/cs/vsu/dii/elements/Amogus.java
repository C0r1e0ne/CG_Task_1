package ru.cs.vsu.dii.elements;

import java.awt.*;

public class Amogus {
    public int x;
    private final int y;
    private final int delta;
    private final Color c;
    private final int width;
    private final int height;

    public Amogus(int x, int y, Color c, int width, int height, int delta) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.width = width;
        this.height = height;
        this.delta = delta;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, width, height);
        g.setColor(c);
        g.fillOval(x + delta, y + delta, width - delta * 2, height - delta * 2); //голова

        g.setColor(Color.BLACK);
        g.fillRect(x, y + (height / 2), width, height + delta * 2);
        g.setColor(c);
        g.fillRect(x + delta, y + (height / 2), width - delta * 2, height + delta); //туловище

        g.setColor(Color.BLACK);
        g.fillRect(x, y + delta * 12 + (height / 2) - delta, width - delta * 9, height - delta * 3);
        g.setColor(c);
        g.fillRect(x + delta, y + delta * 12 + (height / 2) - delta * 2, width - delta * 11, height - delta * 3); //левая нога

        g.setColor(Color.BLACK);
        g.fillRect(x + delta * 9, y + delta * 12 + (height / 2) - delta, width - delta * 9, height - delta * 3);
        g.setColor(c);
        g.fillRect(x + delta * 10, y + delta * 12 + (height / 2) - delta * 2, width - delta * 11, height - delta * 3); //правая нога

        g.setColor(Color.BLACK);
        g.fillOval(x + delta * 6, y + delta * 6 - delta / 2, delta * 3 + width / 2, (delta / 2) + height / 2 + delta);
        g.setColor(Color.CYAN);
        g.fillOval(x + delta * 7, y + delta * 6, delta + width / 2, (delta / 3) + height / 2); //стекло

        g.setColor(Color.BLACK);
        g.fillRect(x - delta * 5, y + delta * 6, width / 3, height);
        g.setColor(c);
        g.fillRect(x - delta * 4, y + delta * 6 + delta, width / 3 - delta, height - delta * 2); //рюкзак
    }
}
