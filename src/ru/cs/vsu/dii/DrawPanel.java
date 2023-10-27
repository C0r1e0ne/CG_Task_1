package ru.cs.vsu.dii;

import ru.cs.vsu.dii.elements.*;
import ru.cs.vsu.dii.elements.Window;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DrawPanel extends JPanel {
    Amogus amogus;
    Background background;

    OpenDoor[] oDoor;
    Poster[] poster;
    Ventilation[] vent;
    Window[] win;

    public DrawPanel() {
        background = new Background(0, 0, 1550, 540, 0, 540, 1550, 10, 0, 550, 1550, 290);
        amogus = new Amogus(500, 250, Color.RED, 300, 200, 20);


        win = new Window[1];
        win[0] = new Window(900, 150, 400, 200, 10);

        vent = new Ventilation[1];
        vent[0] = new Ventilation(100, 400, 200, 100, 15, 80, 5, 50, 10);


        poster = new Poster[1];
        poster[0] = new Poster(55, 100, 300, 200, 20, Color.WHITE);

        oDoor = new OpenDoor[1];
        oDoor[0] = new OpenDoor(450, 50, 300, 490, 30);

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < win.length; i++) {
                    win[0].x--;
                    if (win[0].x < -400) {
                        win[0].x = 1700;
                    } else {
                        break;
                    }
                }
                for (int i = 0; i < vent.length; i++) {
                    vent[0].x--;
                    if (vent[0].x < -400) {
                        vent[0].x = 1700;
                    }
                }
                for (int i = 0; i < vent.length; i++) {
                    poster[0].x--;
                    if (poster[0].x < -400) {
                        poster[0].x = 1700;
                    }
                }
                for (int i = 0; i < oDoor.length; i++) {
                    oDoor[0].x--;
                    if (oDoor[0].x < -400) {
                        oDoor[0].x = 1700;
                    }
                }
                repaint();
            }

        }, 4, 2, TimeUnit.MILLISECONDS);
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        background.draw(g);

        for (int i = 0; i < win.length; i++) {
            Window window = win[i];
            if (win != null) {
                window.draw(g);
            }
        }
        for (Ventilation ventilation : vent) {
            if (vent != null) {
                ventilation.draw(g);
            }
        }
        for (Poster poster : poster) {
            if (poster != null) {
                poster.draw(g);
            }
        }
        for (OpenDoor openDoor : oDoor) {
            if (openDoor != null) {
                openDoor.draw(g);
            }
        }
        amogus.draw(g);

    }
}


//        CloseDoor door1 = new CloseDoor(450,50,300,490,30);
//        door1.draw(g);

//        OpenDoor door2 = new OpenDoor(450, 50, 300, 490, 30);
//        door2.draw(g);