import javax.swing.*;
import java.awt.*;
import java.lang.Integer;
public class LayeredPaneExample extends JFrame {
    public LayeredPaneExample() {
        super("LayeredPane Example");
        setSize(200, 200);
        JLayeredPane pane = getLayeredPane();
        //creating buttons
        JButton top = new JButton();
        top.setBackground(Color.white);
        top.setBounds(20, 20, 50, 50);
        JButton middle = new JButton();
        middle.setBackground(Color.red);
        middle.setBounds(40, 40, 50, 50);
        JButton bottom = new JButton();
        bottom.setBackground(Color.cyan);
        bottom.setBounds(60, 60, 50, 50);
        //adding buttons on pane
        pane.add(bottom, Integer.valueOf(1));
        pane.add(middle, Integer.valueOf(2));
        pane.add(top, Integer.valueOf(3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        LayeredPaneExample panel = new  LayeredPaneExample();
        panel.setVisible(true);
    }
}
