package MovieMangeSystemDemo;

import java.util.Scanner;

public class MovieHelp {
    Scanner sc = new Scanner(System.in);
    private Movie[] movies;

    public MovieHelp(Movie[] movies) {
        this.movies = movies;
    }

    public void start() {
        lo:
        while (true) {
            System.out.println();
            System.out.println("----------电影信息系统----------");
            System.out.println("请输入您的选择：");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询信息");
            System.out.println("输入e退出");

            String input = sc.next();
            switch (input) {
                case "1":
                    System.out.println("全部电影信息如下:");
                    queryMoviesInfos();
                    break;
                case "2":
                    System.out.println("请输入电影的id：");
                    queryMovieById();
                    break;
                case "e":
                    System.out.println("感谢您的使用！！！");
                    break lo;
                default:
                    System.out.println("您输入的信息有误，请重输！");
            }
        }
    }

    private void queryMoviesInfos() {
        for (int i = 0; i < 3; i++) {
            Movie movie = movies[i];//创建一个Movie类型的变量接受movies数组数据
            System.out.println(movie.getTitle() + "---" + movie.getTime()
                    + "---" + movie.getScore() + "---" + movie.getType());
        }
    }

    private void queryMovieById() {
        String id = sc.next();
        System.out.println("您所查询的电影信息如下：");
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            if (id.equals(movie.getId())) {
                System.out.println(movie.getTitle() + "---" + movie.getTime()
                        + "---" + movie.getScore() + "---" + movie.getType());
                return;
            }
        }
        System.out.println("无此电影id！！！");
        System.out.println("请重输！！！");
    }
}
