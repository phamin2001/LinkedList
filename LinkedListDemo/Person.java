package LinkedListDemo;

public class Person {
    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}