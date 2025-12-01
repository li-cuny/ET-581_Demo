import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class JComponentExample {
    public static void main(String[] arguments) {
        MyJComponent com = new MyJComponent();
        // create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JComponent Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add the JComponent to main frame
        frame.add(com);
        frame.setVisible(true);
    }
}
