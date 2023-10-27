package ru.cs.vsu.dii.elements;

import java.awt.*;

public class Background {
    private final int x1;
    private final int y1;
    private int width1;
    private int height1;

    private final int x2;
    private final int y2;
    private int width2;
    private int height2;

    private final int x3;
    private final int y3;
    private int width3;
    private int height3;

    public Background(int x1, int y1, int width1, int height1, int x2, int y2, int width2, int height2, int x3, int y3, int width3, int height3) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;
        this.x2 = x2;
        this.y2 = y2;
        this.width2 = width2;
        this.height2 = height2;
        this.x3 = x3;
        this.y3 = y3;
        this.width3 = width3;
        this.height3 = height3;
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(110, 110, 110)); //вверх
        g.fillRect(x1, y1, width1, height1);

        g.setColor(Color.BLACK); //средняя линия
        g.fillRect(x2, y2, width2, height2);

        g.setColor(new Color(41, 41, 41)); //низ
        g.fillRect(x3, y3, width3, height3);
    }
}
