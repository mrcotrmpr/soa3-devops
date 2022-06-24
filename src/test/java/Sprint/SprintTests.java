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
import static org.testng.AssertJUnit.assertNull;

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
    public void T14_1_sprint_can_be_created_with_review_type(){
        // Arrange
        Sprint reviewSprint = new Sprint(review,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        // Act
        Class<? extends ISprintState> state = reviewSprint.getState();

        // Assert
        assertEquals(state, InitialState.class);
    }

    @Test
    public void T14_2_sprint_can_be_created_with_release_type(){
        // Arrange
        Sprint reviewSprint = new Sprint(release,"Sprint 1", backlog, scrumMaster, productOwner, devs, testers, project, date, date);

        // Act
        Class<? extends ISprintState> state = reviewSprint.getState();

        // Assert
        assertEquals(state, InitialState.class);
    }

}
