package library;

public class rentlist {

    String user, book, returndate;

    public rentlist(String user, String book, String returndate) {
        this.user = user;
        this.book = book;
        this.returndate = returndate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

}
