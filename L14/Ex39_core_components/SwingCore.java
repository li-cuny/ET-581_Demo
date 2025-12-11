
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCore {

    public static void main(String[] args) {
        // 1. JFrame - Main Window
        JFrame frame = new JFrame("Java Swing Core Components Demo");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 2. JPanel - Container for grouping items
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2, 5, 5)); // 8 rows, 2 columns, 5px spacing

        // 3. JLabel - Display text
        JLabel label = new JLabel("Enter your name:");
        panel.add(label);

        // 4. JTextField - Single-line input
        JTextField textField = new JTextField();
        panel.add(textField);

        // 5. JTextArea - Multi-line input
        JLabel textAreaLabel = new JLabel("Enter your bio:");
        panel.add(textAreaLabel);
        JTextArea textArea = new JTextArea(3, 20);
        JScrollPane scrollPane = new JScrollPane(textArea); // scrollable
        panel.add(scrollPane);

        // 6. JComboBox - Dropdown list
        JLabel comboLabel = new JLabel("Select your country:");
        panel.add(comboLabel);
        String[] countries = {"USA", "Canada", "UK", "Australia"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        panel.add(comboBox);

        // 7. JCheckBox - Multiple selection option
        JLabel checkLabel = new JLabel("Select your hobbies:");
        panel.add(checkLabel);
        JPanel checkPanel = new JPanel();
        JCheckBox cb1 = new JCheckBox("Reading");
        JCheckBox cb2 = new JCheckBox("Traveling");
        JCheckBox cb3 = new JCheckBox("Gaming");
        checkPanel.add(cb1);
        checkPanel.add(cb2);
        checkPanel.add(cb3);
        panel.add(checkPanel);

        // 8. JRadioButton - Single selection option
        JLabel radioLabel = new JLabel("Select your gender:");
        panel.add(radioLabel);
        JPanel radioPanel = new JPanel();
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        JRadioButton rb3 = new JRadioButton("Other");
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        radioPanel.add(rb1);
        radioPanel.add(rb2);
        radioPanel.add(rb3);
        panel.add(radioPanel);

        // 9. JButton - Clickable button
        JButton button = new JButton("Submit");
        panel.add(new JLabel()); // empty label for spacing
        panel.add(button);

        // ActionListener for button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String bio = textArea.getText();
                String country = (String) comboBox.getSelectedItem();

                String hobbies = "";
                if (cb1.isSelected()) hobbies += "Reading ";
                if (cb2.isSelected()) hobbies += "Traveling ";
                if (cb3.isSelected()) hobbies += "Gaming ";

                String gender = "";
                if (rb1.isSelected()) gender = "Male";
                else if (rb2.isSelected()) gender = "Female";
                else if (rb3.isSelected()) gender = "Other";

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\nBio: " + bio + "\nCountry: " + country +
                                "\nHobbies: " + hobbies + "\nGender: " + gender,
                        "Submitted Data",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
