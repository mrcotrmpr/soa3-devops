package Sprint;

import Account.Account;
import Backlog.Backlog;
import Backlog.BacklogItem;
import Notification.Subscriber;
import PipeLine.PipeLine;
import PipeLine.PipeLineManager;
import Project.Project;
import Report.Report;
import Sprint.States.ISprintState;
import Sprint.States.InitialState;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sprint {

    public SprintType type;
    public String name;
    public Backlog backlog;
    public Account scrumMaster;
    public Account productOwner;
    public List<Account> developers;
    public List<Account> testers;
    public Project project;
    public Date startTime;
    public Date endTime;
    public PipeLineManager pipeLineManager;
    public ISprintState state;
    public Report report;

    public Map<Account, Subscriber> subscribers = new HashMap<Account, Subscriber>();

    public Sprint(SprintType type, String name, Backlog backlog, Account scrumMaster, Account productOwner, List<Account> developers, List<Account> testers, Project project, Date startTime, Date endTime) {
        this.type = type;
        this.name = name;
        this.backlog = backlog;
        this.scrumMaster = scrumMaster;
        this.productOwner = productOwner;
        this.developers = developers;
        this.testers = testers;
        this.project = project;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = new InitialState(this);
        this.pipeLineManager = new PipeLineManager();
    }

    public SprintType getType() {
        return this.type;
    }

    public List<BacklogItem> getBacklogItems() {
        return this.backlog.getBacklogItems();
    }

    public Account getScrumMaster() {
        return this.scrumMaster;
    }

    public Account getProductOwner() {
        return this.productOwner;
    }

    public List<Account> getDevelopers() {
        return this.developers;
    }

    public List<Account> getTesters() {
        return this.testers;
    }

    public Project getProject() {
        return this.project;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void addTester(Account account) {
        this.testers.add(account);
    }

    public void addDeveloper(Account account) {
        this.developers.add(account);
    }

    public void setState(ISprintState state) {
        this.state = state;
    }

    public Class<? extends ISprintState> getState(){
        return this.state.getClass();
    }

    public void addPipeline(PipeLine pipeLine) {
        if(this.getType() == SprintType.Release){
            this.pipeLineManager.addNewPipeline(pipeLine);
        }
    }

    public PipeLine getPipeline() {
        return this.pipeLineManager.getPipeline(0);
    }

    public void addReport(Report report) {
        this.report = report;
    }

    public Report getReport() {
        return this.report;
    }

    public void setName(String name) {
        if(checkInitialState()){
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setStartTime(Date startTime) {
        if(checkInitialState()){
            this.startTime = startTime;
        }
    }

    public void setEndTime(Date endTime) {
        if(checkInitialState()){
            this.endTime = endTime;
        }
    }

    private boolean checkInitialState(){
        return this.getState() == InitialState.class;
    }

    public void subscribe(Account account, Subscriber s) {
        this.subscribers.put(account, s);
    }

    public void unsubscribe(Account account) {
        this.subscribers.remove(account);
    }

    public void notifySpecificSubscribers(String accountTypes, String message) {

        for (Map.Entry<Account, Subscriber> entry : subscribers.entrySet()) {
            if(entry.getKey().getClass().getSimpleName().equals(accountTypes)){
                entry.getValue().update(message);
            }
        }
    }

}
