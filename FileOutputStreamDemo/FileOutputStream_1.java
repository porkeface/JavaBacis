package FileOutputStreamDemo;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStream_1 implements ActionListener {
    public static void main(String args[]) {
        FileOutputStream_1 t = new FileOutputStream_1();
        //*********Found**********
        JFrame f = new JFrame("Test");
        JButton b = new JButton("¸´ÖÆÎÄ¼þ");
        b.setSize(100, 40);
        b.addActionListener(t);
        f.setSize(400, 400);
        //*********Found**********
        f.getContentPane().add(b);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            //*********Found**********
            FileInputStream in = new FileInputStream("D:\\Soft\\Intellij IDEA 2024\\Javaproject\\JavaBacis\\FileOutputStreamDemo\\a.txt");
            //*********Found**********
            FileOutputStream out = new FileOutputStream("D:\\Soft\\Intellij IDEA 2024\\Javaproject\\JavaBacis\\FileOutputStreamDemo\\b.txt");
            int c;
            while ((c = in.read()) != -1)
                out.write(c);
            in.close();
            out.close();
        } catch (Exception e) {
        }
    }
}
