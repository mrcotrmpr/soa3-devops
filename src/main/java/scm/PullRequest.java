package scm;

public class PullRequest {

    private final int id;
    private final int branchId;
    private final String title;
    private final String description;

    public PullRequest(int id, int branchId, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.branchId = branchId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getBranchId() {
        return branchId;
    }
}
