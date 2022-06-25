package Project;

import Account.Account;
import Backlog.Backlog;
import Sprint.Sprint;

import java.util.ArrayList;

public class Project {
    public Backlog projectBacklog;
    public Account productOwner;
    public ArrayList<Sprint> sprints;
    public String name;

    public Project(Backlog projectBacklog, Account productOwner, String name) {
        this.projectBacklog = projectBacklog;
        this.productOwner = productOwner;
        this.sprints = new ArrayList<Sprint>();
        this.name = name;
    }

    public Account getProductOwner() {
        return productOwner;
    }

    public ArrayList<Sprint> getSprints() {
        return sprints;
    }

    public String getName() {
        return name;
    }

    public void addSprint(Sprint sprint){
        this.sprints.add(sprint);
    }
}