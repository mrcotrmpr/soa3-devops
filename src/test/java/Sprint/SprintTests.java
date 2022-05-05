package Sprint;

import Account.*;
import Backlog.Backlog;
import Project.Project;
import Sprint.States.FinishedState;
import Sprint.States.ISprintState;
import Sprint.States.InitialState;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Date;

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

    @Test
    public void testSprintStateStartsAtInitial(){
        // Arrange
        Sprint testSprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        // Act
        Class<? extends ISprintState> state = testSprint.getState();

        // Assert
        assertEquals(state, InitialState.class);

    }

}
