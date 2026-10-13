import java.util.Scanner;

public class LinkedListOperations {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head points to the first node
    private Node head;

    // Insert a node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Node inserted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        System.out.println("Node inserted successfully.");
    }

    // Delete the first node containing the given value
    public void delete(int data) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        // If the first node contains the value
        if (head.data == data) {
            head = head.next;
            System.out.println("Node deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null
                && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Node deleted successfully.");
        }
    }

    // Search for a value
    public void search(int data) {
        Node current = head;
        int position = 1;

        while (current != null) {
            if (current.data == data) {
                System.out.println(
                    "Value found at position " + position
                );
                return;
            }

            current = current.next;
            position++;
        }

        System.out.println("Value not found.");
    }

    // Display all nodes
    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node current = head;

        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Read an integer safely
    private static int readInteger(
            Scanner scanner, String message) {

        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input. Please enter an integer."
                );
            }
        }
    }

    // Main menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListOperations list =
                new LinkedListOperations();

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("  LINKED LIST OPERATIONS");
            System.out.println("================================");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Search Node");
            System.out.println("4. Display Linked List");
            System.out.println("5. Check if Empty");
            System.out.println("6. Return / Exit");
            System.out.println("================================");

            choice = readInteger(
                    scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    int insertValue = readInteger(
                            scanner, "Enter value to insert: ");
                    list.insert(insertValue);
                    break;

                case 2:
                    int deleteValue = readInteger(
                            scanner, "Enter value to delete: ");
                    list.delete(deleteValue);
                    break;

                case 3:
                    int searchValue = readInteger(
                            scanner, "Enter value to search: ");
                    list.search(searchValue);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    if (list.isEmpty()) {
                        System.out.println(
                                "Linked List is empty.");
                    } else {
                        System.out.println(
                                "Linked List is not empty.");
                    }
                    break;

                case 6:
                    System.out.println(
                            "Exiting Linked List Operations.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Select 1 to 6.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
