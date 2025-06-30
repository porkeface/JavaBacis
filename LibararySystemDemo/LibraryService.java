package LibararySystemDemo;

import javax.swing.*;
import java.util.List;

public class LibraryService extends People implements Library {
    List<Book> list;

    public LibraryService(String id, String name, double price, int account) {
//        super(id,name,price,account);
    }

    public LibraryService() {
        super();
    }

    //判断集合中是否包含所查找书籍
    public Boolean isInclude(String idName) {
        if (isRegex(idName)) {
            for (Book book : list) {
                if (book.getId().equals(idName) || book.getName().equals(idName)) {
                    return true;
                }
            }
        }
        return false;
    }
//    public Book find(String idName){
//        if(isRegex(idName)){
//            for (Book book : list) {
//                if(book.getId().equals(idName)||book.getName().equals(idName)){
//                    return book;
//                }
//            }return;
//            }
//        }
//    }

    @Override
    void displayInfo() {
        for (Book book : list) {
        }
    }

    @Override
    void addBook(String id, String name, double price, int account) {

    }

    @Override
    void deleteBook(String idName) {

    }

    @Override
    void updateBook(String idName) {

    }


//    @Override
//    Boolean deleteBook(String idName) {
//        if(idName.matches(getId())||idName.matches(getName())){
//            for (Book book : list) {
//                if(book.getId().equals(idName)||book.getName().equals(idName)){
//                    list.remove(book);
//                    return true;
//                }
//            }
//        }return false;
//    }


    @Override
    public void lend(String idName) {
        for (Book book : list) {
            if (book.getId().equals(idName) || book.getName().equals(idName)) {
                setAccount(getAccount() - 1);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "书库中不存在《" + idName + "》");
    }

    @Override
    public void back(String idName) {

    }

    @Override
    public void query(String idName) {

    }
}

class dd {
    public static void main(String[] args) {
        LibraryService aa = new LibraryService();
//    aa.setId("a ");
//    aa.setName("fd 6");
//    String a=aa.getId();
//    boolean b =aa.regexId();
//    boolean c =aa.regexName();
//        System.out.println(b);
//        System.out.println(c);
    }
}