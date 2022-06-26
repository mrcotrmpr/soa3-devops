package account;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AccountTests {

    @Test
    public void T0_developer_account_is_created_successfully() {
        // Arrange
        Account account = new Developer("name", 1, "mail", "06", "slack");

        // Act
        String name = account.getName();
        int employeeNumber = account.getEmployeeNumber();
        String mail = account.getEmail();
        String phoneNumber = account.getPhoneNUmber();
        String slackUsername = account.getSlackUsername();

        // Assert
        assertEquals("name", name);
        assertEquals(1, employeeNumber);
        assertEquals("mail", mail);
        assertEquals("06", phoneNumber);
        assertEquals("slack", slackUsername);
    }

    @Test
    public void T0_lead_developer_account_is_created_successfully() {
        // Arrange
        Account account = new LeadDeveloper("name", 1, "mail", "06", "slack");

        // Act
        String name = account.getName();
        int employeeNumber = account.getEmployeeNumber();
        String mail = account.getEmail();
        String phoneNumber = account.getPhoneNUmber();
        String slackUsername = account.getSlackUsername();

        // Assert
        assertEquals("name", name);
        assertEquals(1, employeeNumber);
        assertEquals("mail", mail);
        assertEquals("06", phoneNumber);
        assertEquals("slack", slackUsername);
    }

    @Test
    public void T0_product_owner_account_is_created_successfully() {
        // Arrange
        Account account = new ProductOwner("name", 1, "mail", "06", "slack");

        // Act
        String name = account.getName();
        int employeeNumber = account.getEmployeeNumber();
        String mail = account.getEmail();
        String phoneNumber = account.getPhoneNUmber();
        String slackUsername = account.getSlackUsername();

        // Assert
        assertEquals("name", name);
        assertEquals(1, employeeNumber);
        assertEquals("mail", mail);
        assertEquals("06", phoneNumber);
        assertEquals("slack", slackUsername);
    }

    @Test
    public void T0_scrum_master_account_is_created_successfully() {
        // Arrange
        Account account = new ScrumMaster("name", 1, "mail", "06", "slack");

        // Act
        String name = account.getName();
        int employeeNumber = account.getEmployeeNumber();
        String mail = account.getEmail();
        String phoneNumber = account.getPhoneNUmber();
        String slackUsername = account.getSlackUsername();

        // Assert
        assertEquals("name", name);
        assertEquals(1, employeeNumber);
        assertEquals("mail", mail);
        assertEquals("06", phoneNumber);
        assertEquals("slack", slackUsername);
    }

    @Test
    public void T0_tester_account_is_created_successfully() {
        // Arrange
        Account account = new Tester("name", 1, "mail", "06", "slack");

        // Act
        String name = account.getName();
        int employeeNumber = account.getEmployeeNumber();
        String mail = account.getEmail();
        String phoneNumber = account.getPhoneNUmber();
        String slackUsername = account.getSlackUsername();

        // Assert
        assertEquals("name", name);
        assertEquals(1, employeeNumber);
        assertEquals("mail", mail);
        assertEquals("06", phoneNumber);
        assertEquals("slack", slackUsername);
    }

}
