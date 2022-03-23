package Sprint;

import Account.Account;
import Backlog.BacklogItem;
import Project.Project;

import java.util.Date;
import java.util.List;

public interface ISprint {
    List<BacklogItem> getBacklogItems();
    Account getScrumMaster();
    Account getProductOwner();
    List<Account> getDevelopers();
    List<Account> getTesters();
    void addDeveloper(Account account);
    void addTester(Account account);
    Project getProject();
    Date getStartTime();
    Date getEndTime();
    void export(SprintExportFormat sprintExportFormat);
}
