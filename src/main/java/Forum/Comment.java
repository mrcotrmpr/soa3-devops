package Forum;

import Account.Account;

import java.util.ArrayList;
import java.util.Date;

public class Comment extends ForumCompositeComponent {
    public ArrayList<ForumComponent> comments;
    private String text;
    private Account author;
    private Date date;

    public Comment(String text, Account author, Date date) {
        this.text = text;
        this.author = author;
        this.date = date;
    }

    @Override
    public void acceptVisitor(ForumVisitor visitor) {
        visitor.visitComment(this);
        super.acceptVisitor(visitor);
    }


}
