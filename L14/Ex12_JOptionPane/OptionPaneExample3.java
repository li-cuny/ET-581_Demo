import javax.swing.*;
public class OptionPaneExample3 {
    JFrame f;
    OptionPaneExample3(){
        f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"Enter Name");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new OptionPaneExample3();
    }  
}
