package Project;

import Account.*;
import Backlog.Backlog;
import Sprint.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.testng.AssertJUnit.assertEquals;

public class ProjectTests {

    Backlog sprintBacklog = new Backlog();
    Account productOwner = new ProductOwner("Name", 1, "email", "06", "bestPO");
    Account scrumMaster = new ScrumMaster("Name", 1, "email", "06", "bestSM");

    @Test
    public void T_1_1_project_is_created_with_valid_data(){
        // Arrange
        Project project = new Project(sprintBacklog, productOwner, "FirstProject");

        //Act
        Account productOwner = project.getProductOwner();
        String name = project.getName();

        //Assert
        assertEquals(name, "FirstProject");
        assertEquals(productOwner.name, "Name");
    }

    @Test
    public void T_1_2_project_is_created_with_empty_list_of_sprints(){
        // Arrange
        Project project = new Project(sprintBacklog, productOwner, "SecondProject");

        //Act
        int length = project.getSprints().size();

        //Assert
        assertEquals(length, 0);
    }

    @Test
    public void T_1_3_sprint_can_be_added_to_project(){
        // Arrange
        Project project = new Project(sprintBacklog, productOwner, "ThirdProject");
        Sprint newSprint = new Sprint(SprintType.Release,"Sprint 1", sprintBacklog, scrumMaster,
                productOwner, new ArrayList<>(), new ArrayList<>(), project, new Date(), new Date());

        //Act
        int initialLength = project.getSprints().size();
        project.addSprint(newSprint);
        int newLength = project.getSprints().size();

        //Assert
        assertEquals(initialLength, 0);
        assertEquals(newLength, 1);
    }

}
