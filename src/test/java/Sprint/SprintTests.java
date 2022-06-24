package Sprint;

import Account.*;
import Backlog.Backlog;
import Notification.INotifier;
import Notification.NotificationService;
import Notification.SlackNotify;
import Notification.Subscriber;
import Project.Project;
import Report.Report;
import Sprint.States.*;
import exceptions.ChangeSprintStateException;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Date;

import nl.altindag.console.ConsoleCaptor;
import static org.testng.AssertJUnit.assertEquals;

public class SprintTests {

    SprintType release = SprintType.Release;
    SprintType review = SprintType.Review;
    Backlog backlog = new Backlog();
    Account scrumMaster = new ScrumMaster("testScrumMaster", 1, "test@email.com", "0612345678", "testUser");
    Account productOwner = new ProductOwner("testProductOwner", 2, "test@email.com", "0612345678", "testUser");
    ArrayList<Account> devs = new ArrayList<Account>();
    ArrayList<Account> testers = new ArrayList<Account>();
    Project project = new Project(backlog, productOwner, "Project 1");
    Date date = new Date();
    ConsoleCaptor consoleCaptor = new ConsoleCaptor();

    @Test
    public void T14_15_1_sprint_can_be_created_with_review_type(){
        // Arrange
        Sprint reviewSprint = new Sprint(review,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        // Act
        ISprintState state = reviewSprint.getState();

        // Assert
        assertEquals(state.getClass(), InitialState.class);
    }

    @Test
    public void T14_15_2_sprint_can_be_created_with_release_type(){
        // Arrange
        Sprint reviewSprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        // Act
        ISprintState state = reviewSprint.getState();

        // Assert
        assertEquals(state.getClass(), InitialState.class);
    }

    @Test
    public void T16_1_sprint_state_can_be_altered_correctly_to_reviewed() throws ChangeSprintStateException {
        // Arrange
        Sprint sprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);
        Report report = new Report();
        sprint.addReport(report);

        // Act
        ISprintState initialState = sprint.getState();

        sprint.getState().changeToInProgressState();
        ISprintState inProgressState = sprint.getState();

        sprint.getState().changeToFinishedState();
        ISprintState finishedState = sprint.getState();

        sprint.getState().changeToReviewedState();
        ISprintState reviewedState = sprint.getState();

        // Assert
        assertEquals(initialState.getClass(), InitialState.class);
        assertEquals(inProgressState.getClass(), InProgressState.class);
        assertEquals(finishedState.getClass(), FinishedState.class);
        assertEquals(reviewedState.getClass(), ReviewedState.class);
    }

    @Test
    public void T16_2_sprint_state_can_be_altered_correctly_to_releaseError_and_releaseCancelled() throws ChangeSprintStateException, InterruptedException {
        // Arrange
        Sprint sprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        // Act
        ISprintState initialState = sprint.getState();

        sprint.getState().changeToInProgressState();
        ISprintState inProgressState = sprint.getState();

        sprint.getState().changeToFinishedState();
        ISprintState finishedState = sprint.getState();

        sprint.getState().changeToReleasingState();
        ISprintState releasingState = sprint.getState();

        sprint.getState().changeToReleaseErrorState();
        ISprintState releasingErrorState = sprint.getState();

        sprint.getState().changeToReleaseCancelledState();
        ISprintState releaseCancelledState = sprint.getState();

        // Assert
        assertEquals(initialState.getClass(), InitialState.class);
        assertEquals(inProgressState.getClass(), InProgressState.class);
        assertEquals(finishedState.getClass(), FinishedState.class);
        assertEquals(releasingState.getClass(), ReleasingState.class);
        assertEquals(releasingErrorState.getClass(), ReleaseErrorState.class);
        assertEquals(releaseCancelledState.getClass(), ReleaseCancelledState.class);
    }

    @Test
    public void T16_3_sprint_state_can_be_altered_correctly_to_releaseSuccess() throws ChangeSprintStateException, InterruptedException {
        // Arrange
        Sprint sprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        // Act
        ISprintState initialState = sprint.getState();

        sprint.getState().changeToInProgressState();
        ISprintState inProgressState = sprint.getState();

        sprint.getState().changeToFinishedState();
        ISprintState finishedState = sprint.getState();

        sprint.getState().changeToReleasingState();
        ISprintState releasingState = sprint.getState();

        sprint.getState().changeToReleaseSuccessState();
        ISprintState releaseSuccessState = sprint.getState();

        // Assert
        assertEquals(initialState.getClass(), InitialState.class);
        assertEquals(inProgressState.getClass(), InProgressState.class);
        assertEquals(finishedState.getClass(), FinishedState.class);
        assertEquals(releasingState.getClass(), ReleasingState.class);
        assertEquals(releaseSuccessState.getClass(), ReleaseSuccessState.class);
    }

    @Test
    public void T17_1_sprint_data_can_be_altered_in_initial_state(){
        // Arrange
        Sprint sprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);
        Date newDate = new Date();

        // Act
        ISprintState state = sprint.getState();
        String initialName = sprint.getName();
        Date initialStartTime = sprint.getStartTime();
        Date initialEndTime = sprint.getEndTime();

        sprint.setName("New name");
        sprint.setStartTime(newDate);
        sprint.setEndTime(newDate);

        // Assert
        assertEquals(state.getClass(), InitialState.class);
        assertEquals(initialName, "Sprint 1");
        assertEquals(initialStartTime, date);
        assertEquals(initialEndTime, date);
        assertEquals(sprint.getName(), "New name");
        assertEquals(sprint.getStartTime(), newDate);
        assertEquals(sprint.getEndTime(), newDate);
    }

    @Test
    public void T17_2_sprint_data_can_not_be_altered_in_inProgress_state() throws ChangeSprintStateException {
        // Arrange
        Sprint sprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);
        Date newDate = new Date();

        // Act
        sprint.getState().changeToInProgressState();
        ISprintState state = sprint.getState();
        String initialName = sprint.getName();
        Date initialStartTime = sprint.getStartTime();
        Date initialEndTime = sprint.getEndTime();

        sprint.setName("New name");
        sprint.setStartTime(newDate);
        sprint.setEndTime(newDate);

        // Assert
        assertEquals(state.getClass(), InProgressState.class);
        assertEquals(initialName, "Sprint 1");
        assertEquals(initialStartTime, date);
        assertEquals(initialEndTime, date);
        assertEquals(sprint.getName(), "Sprint 1");
        assertEquals(sprint.getStartTime(), date);
        assertEquals(sprint.getEndTime(), date);
    }

    @Test
    public void T18_1_sprint_release_cancelled_sends_notification() throws ChangeSprintStateException, InterruptedException {
        // Arrange
        Sprint sprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        INotifier notifier = new SlackNotify();
        Subscriber sub = new NotificationService(notifier);
        sprint.subscribe(scrumMaster, sub);
        sprint.subscribe(productOwner, sub);

        // Act
        sprint.getState().changeToInProgressState();
        sprint.getState().changeToFinishedState();
        sprint.getState().changeToReleasingState();
        sprint.getState().changeToReleaseErrorState();
        sprint.getState().changeToReleaseCancelledState();

        // Assert
        assert(consoleCaptor.getStandardOutput()).contains("Sent Slack message: Sprint release has been cancelled");
        consoleCaptor.clearOutput();
    }


}
