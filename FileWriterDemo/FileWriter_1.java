package FileWriterDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

//*********Found********
public class FileWriter_1 implements ActionListener {

    JTextArea ta;
    JFrame f;
    JLabel label;
    JButton bt;

    public static void main(String args[]) {
        FileWriter_1 t = new FileWriter_1();
        t.go();
    }

    void go() {
        f = new JFrame("Save data");
        label = new JLabel("��������Ҫ������ı���");
        ta = new JTextArea(3, 20);
        bt = new JButton("����");
        //*********Found********
        f.add(label, BorderLayout.NORTH);
        f.add(ta, BorderLayout.CENTER);
        f.add(bt, BorderLayout.SOUTH);
        //*********Found********
        bt.addActionListener(this);
        f.setSize(400, 400);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            FileWriter out = new FileWriter("D:\\Soft\\Intellij IDEA 2024\\Javaproject\\JavaBacis\\FileWriterDemo\\out.txt");
            String str = ta.getText();
            //*********Found********
            out.write(str);
            out.close();
        } catch (Exception e) {
        }
    }
}
