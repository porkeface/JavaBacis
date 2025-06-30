package LibararySystemDemo;

public abstract class People extends Book {

    public People() {
    }

    ;

    public Boolean isRegex(String idName) {
        if (idName.matches(getId()) || idName.matches(getName())) {
            return true;
        }
        return false;
    }

    public Boolean isId(String id) {
        if (id.matches(getRegexId())) {
            return true;
        }
        return false;
    }

    public Boolean idName(String name) {
        if (name.matches(getRegexName())) {
            return true;
        }
        return false;
    }

    abstract void displayInfo();

    abstract void addBook(String id, String name, double price, int account);

    abstract void deleteBook(String idName);

    abstract void updateBook(String idName);

}
