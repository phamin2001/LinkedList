package LinkedListDemo;

public class PersonNode {
    private Person person;
    private PersonNode next;

    public PersonNode(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LinkedListDemo.PersonNode getNext() {
        return next;
    }

    public void setNext(LinkedListDemo.PersonNode next) {
        this.next = next;
    }

    public String toString() {
        return person.toString();
    }
}