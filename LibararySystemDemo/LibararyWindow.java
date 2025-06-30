package LibararySystemDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibararyWindow extends JFrame {

    JLabel jlResearch, jlId, jlName, jlPrice, jlAccount, jlSelet, jlTearch, jlStu;
    JButton jbAdd, jbDel, jbAdjust, jbQuery, jbAllBook, jbLend, jbBack, jbQ, jbManege, jLend, jBack, Back;
    JRadioButton jrTearcher, jrStu;
    JTextField jtResearch, jtId, jtName, jtPrice, jtAccount;
    JPanel jp1 = new JPanel();
    JPanel jpLabel = new JPanel();
    JPanel jpText = new JPanel();
    ButtonGroup group1 = new ButtonGroup();//组1
    ButtonGroup group2 = new ButtonGroup();//组2
    LibraryService libraryService;

    public LibararyWindow() {
        super("图书管理系统");
        load();
        initStu();
    }

    public void load() {
        jlResearch = new JLabel("输入图书编号或名称：");
        jlId = new JLabel("图书编号");
        jlName = new JLabel("图书名称");
        jlPrice = new JLabel("图书价格");
        jlAccount = new JLabel("图书数量");
        jtResearch = new JTextField();
        jtId = new JTextField();
        jtName = new JTextField();
        jtPrice = new JTextField();
        jtAccount = new JTextField();
        jtResearch.setPreferredSize(new Dimension(140, 25));
        jtId.setPreferredSize(new Dimension(140, 25));
        jtName.setPreferredSize(new Dimension(140, 25));
        jtPrice.setPreferredSize(new Dimension(140, 25));
        jtAccount.setPreferredSize(new Dimension(140, 25));
        jbAdd = new JButton("添加图书");
        jbDel = new JButton("删除图书");
        jbAdjust = new JButton("修改图书");
        jbQuery = new JButton("查询图书");
        jbAllBook = new JButton("显示所有图书");
        jLend = new JButton(" 借书 ");
        jBack = new JButton(" 还书 ");
        jbLend = new JButton("借书");
        jbBack = new JButton("还书");
        jbQ = new JButton("查询");
        jbManege = new JButton("管理");
        Back = new JButton("返回");
        jp1.add(jlResearch);
        jp1.add(jtResearch);
        jp1.add(Back);
    }

    public void lendBackMuddle() {
        getContentPane().setLayout(new GridLayout(4, 1));
        add(jp1);
        JPanel jpLenkBack = new JPanel();
        jpLenkBack.add(jLend);
        jpLenkBack.add(jBack);
        add(jpLenkBack);
        jpLabel.setLayout(new GridLayout(1, 4));
        jpLabel.add(jlId);
        jpLabel.add(jlName);
        jpLabel.add(jlPrice);
        jpLabel.add(jlAccount);
        add(jpLabel);
        jpText.add(jtId);
        jpText.add(jtName);
        jpText.add(jtPrice);
        jpText.add(jtAccount);
        add(jpText);
        jLend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idNmae = jtResearch.getText();
                if (libraryService.isRegex(idNmae)) {
                    libraryService.lend(idNmae);
                    JOptionPane.showMessageDialog(null, "借出成功！");
                } else {
                    JOptionPane.showMessageDialog(null, "书籍编号或名称输入有误！");
                }
            }
        });
        pack();
    }

    public void qureyMuddle() {
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        getContentPane().setLayout(new GridLayout(4, 1));
        add(jp1);
        jp2.add(jbQuery);
        jp2.add(jbAllBook);
        add(jp2);
        jpLabel.setLayout(new GridLayout(1, 4));
        jpLabel.add(jlId);
        jpLabel.add(jlName);
        jpLabel.add(jlPrice);
        jpLabel.add(jlAccount);
        add(jpLabel);
        jpText.add(jtId);
        jpText.add(jtName);
        jpText.add(jtPrice);
        jpText.add(jtAccount);
        add(jpText);

        pack();
    }

    public void manageMuddle() {
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        jp2.add(jbAdd);
        jp2.add(jbDel);
        jp3.add(jbAdjust);
        jp3.add(jbQuery);
        jp3.add(jbAllBook);
        jpLabel.setLayout(new GridLayout(1, 4));
        jpLabel.add(jlId);
        jpLabel.add(jlName);
        jpLabel.add(jlPrice);
        jpLabel.add(jlAccount);
        jpText.add(jtId);
        jpText.add(jtName);
        jpText.add(jtPrice);
        jpText.add(jtAccount);
        setLayout(new GridLayout(5, 1));
        add(jp1);
        add(jp2);
        add(jp3);
        add(jpLabel);
        add(jpText);
        pack();
    }

    public void initStu() {
        setSize(400, 300);
//        group2.add(jbLend);group2.add(jbBack);group2.add(jbQ);
        jlSelet = new JLabel("请选择您的身份", SwingConstants.CENTER);
        jrTearcher = new JRadioButton("老师");
        jrStu = new JRadioButton("学生");
        jrTearcher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                initTearcher();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
        JPanel jpselet = new JPanel();
        JPanel jpA = new JPanel();
        group1.add(jrTearcher);
        group1.add(jrStu);
        jpselet.add(jrTearcher);
        jpselet.add(jrStu);
        jpA.add(jbLend);
        jpA.add(jbBack);
        jpA.add(jbQ);
        setLayout(new GridLayout(3, 1));
        add(jlSelet);
        add(jpselet);
        add(jpA);
        listen();
    }

    public void initTearcher() {
        setSize(400, 300);
//        group2.add(jbLend);group2.add(jbBack);group2.add(jbQ);group2.add(jbManege);
//        JPanel jpA =new JPanel();
//        jpA.add(jbLend);jpA.add(jbBack);jpA.add(jbQ);jpA.add(jbManege);
        jlSelet = new JLabel("请选择您的身份", SwingConstants.CENTER);
        jrTearcher = new JRadioButton("老师");
        jrStu = new JRadioButton("学生");
        jrStu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                initStu();
                getContentPane().validate();
                getContentPane().repaint();
            }
        });
        JPanel jpselet = new JPanel();
        JPanel jpA = new JPanel();
        group1.add(jrTearcher);
        group1.add(jrStu);
        jpselet.add(jrTearcher);
        jpselet.add(jrStu);
        jpA.add(jbLend);
        jpA.add(jbBack);
        jpA.add(jbQ);
        jpA.add(jbManege);
        setLayout(new GridLayout(3, 1));
        add(jlSelet);
        add(jpselet);
        add(jpA);
        listen();
    }

    public void listen() {
        jbLend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                lendBackMuddle();
                getContentPane().validate();
                getContentPane().repaint();
            }
        });
        jbBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                lendBackMuddle();
                getContentPane().validate();
                getContentPane().repaint();
            }
        });
        jbQ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                qureyMuddle();
                getContentPane().validate();
                getContentPane().repaint();
            }
        });
        jbManege.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jbManege.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                manageMuddle();
                getContentPane().validate();
                getContentPane().repaint();
            }
        });
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                initStu();
                getContentPane().validate();
                getContentPane().repaint();
            }
        });
    }

}

