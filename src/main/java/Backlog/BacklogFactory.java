package Backlog;

public class BacklogFactory {

    public Backlog getBacklog(String backlogType){
        if(backlogType == null){
            return null;
        }
        if (backlogType.equalsIgnoreCase("BACKLOG")) {
            return new Backlog();
        }
        return null;
    }

}
