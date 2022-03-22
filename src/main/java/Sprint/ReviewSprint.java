package Sprint;

import Account.Account;
import Backlog.BacklogItem;
import Project.Project;

import java.util.Date;
import java.util.List;

public class ReviewSprint implements ISprint{

    public List<BacklogItem> backlogItems;
    public Account scrumMaster;
    public Account productOwner;
    public List<Account> developers;
    public List<Account> testers;
    public Project project;
    public Date startTime;
    public Date endTime;
    public IExportBehavior exportBehavior;

    public ReviewSprint(List<BacklogItem> backlogItems, Account scrumMaster, Account productOwner, List<Account> developers, List<Account> testers, Project project, Date startTime, Date endTime, IExportBehavior exportBehavior) {
        this.backlogItems = backlogItems;
        this.scrumMaster = scrumMaster;
        this.productOwner = productOwner;
        this.developers = developers;
        this.testers = testers;
        this.project = project;
        this.startTime = startTime;
        this.endTime = endTime;
        this.exportBehavior = exportBehavior;
    }

    @Override
    public List<BacklogItem> getBacklogItems() {
        return this.backlogItems;
    }

    @Override
    public Account getScrumMaster() {
        return this.scrumMaster;
    }

    @Override
    public Account getProductOwner() {
        return this.productOwner;
    }

    @Override
    public List<Account> getDevelopers() {
        return this.developers;
    }

    @Override
    public List<Account> getTesters() {
        return this.testers;
    }

    @Override
    public Project getProject() {
        return this.project;
    }

    @Override
    public Date getStartTime() {
        return this.startTime;
    }

    @Override
    public Date getEndTime() {
        return this.endTime;
    }

    @Override
    public void addTester(Account account) {
        this.testers.add(account);
    }

    @Override
    public void addDeveloper(Account account) {
        this.developers.add(account);
    }

    @Override
    public void export(SprintExportFormat sprintExportFormat) {
        this.exportBehavior.export(sprintExportFormat);
    }
}
