package classes;

public abstract class Employee {

    protected int socialSecurityNumber;
    protected String name;
    protected String email;
    public static int counter;

    public Employee(int socialSecurityNumber, String name, String email) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.email = email;
        counter++;
    }

    public int getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
