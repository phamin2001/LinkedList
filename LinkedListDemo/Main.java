package LinkedListDemo;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Amin");
        Person p2 = new Person("Katy");
        Person p3 = new Person("Jack");
        Person p4 = new Person("Allen");
        Person p5 = new Person("Sara");
        Person p6 = new Person("Melody");

        PersonLinkedList list = new PersonLinkedList();
        list.addToFront(p1);
        list.addToFront(p2);
        list.addToFront(p3);
        list.addToFront(p4);
        list.addToFront(p5);
        list.addToFront(p6);

        list.printList();
        System.out.println("");

        Person p7 = new Person("Ryan");
        list.addToEnd(p7);
        list.printList();
        System.out.println("");

        String name = "Ryan";
        System.out.println("Search for: " + name + " in the LinkedList.");
        boolean search = list.searchLinkedList(name);
        if(search) {
            System.out.println("We found it.");
        } else {
            System.out.println("Couldn't find it.");
        }
    }
}