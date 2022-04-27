import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUItest extends JFrame implements ActionListener {
    JTextField t1, t2;
    JLabel l1, l2;
    JButton b1;
    // JRadioButton rb1;
    // JCheckBox ch1;
    // JComboBox cb1;
    // JTextArea ta1;

    GUItest() {
        // layout settings
        setTitle("Title");
        setSize(400, 300);
        // setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add components
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        l1 = new JLabel("label 1");
        l2 = new JLabel("label 2");
        b1 = new JButton("button");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(t1.getText());
        t2.setText(String.valueOf(x));
    }

    public static void main(String[] args) {
        new GUItest();
    }
}
