public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String secondName, String firstName, String lastName) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User [secondName=" + secondName + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
