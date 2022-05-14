package com.company.Lessons.les25zmeyka;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Unreal Snake");  //название программы
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //выход программы если жмем крестик
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);         //делаем окно видимым

    }


    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();

    }
}
