import javax.swing.*;
public class SliderExample extends JFrame{
    public SliderExample() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel=new JPanel();
        panel.add(slider);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    public static void main(String s[]) {
        SliderExample frame=new SliderExample();
        frame.pack();
        frame.setVisible(true);
    }
}
