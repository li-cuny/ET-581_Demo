import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
public class JDPaneDemo extends JFrame
{
  public JDPaneDemo()
  {
    CustomDesktopPane desktopPane = new CustomDesktopPane();
    Container contentPane = getContentPane();
    contentPane.add(desktopPane, BorderLayout.CENTER);
    desktopPane.display(desktopPane);

    setTitle("JDesktopPane Example");
    setSize(300,350);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void  main(String args[])
  {
    new JDPaneDemo();
  }
}
