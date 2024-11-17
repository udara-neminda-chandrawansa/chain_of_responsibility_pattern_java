public class Main {
    public static void main(String[] args) {
        SupportHandler lvl1 = new Level1Support();
        SupportHandler lvl2 = new Level2Support();
        SupportHandler lvl3 = new Level3Support();

        lvl1.setNextHandler(lvl2);
        lvl2.setNextHandler(lvl3);
        
        lvl1.handleRequest("Lvl 1 issue");
        lvl1.handleRequest("Lvl 2 issue");
        lvl1.handleRequest("Lvl 3 issue");
    }
}

abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue);

}

class Level1Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Lvl 1 issue")) {
            System.out.println("Support Given by lvl 1!");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("No handler available for this issue!");
        }
    }
}

class Level2Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Lvl 2 issue")) {
            System.out.println("Support Given by lvl 2!");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("No handler available for this issue!");
        }
    }
}

class Level3Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Lvl 3 issue")) {
            System.out.println("Support Given by lvl 3!");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("No handler available for this issue!");
        }
    }
}