class hh {
    public static void main(String[] args) {
        LibararyWindow win = new LibararyWindow();
        win.setAlwaysOnTop(true);
        //设置窗体居中
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}


//    public void init(){
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
////        jlResearch =new JLabel("输入图书编号或名称：");
////        jtResearch =new JTextField();
////        jtResearch.setPreferredSize(new Dimension(140,25));
////        getContentPane().setLayout(new BorderLayout());
////
////        jlId =new JLabel("图书编号");
////        jlName =new JLabel("图书名称");
////        jlPrice =new JLabel("图书价格");
////        jlAccount =new JLabel("图书数量");
//
//
////        jtId =new JTextField();
////        jtName =new JTextField();
////        jtPrice =new JTextField();
////        jtAccount =new JTextField();
////        jtId.setPreferredSize(new Dimension(140,25));
////        jtName.setPreferredSize(new Dimension(140,25));
////        jtPrice.setPreferredSize(new Dimension(140,25));
////        jtAccount.setPreferredSize(new Dimension(140,25));
//
////        jbAdd =new JButton("添加图书");
////        jbDel =new JButton("删除图书");
////        jbAdjust =new JButton("修改图书");
////        jbQuery =new JButton("查询图书");
////        jbAllBook =new JButton("显示所以图书");
////        jp3.setLayout(new GridLayout(5,1));
//        jp1.add(jlResearch);jp1.add(jtResearch);jp1.add(Back);
//        jp2.add(jbAdd);jp2.add(jbDel);
//        jp3.add(jbAdjust);jp3.add(jbQuery);jp3.add(jbAllBook);
//        jp5.setLayout(new GridLayout(1,4));
//        jp5.add(jlId);jp5.add(jlName);jp5.add(jlPrice);jp5.add(jlAccount);
//        jp4.add(jtId);jp4.add(jtName);jp4.add(jtPrice);jp4.add(jtAccount);
//        setLayout(new GridLayout(5,1));
//        add(jp1);add(jp2);add(jp3);add(jp5);add(jp4);
////        jp2.add(jlId);jp2.add(jlName);jp2.add(jlPrice);jp2.add(jlAccount);
////        jp3.add(jbAdd);jp3.add(jbDel);jp3.add(jbAdjust);jp3.add(jbQuery);jp3.add(jbAllBook);
////        jp4.setLayout(new GridLayout(1,2));
////        jp4.add(jp2);jp4.add(jp3);
////        add(jp1,BorderLayout.NORTH);add(jp2,BorderLayout.WEST);add(jp3,BorderLayout.EAST);
//        pack();
//    }