package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import components.FirstPageComponents;

public class GameLogic extends FirstPageComponents{
    public static void gamerunner(){
        normal_mode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeFirstPageEl();
                GameVariable.gameModeBool=true;
            }
        });

        limit_mode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
                removeFirstPageEl();
                GameVariable.gameModeBool=false;
            }
        });

    }

    static void removeFirstPageEl(){
        Inital.frame.remove(limit_mode);
        Inital.frame.remove(normal_mode);
        Inital.frame.validate();
        Inital.frame.repaint();
    }
}
