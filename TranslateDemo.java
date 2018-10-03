import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TranslateDemo
{
   public static void main(String[] args)
   {
      // Construct a frame and show it
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      // Your work goes here: Construct a rectangle and set the frame bounds
      Rectangle r1 =  new Rectangle (50, 50, 100, 100);
      frame.setBounds(r1);
      JOptionPane.showMessageDialog(frame, "Click OK to continue");
      // Your work goes here: Move the rectangle and set the frame bounds again
      r1.grow(25,25);
      r1.translate(25, 25);
      frame.setBounds(r1);
   }
}