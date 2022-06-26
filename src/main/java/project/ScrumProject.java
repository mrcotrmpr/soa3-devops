package project;

import account.Account;
import backlog.Backlog;
import sprint.Sprint;

import java.util.ArrayList;
import java.util.List;

public class ScrumProject implements IProject {

    private final Backlog projectBacklog;
    private Account productOwner;
    private final List<Sprint> sprints;
    private final String name;

    public void setProductOwner(Account productOwner) {
        this.productOwner = productOwner;
    }

    public Backlog getProjectBacklog() {
        return projectBacklog;
    }

    public ScrumProject(String name) {
        this.name = name;
        this.sprints = new ArrayList<>();
        this.projectBacklog = new Backlog();
    }

    public Account getProductOwner() {
        return productOwner;
    }

    public String getName() {
        return name;
    }

    public List<Sprint> getSprints() {
        return sprints;
    }

    public void addSprint(Sprint sprint){
        this.sprints.add(sprint);
    }
}