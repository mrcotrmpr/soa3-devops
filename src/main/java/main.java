import Account.*;
import Backlog.*;
import Forum.DiscussionThread;
import Notification.*;
import PipeLine.*;
import PipeLine.PipeLineManager;
import Project.Project;
import Sprint.*;
import exceptions.ChangeBacklogStateException;
import exceptions.ChangeSprintStateException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class main {

    public static void main(String[] args) throws ChangeSprintStateException, InterruptedException, ChangeBacklogStateException {

        System.out.println("// Backlog\n");

        // Backlog
        BacklogFactory factory = new BacklogFactory();
        Backlog backlog = factory.getBacklog("BACKLOG");

        BacklogItem backlogItem = new BacklogItem("Description", 1,1,1);
        backlog.addBacklogItem(backlogItem);
        List<BacklogItem> items = backlog.getBacklogItems();

        for (BacklogItem item: items) {
            System.out.println(item.description);
        }

        DiscussionThread t = backlogItem.getThread();
        System.out.println(t.getThread());

        INotifier notifier = new SlackNotify();
        Subscriber sub = new NotificationService(notifier);
        t.subscribe(sub);

        backlogItem.addCommentToThread("Hello this is a comment");

        DiscussionThread t2 = backlogItem.getThread();
        System.out.println(t2.getThread());

        backlogItem.addCommentToThread("Hello this is also a comment");

        DiscussionThread t3 = backlogItem.getThread();
        System.out.println(t3.getThread());

        System.out.println(backlogItem.getThread().isActive());

        System.out.println(backlogItem.getState());
        backlogItem.getState().changeToDoingState();
        backlogItem.getState().changeToReadyForTestingState();
        backlogItem.getState().changeToTestingState();
        backlogItem.getState().changeToTestedState();
        backlogItem.getState().changeToDoneState();

        System.out.println(backlogItem.getThread().isActive());

        backlogItem.getState().changeToToDoState();
        System.out.println(backlogItem.getThread().isActive());

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

        INotifier notifier2 = new SlackNotify();
        Subscriber s = new NotificationService(notifier2);
        testSprint.subscribe(productOwner, s);

        // States

        System.out.println("\n// States\n");

        System.out.println(testSprint.getState());

        testSprint.state.changeToInProgressState();
        System.out.println(testSprint.getState());

        testSprint.state.changeToFinishedState();
        System.out.println(testSprint.getState());

        testSprint.state.changeToReleaseCancelledState();
        System.out.println(testSprint.getState());

    }
}