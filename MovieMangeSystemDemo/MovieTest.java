package MovieMangeSystemDemo;

public class MovieTest {
    public static void main(String[] args) {

        Movie moviel = new Movie("1", "我不是药神", "2018", 9.0, "喜剧");
        Movie movie2 = new Movie("2", "第二十一条", "2024", 7.6, "戏剧");
        Movie movie3 = new Movie("3", "活着", "1994", 9.3, "家庭");
        Movie[] movies = {moviel, movie2, movie3};
        MovieHelp s = new MovieHelp(movies);
        s.start();

    }
}
