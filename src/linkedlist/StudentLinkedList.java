
package linkedlist;

import java.util.Scanner;

public class StudentLinkedList {

    // Node class
    private static class Node {
        int studentId;
        String studentName;
        Node next;

        Node(int studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.next = null;
        }
    }

    // First node of the linked list
    private Node head;

    // Track the number of students
    private int size = 0;

    // 1. Insert student at the end
    public void insertStudent(int studentId, String studentName) {

        if (searchById(studentId) != null) {
            System.out.println("Error: Student ID already exists.");
            return;
        }

        Node newNode = new Node(studentId, studentName);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
        System.out.println("Student inserted successfully.");
    }

    // 2. Find a student by ID
    private Node searchById(int studentId) {
        Node current = head;

        while (current != null) {
            if (current.studentId == studentId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // 3. Search student
    public void searchStudent(int studentId) {

        Node result = searchById(studentId);

        if (result != null) {
            System.out.println("\nStudent Found!");
            System.out.println("Student ID   : " + result.studentId);
            System.out.println("Student Name : " + result.studentName);
        } else {
            System.out.println("Student not found.");
        }
    }

    // 4. Delete student by ID
    public void deleteStudent(int studentId) {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        // If the first node is the target
        if (head.studentId == studentId) {
            head = head.next;
            size--;

            System.out.println("Student deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.studentId == studentId) {
                current.next = current.next.next;
                size--;

                System.out.println("Student deleted successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }

    // 5. Display all students
    public void displayStudents() {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node current = head;

        System.out.println("\n========== STUDENT LIST ==========");

        while (current != null) {
            System.out.println(
                    "ID: " + current.studentId
                            + " | Name: " + current.studentName
            );

            current = current.next;
        }

        System.out.println("==================================");
        System.out.println("Total Students: " + size);
    }

    // 6. Return the number of students
    public int getSize() {
        return size;
    }

    // Menu
    public void showMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n==================================");
            System.out.println("    STUDENT LINKED LIST SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Total Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {

                case "1":
                    try {
                        System.out.print("Enter Student ID: ");
                        int id = Integer.parseInt(
                                scanner.nextLine().trim()
                        );

                        if (id <= 0) {
                            System.out.println(
                                    "Student ID must be positive."
                            );
                            break;
                        }

                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine().trim();

                        if (name.isEmpty()) {
                            System.out.println(
                                    "Student name cannot be empty."
                            );
                            break;
                        }

                        insertStudent(id, name);

                    } catch (NumberFormatException e) {
                        System.out.println(
                                "Invalid ID. Please enter a number."
                        );
                    }
                    break;

                case "2":
                    try {
                        System.out.print(
                                "Enter Student ID to delete: "
                        );

                        int deleteId = Integer.parseInt(
                                scanner.nextLine().trim()
                        );

                        deleteStudent(deleteId);

                    } catch (NumberFormatException e) {
                        System.out.println(
                                "Invalid ID. Please enter a number."
                        );
                    }
                    break;

                case "3":
                    try {
                        System.out.print(
                                "Enter Student ID to search: "
                        );

                        int searchId = Integer.parseInt(
                                scanner.nextLine().trim()
                        );

                        searchStudent(searchId);

                    } catch (NumberFormatException e) {
                        System.out.println(
                                "Invalid ID. Please enter a number."
                        );
                    }
                    break;

                case "4":
                    displayStudents();
                    break;

                case "5":
                    System.out.println(
                            "Total Students: " + getSize()
                    );
                    break;

                case "6":
                    running = false;
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Enter 1 to 6."
                    );
            }
        }

        scanner.close();
    }

    // Main method for standalone testing
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();
        list.showMenu();
    }
}
