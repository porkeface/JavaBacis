package JFileChooserDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//*********Found**********
public class JFileChooser_1 implements ActionListener {
    JTextArea ta;
    JFileChooser fc;
    Container c;
    File myFile;

    public static void main(String args[]) {
        JFileChooser_1 demo = new JFileChooser_1();
        demo.go();
    }

    void go() {
        JFrame f = new JFrame("File Chooser Demo");
        JButton b = new JButton("Open file");
        ta = new JTextArea("Where is your file path?", 10, 30);
        //*********Found**********
        b.addActionListener(this);
        c = f.getContentPane();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add("South", b);
        f.getContentPane().add("Center", ta);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        fc = new JFileChooser();
        //*********Found**********
        int selected = fc.showOpenDialog(c);//弹出“保存文件”文件选择器对话框。
        if (selected == JFileChooser.APPROVE_OPTION) {
            myFile = fc.getSelectedFile();
            //*********Found**********
            ta.setText("You have selected file: " + myFile.getName());
        }
    }
}