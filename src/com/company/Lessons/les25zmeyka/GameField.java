package com.company.Lessons.les25zmeyka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    private final int SIZE = 320;  //размер игрового окна 320*320
    private final int DOT_SIZE = 16; //размер одного звена змейки 16*16
    private final int ALL_DOTS = 400;  //финальные переменные пишем с БОЛЬШОЙ буквы

    private Image dot;
    private Image apple;

    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];

    private int appleX;
    private int appleY;

    private int dots;
    private Timer timer;

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;

    private boolean inGame = true;

    public void loadImage() {
        ImageIcon iia = new ImageIcon("apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("dot.png");
        dot = iid.getImage();
    }

    public void createApple() {
        appleX = new Random().nextInt(20) * DOT_SIZE;  //генерируем число 1-20, тк может получится только 20 яблок
        appleY = new Random().nextInt(20) * DOT_SIZE;
    }

    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];

        }

        if (left) {
            x[0] -= DOT_SIZE;
        }
        if (right) {
            x[0] += DOT_SIZE;
        }
        if (up) {
            y[0] += DOT_SIZE;
        }
        if (down) {
            y[0] -= DOT_SIZE;
        }

    }

    public void checkCollision() {
        for (int i = dots; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }
        if (x[0] > SIZE)
            inGame = false;
        if (x[0] < 0)
            inGame = false;
        if (y[0] > SIZE)
            inGame = false;
        if (y[0] < 0)
            inGame = false;
    }

    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            dots++;
            createApple();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {
            g.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);
            }
        } else {
            String str = "Game over";
            g.setColor(Color.BLACK);
            g.drawString(str, SIZE / 6, SIZE / 2);   //координаты надписи
        }
    }


    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            y[i] = 48;
            x[i] = 48 - i * DOT_SIZE;
        }
        timer = new Timer(250,this); //фпс, скорость игры
        timer.start();
        createApple();
    }

    public GameField(){
        setBackground(Color.BLACK);
        loadImage();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame){
            checkApple();
            checkCollision();
            move();
        }
        repaint();
    }

    class FieldKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }

            if (key == KeyEvent.VK_UP && !down) {
                down = true;
                left = false;
                right = false;
            }
            if (key == KeyEvent.VK_DOWN && !up) {
                up = true;
                left = false;
                right = false;
            }

        }
    }
}
