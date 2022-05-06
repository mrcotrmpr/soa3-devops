package Forum;

import java.util.Date;

public class DiscussionThread {

    public TreeNode treeNode;
    private boolean active;

    public DiscussionThread(String name) {
        this.treeNode = new TreeNode(new Comment("New thread: " + name, new Date()));
        this.active = true;
    }

    public void addComment(String comment){
        TreeNode newComment = new TreeNode(new Comment(comment, new Date()));
        this.treeNode.addTreeNode(newComment);
    }

    public String getThread(){
        return this.treeNode.toString();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
