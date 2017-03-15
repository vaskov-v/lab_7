package samples.graphics_02;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @version 1.33 2007-04-14
 * @author Cay Horstmann
 */
public class Image2HTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new ImageHFrame();
               frame.setTitle("Hedgehog european");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

/**
 * A frame with an image component
 */
class ImageHFrame extends JFrame
{
   public ImageHFrame()
   {
      add(new ImageHComponent());
      pack();
   }
}

/**
 * A component that displays a tiled image
 */
class ImageHComponent extends JComponent
{
   private static final int DEFAULT_WIDTH = 800;
   private static final int DEFAULT_HEIGHT = 600;

   private Image image;

   public ImageHComponent()
   {
      image = new ImageIcon("images/European_hedgehog.jpg").getImage();
   }

   public void paintComponent(Graphics g)
   {
      if (image == null) return;

      int imageWidth = image.getWidth(this);
      int imageHeight = image.getHeight(this);


    //  g.drawImage(image, 0, 0, null);
      g.drawImage(createResizedCopy(image, 800, 600, true), 0, 0, null);

   }
   BufferedImage createResizedCopy(Image originalImage,
                                   int scaledWidth, int scaledHeight,
                                   boolean preserveAlpha)
   {
      System.out.println("resizing...");
      int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
      BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
      Graphics2D g = scaledBI.createGraphics();
      if (preserveAlpha) {
         g.setComposite(AlphaComposite.Src);
      }
      g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);
      g.dispose();
      return scaledBI;
   }
   
   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}
