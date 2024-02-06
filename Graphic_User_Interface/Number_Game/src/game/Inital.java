package game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import components.FirstPageComponents;
import components.SecondPageComponents;

import java.awt.event.*;



public class Inital extends FirstPageComponents implements SecondPageComponents{

    protected static JFrame frame;


    public Inital(){
        frameCreation();
        frameConfig();
        GameLogic.gamerunner();
    }

    public  void frameCreation(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setTitle("Number Game");
        frame.setLayout(null);
        frame.setSize(800,360);
    }

    void frameConfig(){
        frame.add(limitModeBtn());
        frame.add(normalMode());
        frame.add(numberGamePicture());
    }

    public void remove(){

    }

}
