package ToolKitDemo;

import javax.swing.*;
import java.awt.*;

public class ToolKit_1 {

    static final int WIDTH = 300;
    static final int HEIGHT = 200;

    public static void main(String[] args) {
        // 创建JFrame对象
        JFrame jf = new JFrame();

        // 设置窗口大小
        jf.setSize(WIDTH, HEIGHT);

        // 设置默认关闭操作，当关闭窗口时退出程序
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口标题
        jf.setTitle("股票分析系统");

        // 获取默认的工具包
        Toolkit kit = Toolkit.getDefaultToolkit();

        // 获取屏幕尺寸
        Dimension screenSize = kit.getScreenSize();

        // 获取屏幕宽度和高度
        int width = screenSize.width;
        int height = screenSize.height;

        // 计算窗口在屏幕上的位置，使其居中
        int x = (width - WIDTH) / 2;
        int y = (height - HEIGHT) / 2;

        // 设置窗口的位置
        jf.setLocation(x, y);

        // 显示窗口
        jf.setVisible(true);
    }
}
