package pagewindow;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.*;
import java.awt.event.*;



public class Starting_Page {

    JFrame frame;
    JButton limit_mode;
    JButton normal_mode;

    //Color Object
    Color btn_color=Color.decode("#408FEC");  // blue for buttons

    // Font Objects
    Font btn_font_sml=new Font("cambria",Font.BOLD,12);
    Font btn_font_medium =new Font("Cambria",Font.BOLD,16);


    public Starting_Page(){
        objectCreation();
        addToFrame();
        GamePage obj=new GamePage();
        obj.nextPageOp();
    }

    public  void objectCreation(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setTitle("Number Game");
        frame.setLayout(null);
        frame.setSize(800,360);

        ImageIcon number_game_image=new ImageIcon("numberGame.png");

        // Normal Mode Button
        normal_mode=new JButton("Normal Mode");
        normal_mode.setBounds(575,109,120,40);
        normal_mode.setBorderPainted(false);
        normal_mode.setFocusPainted(false);
        normal_mode.setBackground(btn_color);
        normal_mode.setFont(btn_font_sml);
        

        // Limit mode button
        limit_mode=new JButton("Limit Mode");
        limit_mode.setBounds(575,210,120,40);
        limit_mode.setBorderPainted(false);
        limit_mode.setFocusPainted(false);
        limit_mode.setBackground(btn_color);
        limit_mode.setFont(btn_font_sml);
    }

    void addToFrame(){
        frame.add(limit_mode);
        frame.add(normal_mode);
    }
}
