package Forum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeNode {
    private TreeNode parent = null;
    private List children = null;
    private Comment comment;

    public TreeNode(Comment comment) {
        this.parent = null;
        this.children = new ArrayList<TreeNode>();
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder(50);
        print(buffer, "", "");
        return buffer.toString();
    }
    private void print(StringBuilder buffer, String prefix, String childrenPrefix){
        buffer.append(prefix);
        //TODO: add author when account is finished
        buffer.append(comment.getText());
        buffer.append('\n');
        for (Iterator<TreeNode> it = children.iterator(); it.hasNext();){
            TreeNode next = it.next();
            if(it.hasNext()){
                next.print(buffer, childrenPrefix + "├──", childrenPrefix +"│   ");
            }else{
                next.print(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
            }
        }
    }

    public void addTreeNode(TreeNode child){
        child.parent = this;
        if(!children.contains(child)){
            this.children.add(child);
        }
    }

}
