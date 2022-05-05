package Backlog;

import Account.Developer;

import java.util.ArrayList;
import java.util.List;

public class BacklogItem {

    public String description;
    public int value;
    public int estimate;
    public int priority;
    public List<Activity> activities;
    public Developer assignedTo;

    public IBacklogItemState state;

    public BacklogItem(String description, int value, int estimate, int priority) {
        this.description = description;
        this.value = value;
        this.estimate = estimate;
        this.priority = priority;
        this.state = new ToDoState(this);
        this.activities = new ArrayList<Activity>();
    }

    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    public Activity getActivity(int index) {
        return activities.get(index);
    }
    public boolean activitiesDone() {
        for (Activity activity : activities) {
            if (!activity.getDone()) {
                return false;
            }
        }
        return true;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setAssignedTo(Developer developer) {
        this.assignedTo = developer;
    }

    public Developer getAssignedTo() {
        return assignedTo;
    }

    public IBacklogItemState getState() {
        return state;
    }

    public void setState(IBacklogItemState state) {
        this.state = state;
    }
    public Class<? extends IBacklogItemState> getCurrentState(){
        return this.state.getClass();
    }
}
