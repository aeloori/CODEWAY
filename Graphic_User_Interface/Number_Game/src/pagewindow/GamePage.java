package pagewindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePage extends Starting_Page {
    void nextPageOp(){
        limit_mode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                gamePage();
            }
        });
    }

    protected void gamePage() {
        frame.remove(limit_mode);
        frame.remove(normal_mode);
        frame.validate();
        frame.repaint();

    }
}
