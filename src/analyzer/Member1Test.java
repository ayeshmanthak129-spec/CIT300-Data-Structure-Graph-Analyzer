
package analyzer;

import java.util.Arrays;
import java.util.Scanner;

public class Member1Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations array = new ArrayOperations();
        SearchingOperations searching = new SearchingOperations();

        while (true) {
            System.out.println("\n=== MEMBER 1: ARRAY & SEARCHING ===");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Linear Search");
            System.out.println("5. Binary Search");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Enter a valid number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    if (scanner.hasNextInt()) {
                        array.insert(scanner.nextInt());
                    } else {
                        System.out.println("Invalid number.");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    if (scanner.hasNextInt()) {
                        array.delete(scanner.nextInt());
                    } else {
                        System.out.println("Invalid number.");
                        scanner.next();
                    }
                    break;

                case 3:
                    array.display();
                    break;

                case 4:
                    System.out.print("Enter target: ");
                    if (scanner.hasNextInt()) {
                        searching.linearSearch(
                                array.getElements(), scanner.nextInt());
                    } else {
                        System.out.println("Invalid number.");
                        scanner.next();
                    }
                    break;

                case 5:
                    System.out.print("Enter target: ");
                    if (scanner.hasNextInt()) {
                        searching.binarySearch(
                                array.getElements(), scanner.nextInt());
                    } else {
                        System.out.println("Invalid number.");
                        scanner.next();
                    }
                    break;

                case 6:
                    System.out.println("Member 1 test completed.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
