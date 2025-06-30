package ToolKitDemo;

import javax.swing.*;
import java.awt.*;

public class ToolKit_1 {

    static final int WIDTH = 300;
    static final int HEIGHT = 200;

    public static void main(String[] args) {
        // ����JFrame����
        JFrame jf = new JFrame();

        // ���ô��ڴ�С
        jf.setSize(WIDTH, HEIGHT);

        // ����Ĭ�Ϲرղ��������رմ���ʱ�˳�����
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ���ô��ڱ���
        jf.setTitle("��Ʊ����ϵͳ");

        // ��ȡĬ�ϵĹ��߰�
        Toolkit kit = Toolkit.getDefaultToolkit();

        // ��ȡ��Ļ�ߴ�
        Dimension screenSize = kit.getScreenSize();

        // ��ȡ��Ļ��Ⱥ͸߶�
        int width = screenSize.width;
        int height = screenSize.height;

        // ���㴰������Ļ�ϵ�λ�ã�ʹ�����
        int x = (width - WIDTH) / 2;
        int y = (height - HEIGHT) / 2;

        // ���ô��ڵ�λ��
        jf.setLocation(x, y);

        // ��ʾ����
        jf.setVisible(true);
    }
}
