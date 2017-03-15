package samples.frame;

import java.awt.*;
import javax.swing.*;

public class SimpleFrameTest {
    public static void main(String[] args) {

        // потік (диспетчеризації) обробки подій
        // потік у якому передаються події: клацання мишкою і натискання клавіш
        EventQueue.invokeLater(() ->
        {
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;
            SimpleFrame frame = new SimpleFrame();
         //   frame.setUndecorated(true); // withou everything :-)
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(true);
                frame.setBounds(20,20, screenWidth, screenHeight);
                frame.setSize(screenWidth/4, screenHeight/4);
                int x = 10;
                int y = 10;
                frame.setLocation(x,y);


                frame.setTitle("Їжачок");
                frame.setLocationByPlatform(true); // platform choose where to put window
                Image imageIcon = new ImageIcon("smile.png").getImage();
                frame.setIconImage(imageIcon);
                frame.setVisible(true);

        });
    }
}

    class SimpleFrame extends JFrame{
        private static final int DEFAULT_WIDTH = 300;
        private static final int DEFAULT_HEIGHT = 200;

        public SimpleFrame() {
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }
    }
