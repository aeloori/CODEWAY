package components;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import game.GameLogic;


public class FirstPageComponents extends Importer{

    //objects 
    protected static JButton limit_mode;
    protected static JButton normal_mode;

    protected JButton limitModeBtn(){
        limit_mode=new JButton();
        limit_mode=new JButton("Limit Mode");
        limit_mode.setBounds(575,200,120,40);
        limit_mode.setBorderPainted(false);
        limit_mode.setFocusPainted(false);
        limit_mode.setBackground(btn_color);
        limit_mode.setFont(btn_font_sml);
        return limit_mode;
    }

    protected JButton normalMode(){
        // Normal Mode Button
        normal_mode=new JButton();
        normal_mode=new JButton("Normal Mode");
        normal_mode.setBounds(575,100,120,40);
        normal_mode.setBorderPainted(false);
        normal_mode.setFocusPainted(false);
        normal_mode.setBackground(btn_color);
        normal_mode.setFont(btn_font_sml);
        return normal_mode;
    }

    protected JLabel numberGamePicture(){
        //picture initialization
        ImageIcon pic=new ImageIcon("numberGame.png");
        JLabel picture=new JLabel();
        picture.setIcon(pic);
        picture.setBounds(76,23,360,275);
        return picture;
    }
}
