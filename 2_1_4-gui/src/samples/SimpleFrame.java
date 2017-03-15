package samples;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by andriy on 3/13/17.
 */
public class SimpleFrame extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame simpleFrame = new SimpleFrame();
                simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                simpleFrame.setSize(300, 300);
                simpleFrame.setVisible(true);


            }
        });
    }
}
