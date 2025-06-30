package LibararySystemDemo;

public interface Library {
    void lend(String idName);//借书

    void back(String idName);//还书

    void query(String idName);//查询
}
