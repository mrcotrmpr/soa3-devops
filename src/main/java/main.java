import Account.*;
import Backlog.Backlog;
import Notification.*;
import PipeLine.PipeLineManager;
import Project.Project;
import Sprint.Sprint;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


class main {

    public static void main(String[] args) {

        Backlog backlog = new Backlog();

        Account scrumMaster = new ScrumMaster("scrumMaster", 1, "email@email.com", "0612345678", "slackUser");
        Account productOwner = new ProductOwner("productOwner", 2, "email@email.com", "0612345678", "slackUser");

        ArrayList<Account> devs = new ArrayList<Account>();
        ArrayList<Account> testers = new ArrayList<Account>();

        Project project = new Project(backlog, productOwner, "Project 1");

        Date date = new Date();
        Sprint testSprint = new Sprint(backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        System.out.println(testSprint.getState());

    }
}