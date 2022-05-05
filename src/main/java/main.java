import Account.*;
import Backlog.Backlog;
import Notification.*;
import PipeLine.PipeLine;
import PipeLine.PipeLineManager;
import Project.Project;
import Sprint.*;
import Sprint.States.*;
import exceptions.ChangeSprintStateException;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


class main {

    public static void main(String[] args) throws ChangeSprintStateException {

        Backlog backlog = new Backlog();

        Account scrumMaster = new ScrumMaster("scrumMaster", 1, "email@email.com", "0612345678", "slackUser");
        Account productOwner = new ProductOwner("productOwner", 2, "email@email.com", "0612345678", "slackUser");

        ArrayList<Account> devs = new ArrayList<Account>();
        ArrayList<Account> testers = new ArrayList<Account>();

        Project project = new Project(backlog, productOwner, "Project 1");

        PipeLine pipeLine = new PipeLine("Name");

        Date date = new Date();
        SprintType release = SprintType.Release;
        SprintType review = SprintType.Review;

        Sprint testSprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);
        testSprint.addPipeline(pipeLine);

        System.out.println(testSprint.getState());
        testSprint.state.changeToInProgressState();

        System.out.println(testSprint.getState());


    }
}