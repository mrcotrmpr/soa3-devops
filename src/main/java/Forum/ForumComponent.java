package Forum;

import PipeLine.Visitor;

public abstract class ForumComponent {

    public abstract void acceptVisitor(ForumVisitor visitor);
}
