package MovieMangeSystemDemo;

public class Movie {
    private String id;//编号
    private String title;//片名
    private String time;//上映时间
    private double score;//评分
    private String type;//类型


    public Movie(String id, String title, String time, double score, String type) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.score = score;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
