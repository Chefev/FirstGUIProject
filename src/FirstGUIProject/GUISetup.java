package FirstGUIProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class GUISetup implements ActionListener {
    JFrame frame;
    JLabel label;
    JTextField textField;
    int width;
    int height;

    public GUISetup(int w, int h) {
        width = w;
        height = h;

        frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        label = new JLabel("<html>Enter text in the text field below<br>to have it all capitalized!</html", JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Roboto Condensed", Font.PLAIN, 36));
        label.setBounds(0, 20, 400, 60);
        frame.add(label);

        textField = new JTextField("Enter your text here");
        textField.setBounds(40, 100, 300, 90);
        label.setFont(new Font("Roboto Condensed", Font.PLAIN, 12));
        frame.add(textField);

        JButton button = new JButton("Capitalize!");
        button.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
        button.setBounds(100, 210, 200, 90);
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        capitalize(label, textField.getText());
    }
        
    public void capitalize (JLabel l, String text) {
        l.setText(text.toUpperCase());
    }

    public String arrayToString(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
