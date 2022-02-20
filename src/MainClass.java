import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {

    public static void main(String[] args){
        // Word Counter app

        JFrame jFrame = new JFrame("Word Counter App");
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(700, 300, 500, 500);
        jFrame.setVisible(true);

        JLabel label = new JLabel("Enter text: ");
        label.setBounds(100,30,100,20);
        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(100,50,300,200);

        JButton button = new JButton("Count words");
        button.setBounds(175,300,150,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text = jTextArea.getText();
                if (!text.equals("")){
                    String[] words = text.split("\\s"); // \\s is char of space

                    JOptionPane.showMessageDialog(jFrame, "Total words are: " + words.length);
                }
            }
        });

        jFrame.add(label);
        jFrame.add(jTextArea);
        jFrame.add(button);

    }
}
