import java.awt.EventQueue;

import game.Inital;

public class App {

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inital start=new Inital();
            }
        });
    }
}
