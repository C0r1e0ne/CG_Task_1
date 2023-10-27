package ru.cs.vsu.dii.elements;

import java.awt.*;

public class OpenDoor {
    public int x;
    private final int y;
    private final int width;
    private final int height;
    private final int r;

    public OpenDoor(int x, int y, int width, int height, int r) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.r = r;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);//проход

        g.setColor(Color.RED);
        g.fillRect(x + width / 2, y, 5, 20);//провод

        g.setColor(new Color(143, 143, 143));
        int nPoints = 3;
        int[] roofX = {x + width / 2 + 2, x + width / 2 - r, x + width / 2 + r};
        int[] roofY = {y + 5, y + r * 2, y + r * 2};
        g.fillPolygon(roofX, roofY, nPoints); //серая фигня для лампы

        g.setColor(Color.YELLOW);
        g.fillRect(x + width / 2 - 5, y + r * 2, width / 23, height / 25);
        g.fillOval(x + width / 2 - 15, y + r * 2, r, r); //лампа

        Amogus amogus1 = new Amogus(x + 50, y + height - 75, Color.MAGENTA, 30, 20, 2);
        amogus1.draw(g);

    }
}
