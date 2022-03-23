package Project;

import Account.Account;
import Backlog.Backlog;
import Sprint.ISprint;

import java.util.ArrayList;

public class Project {
    public Backlog projectBacklog;
//    public Forum forum
    public Account productOwner;
    public ArrayList<ISprint> sprints;
    public String name;

    public Project(Backlog projectBacklog, Account productOwner, String name) {
        this.projectBacklog = projectBacklog;
        this.productOwner = productOwner;
        this.sprints = new ArrayList<ISprint>();
        this.name = name;
    }

    public Account getProductOwner() {
        return productOwner;
    }

    public ArrayList<ISprint> getSprints() {
        return sprints;
    }

    public String getName() {
        return name;
    }
    public void addSprints(ISprint sprint){
        this.sprints.add(sprint);
    }
}