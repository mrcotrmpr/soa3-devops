import Account.*;
import Backlog.Backlog;
import Notification.*;
import PipeLine.*;
import PipeLine.PipeLineManager;
import Project.Project;
import Sprint.*;
import Exceptions.ChangeSprintStateException;

import java.util.ArrayList;
import java.util.Date;


class main {

    public static void main(String[] args) throws ChangeSprintStateException, InterruptedException {

        // Backlog
        Backlog backlog = new Backlog();

        // Account(s)
        Account scrumMaster = new ScrumMaster("scrumMaster", 1, "email@email.com", "0612345678", "slackUser");
        Account productOwner = new ProductOwner("productOwner", 2, "email@email.com", "0612345678", "slackUser");

        ArrayList<Account> devs = new ArrayList<Account>();
        ArrayList<Account> testers = new ArrayList<Account>();

        // Project
        Project project = new Project(backlog, productOwner, "Project 1");

        // Pipeline
        PipeLineManager manager = new PipeLineManager();
        PipeLine pipeLine = new PipeLine("Name", true);

        Stage stage1 = new Stage("source");
        Command command1 = new Command("source");
        Stage stage2 = new Stage("build");
        Command command2 = new Command("build");
        Stage stage3 = new Stage("test");
        Command command3 = new Command("tests");

        pipeLine.addComponent(stage1);
        stage1.addComponent(command1);
        pipeLine.addComponent(stage2);
        stage2.addComponent(command2);
        pipeLine.addComponent(stage3);
        stage3.addComponent(command3);

        //testSprint.addPipeline(pipeLine);
        //PipeLine test = testSprint.getPipeline();
        //testSprint.pipeLineManager.executePipeLineByName(test.getPipeLineName());

        // Sprint
        Date date = new Date();
        SprintType release = SprintType.Release;
        SprintType review = SprintType.Review;

        Sprint testSprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        INotifier notifier = new SlackNotify();
        Subscriber s = new NotificationService(notifier);
        testSprint.subscribe(productOwner, s);

        // States

        System.out.println(testSprint.getState());

        testSprint.state.changeToInProgressState();
        System.out.println(testSprint.getState());

        testSprint.state.changeToFinishedState();
        System.out.println(testSprint.getState());

        testSprint.state.changeToReleaseCancelledState();
        System.out.println(testSprint.getState());

    }
}