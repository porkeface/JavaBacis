package StoneGameDemo;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Game extends JFrame implements KeyListener {
    JLabel background;
    int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8,},
            {9, 10, 11, 12},
            {13, 14, 15, 0}};
    int[][] key = {
            {1, 2, 3, 4},
            {5, 6, 7, 8,},
            {9, 10, 11, 12},
            {13, 14, 15, 0}};
    int intX;
    int intY;
    int step;

    public Game() {
        super("石头迷阵单机版1.0");//与setTitle("石头方阵单机版");差不多，但是必须放在构造方法里第一行
        //添加键盘监听
        this.addKeyListener(this);
        setWindow();
        initData();
        init();
        setVisible(true);
    }


    void initData() {
        //打乱数组
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;
            }
        }
        //获取0的位置
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] == 0) {
                    intX = i;
                    intY = j;
                }
            }
        }
    }

    //判断是否胜利
    boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != key[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //初始化界面
    void init() {
        getContentPane().removeAll();//移除面板容器中的组件，removeAll()移除JFrame中所有组件
        if (victory()) {
            JLabel vict = new JLabel(new ImageIcon("F:\\BaiduNetdiskDownload\\image\\win.png"));
            vict.setBounds(124, 230, 266, 88);
            add(vict);
        }

        //添加重新开始按钮
        JButton renew = new JButton("重新开始");
        renew.setBounds(350, 20, 100, 20);
        add(renew);
        renew.setFocusable(false);
        renew.addActionListener(e -> {
            step = 0;
            initData();
            init();
        });

        //添加计数标签
        JLabel scoreLabel = new JLabel("步数为：" + step);
        scoreLabel.setBounds(50, 20, 100, 20);
        add(scoreLabel);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel image = new JLabel(new ImageIcon("F:\\BaiduNetdiskDownload\\image\\" + data[i][j] + ".png"));
                image.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
                add(image);//默认添加到JFrame面板中
            }
        }
        background = new JLabel(new ImageIcon("F:\\BaiduNetdiskDownload\\image\\background.png"));
        background.setBounds(26, 30, 450, 484);//不设定大小则组件不显示
        add(background);
        getContentPane().repaint();
    }

    //设置窗口格式
    void setWindow() {
        //设置窗体关闭形式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(514, 595);
        //设置窗体最顶层
        setAlwaysOnTop(true);
        //设置窗体居中
        setLocationRelativeTo(null);
        setLayout(null);//取消默认布局后如果不设定组件大小不显示
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        keyMove(keyCode);
        init();
    }


    //交换二维数组元素位置
    void keyMove(int keyCode) {
        //胜利则不进行移动
        if (victory()) {
            return;
        }
        //右边位置与左边交换
        if (keyCode == 37) {
            if (intY == 3) {
                return;
            }
            step++;
            int temp = data[intX][intY];
            data[intX][intY] = data[intX][intY + 1];
            data[intX][intY + 1] = temp;
            intY++;
        }
        //下边位置与上边交换
        if (keyCode == 38) {
            if (intX == 3) {
                return;
            }
            step++;
            int temp = data[intX][intY];
            data[intX][intY] = data[intX + 1][intY];
            data[intX + 1][intY] = temp;
            intX++;
        }
        //右边位置与左边交换
        if (keyCode == 39) {
            if (intY == 0) {
                return;
            }
            step++;
            int temp = data[intX][intY];
            data[intX][intY] = data[intX][intY - 1];
            data[intX][intY - 1] = temp;
            intY--;

        }
        //上边位置与下边交换
        if (keyCode == 40) {
            if (intX == 0) {
                return;
            }
            step++;
            int temp = data[intX][intY];
            data[intX][intY] = data[intX - 1][intY];
            data[intX - 1][intY] = temp;
            intX--;
        }
        if (keyCode == 16) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8,},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}};
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

class GameTest {
    public static void main(String[] args) {
        new Game();
    }
}