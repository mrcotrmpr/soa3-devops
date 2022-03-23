package Forum;

import PipeLine.Visitor;

import java.util.ArrayList;

public class ForumCompositeComponent extends ForumComponent {

    private ArrayList<ForumComponent> comments;

    public ForumCompositeComponent()
    {
         comments= new ArrayList<>();
    }

    public void addComment(ForumComponent comp)
    {
        comments.add(comp);
    }

    public ForumComponent getComponent(int i)
    {
        return comments.get(i);
    }

    public int getSize()
    {
        return comments.size();
    }


    @Override
    public void acceptVisitor(ForumVisitor visitor) {

    }
}
