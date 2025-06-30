package StuMangeSystemDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    /*
    1.查询全部学生信息
    2.查询单个学生信息
    2.添加学生信息
    3.修改学生信息
    4.删除学生信息
    5.退出或退出系统
     */
    Scanner sc = new Scanner(System.in);
    ArrayList<StudentInformation> list = new ArrayList<>();

    //构造方法,传入测试内容
    public StudentManage() {
        StudentInformation stu1 = new StudentInformation("00000001", "陈景清", "男");
        StudentInformation stu2 = new StudentInformation("00000002", "陈暖树 ", "女");
        StudentInformation stu3 = new StudentInformation("00000003", "阿良", "男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

    }

    //设置测试内容，调用方法即可
    public void info() {
        StudentInformation stu1 = new StudentInformation("00000001", "陈景清", "男");
        StudentInformation stu2 = new StudentInformation("00000002", "陈暖树 ", "女");
        StudentInformation stu3 = new StudentInformation("00000003", "阿良", "男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
    }

    //循环遍历学生信息
    public void stuInfoInquire(ArrayList<StudentInformation> list) {
        System.out.println("\t\t全体学生信息\t\t");
        for (StudentInformation studentInformation : list) {
            System.out.println("学号\t\t姓名\t\t性别");
            StudentInformation stu = studentInformation;
            System.out.println(stu.getId() + "-----" + stu.getName() + "-----" + stu.getGender());
        }
    }

    //查询单个学生信息
    private void singleStuInquire(ArrayList<StudentInformation> list) {
        while (true) {
            System.out.print("请输入要查询的学生学号：");
            String id = sc.next();//nextLine()会接受上一个回车，所以用next()接受
            lo:
            if (id.length() == 8) {
                for (StudentInformation stu : list) {
                    String Id = stu.getId();
                    if (id.equals(Id)) {
                        System.out.println("您要查询的学生信息如下：");
                        System.out.println("学号\t\t姓名\t\t性别");
                        System.out.println(stu.getId() + "-----" + stu.getName() + "-----" + stu.getGender());
                        System.out.println();
                        break lo;
                    }
                }
                System.out.println("查无此人");
                System.out.println("请重新输入");

            } else if (Integer.parseInt(id) == 5) {
                return;
            } else {
                System.out.println("学号为八位数");
                System.out.println("请重输!");
            }
        }
    }

    //添加学生信息
    public void stuInfoAdd(ArrayList<StudentInformation> list) {
        while (true) {
            System.out.print("请输入要添加的学生的学号：");
            String id;//nextLine()会接受上一个回车，所以用next()接受
            lo:
            while (true) {
                id = sc.next();
                if (id.length() == 8) {
                    for (StudentInformation stu : list) {
                        String Id = stu.getId();
                        if (id.equals(Id)) {
                            System.out.println("已经存在此学生学号");
                            System.out.print("请重输：");

                        } else if (id.equals("00000005")) {
                            break lo;
                        } else if (Integer.parseInt(id) == 5) {
                            return;
                        }
                    }
                } else if (Integer.parseInt(id) == 5) {
                    return;
                }
                System.out.println("学号为八位数");
                System.out.print("请重输：");

            }
            System.out.print("请输入要添加的学生的姓名：");
            String name = sc.next();
            System.out.print("请输入要添加的学生的性别：");
            String gender;

            while (true) {
                gender = sc.next();
                if (gender.equals("男") || gender.equals("女")) {
                    break;
                } else if (Long.parseLong(gender) == 5) {
                    return;
                } else {
                    System.out.println("性别男或女");
                    System.out.print("请重输：");
                }
            }

            StudentInformation stu = new StudentInformation(id, name, gender);
            list.add(stu);
            System.out.println();
        }
    }

    //修改学生信息
    public void stuInfoModify(ArrayList<StudentInformation> list) {
        while (true) {
            System.out.print("请输入要修改信息的学生学号：");
            String Id = sc.next();//nextLine()会接受上一个回车，所以用next()接受
            lo:
            if (Id.length() == 8) {
                for (int i = 0; i < list.size(); i++) {
                    StudentInformation stu = list.get(i);
                    String id = stu.getId();
                    if (Id.equals(id)) {
                        System.out.print("将学生姓名修改为：");
                        String name = sc.next();
                        System.out.print("将学生性别修改为：");
                        String gender;
                        while (true) {
                            gender = sc.next();
                            if (gender.equals("男") || gender.equals("女")) {
                                break;
                            } else if (Long.parseLong(gender) == 5) {
                                return;
                            } else {
                                System.out.println("性别男或女");
                                System.out.print("请重输：");
                            }
                        }
                        stu.setName(name);
                        stu.setGender(gender);
                        list.set(i, stu);
                        System.out.println();
                        break lo;
                    }
                }
                System.out.println("查无此学号");
                System.out.println("请重新输入!");

            } else if (Long.parseLong(Id) == 5) {
                return;
            } else {
                System.out.println("学号为八位数");
                System.out.println("请重输!");

            }
        }
    }

    //删除学生信息
    public void stuInfoDel(ArrayList<StudentInformation> list) {
        while (true) {
            System.out.print("请输入要删除的学生信息学号：");
        /*
        next()接受到第一个空白字符前的内容，剩余的内容会跳到下一个键盘录入
        nextLine()接受一行内容
         */
            String id = sc.next();//nextLine()会接受上一个回车，所以用next()接受
            lo:
            if (id.length() == 8) {
                for (int i = 0; i < list.size(); i++) {
                    StudentInformation stu = list.get(i);
                    String Id = stu.getId();
                    if (id.equals(Id)) {
                        list.remove(i);
                        break lo;
                    }
                }
                System.out.println("查无此人");
                System.out.println("请重新输入!");

            } else if (Long.parseLong(id) == 5) {
                return;
            } else {
                System.out.println("学号为八位数");
                System.out.println("请重输!");
            }
        }

    }

    //整体结构构建
    public void Inquire() {
        while (true) {
            System.out.println("-----欢迎使用学生管理系统-----");
            System.out.println("    0.查询全部学生信息\n" +
                    "    1.查询单个学生信息\n" +
                    "    2.添加学生信息\n" +
                    "    3.修改学生信息\n" +
                    "    4.删除学生信息\n" +
                    "    5.退出或退出系统");
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    stuInfoInquire(list);
                    break;
                case 1:
                    singleStuInquire(list);
                    break;
                case 2:
                    stuInfoAdd(list);
                    break;
                case 3:
                    stuInfoModify(list);
                    break;
                case 4:
                    stuInfoDel(list);
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}
