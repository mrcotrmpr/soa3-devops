package account;

public abstract class Account {

    private final String name;
    private final  int employeeNumber;
    private final  String email;
    private final  String phoneNUmber;
    private final  String slackUsername;

    public Account(String name, int employeeNumber, String email, String phoneNUmber, String slackUsername) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.email = email;
        this.phoneNUmber = phoneNUmber;
        this.slackUsername = slackUsername;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public String getSlackUsername() {
        return slackUsername;
    }
}
