package Forum;

import Account.Account;

import java.util.ArrayList;
import java.util.Date;

public class Comment {

    private String text;
    private Account author;
    private Date date;

    public Comment(String text, Account author, Date date) {
        this.text = text;
        this.author = author;
        this.date = date;
    }


    public String getText() {
        return text;
    }

    //TODO: get author from account when finished

    public Date getDate() {
        return date;
    }
}
