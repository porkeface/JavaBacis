package LibararySystemDemo;

// AbstractBook.java
public class Book {
    private String id;//图书编号
    private String name;//图书名称
    private double price;//图书价格
    private static int account;//图书数量
    private String regexId = "[a-z0-9]+";
    private String regexName = "[a-z| |\\.|'|-]+";

    public Book(String id, String name, double price, int account) {
        this.id = id;
        this.name = name;
        this.price = price;
        Book.account = account;
    }

    public Book() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        Book.account = account;
    }

    public String getRegexId() {
        return regexId;
    }

    public void setRegexId(String regexId) {
        this.regexId = regexId;
    }

    public String getRegexName() {
        return regexName;
    }

    public void setRegexName(String regexName) {
        this.regexName = regexName;
    }
}