package samples.actionevents_03;

import java.awt.*;
import javax.swing.*;

/**
 * @version 1.33 2007-06-12
 * @author Cay Horstmann
 */
public class FramesDemo
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new ActionFrame();
//               JFrame frame = new ButtonFrame();
//               JFrame frame = new MouseFrame();
//               JFrame frame = new PlafFrame();
               frame.setTitle("ActionTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}