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

        // Create labels and text field

        // reason: label and textfield
        JLabel reasonLabel = new JLabel("Reason: ");
        JTextField reasonField = new JTextField();

        // name: label and textfield
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField();

        // matric: label and textfield
        JLabel matricLabel = new JLabel("Matric Number: ");
        JTextField matricNumberField = new JTextField();

        // add labels and text-fields
        f.add(reasonLabel);
        f.add(reasonField);

        f.add(nameLabel);
        f.add(nameField);

        f.add(matricLabel);
        f.add(matricNumberField);

        // create take exeat button
        JButton btn = new JButton("Take Exeat");
        f.add(btn);

        // add listener on the button
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                // Get the values inputed into the fields
                String reasonText = reasonField.getText();
                String nameText = nameField.getText();
                String matricText = matricNumberField.getText();

                // Write recieved input into a file
                try {
                    FileWriter writer = new FileWriter("exeats.txt");
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
