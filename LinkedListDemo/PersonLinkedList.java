package LinkedListDemo;

public class PersonLinkedList {

    private PersonNode head;

    public void addToFront(Person person) {
        PersonNode node = new PersonNode(person);
        node.setNext(head);
        head = node;
    }

    public void addToEnd(Person person) {
        PersonNode node = new PersonNode(person);

        // want to insert node at the end of linkedlit
        // so, we need to traverse a linkedlis till reach end of it
        PersonNode current = head;
        PersonNode temp = current;

        while(current != null) {
            temp = current;
            current = current.getNext();
        }

        current = temp;
        current.setNext(node);
        node.setNext(null);
    }

    public boolean searchLinkedList(String name) {
        PersonNode current = head;

        while (current != null) {
            if(current.getPerson().getFirstName().equals(name)) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void printList() {
        PersonNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}