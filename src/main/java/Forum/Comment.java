package Forum;

import Account.Account;

import java.util.ArrayList;
import java.util.Date;

public class Comment {

    private String text;
    private Date date;

    public Comment(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
