package SCM;

import java.util.ArrayList;

public class PullRequest {

    private final int id;
    private int title;
    private String description;
    private ArrayList<Commit> commitList;

    public PullRequest(int id, int title, String description, ArrayList<Commit> commitList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.commitList = commitList;
    }

    public int getId() {
        return id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Commit> getCommitList() {
        return commitList;
    }

    public void setCommitList(ArrayList<Commit> commitList) {
        this.commitList = commitList;
    }
}
