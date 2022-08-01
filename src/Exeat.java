import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Exeat {

    void takeExeat() {

        // frame, size, layout
        JFrame f = new JFrame("Exeat Application");
        f.setSize(600, 600);
        f.setLayout(new GridLayout(7, 1));

        JLabel reasonLabel = new JLabel("Reason: ");
        JTextField reasonField = new JTextField();
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField();
        JLabel matricLabel = new JLabel("Matric Number: ");
        JTextField matricNumberField = new JTextField();

        // add labels and textfields
        f.add(reasonLabel);
        f.add(reasonField);

        f.add(nameLabel);
        f.add(nameField);

        f.add(matricLabel);
        f.add(matricNumberField);

        // create btn
        JButton btn = new JButton("Take Exeat");
        f.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                String reasonText = reasonField.getText();
                String nameText = nameField.getText();
                String matricText = matricNumberField.getText();

                try {
                    FileWriter writer = new FileWriter("exeats taken.txt");
                    writer.append(reasonText + "\n");
                    writer.append(nameText + "\n");
                    writer.append(matricText + "\n\n");           // \n means add new line


                    writer.close();
                } catch (Exception x) {
                    System.out.println(x);
                }
            }
        });

        f.setVisible(true);
    }

}
