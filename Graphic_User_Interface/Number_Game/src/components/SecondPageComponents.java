package components;

import javax.swing.JTextField;

public interface SecondPageComponents {
    
        static JTextField inputField() {
        JTextField number_input=new JTextField();
        number_input.setSize(250,40);
        number_input.setLocation(494, 108);
        number_input.setVisible(true);
        number_input.setFocusable(true);
        return number_input;
    }


}
