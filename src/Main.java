
import analyzer.ArrayOperations;
import analyzer.QueueOperations;
import analyzer.SearchingOperations;
import analyzer.StackOperations;
import graph.CampusGraph;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ArrayOperations array = new ArrayOperations();
    private static final StackOperations stack = new StackOperations();
    private static final QueueOperations queue = new QueueOperations();
    private static final SearchingOperations searching =
            new SearchingOperations();
    private static final LinkedListOperations linkedList =
            new LinkedListOperations();
    private static final CampusGraph graph = new CampusGraph();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println("\n======================================");
            System.out.println(" DATA STRUCTURE AND GRAPH ANALYZER");
            System.out.println("======================================");

            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Graph Operations");
            System.out.println("6. Searching Algorithms");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = readInt();

            switch (choice) {
                case 1 -> arrayMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> linkedListMenu();
                case 5 -> graphMenu();
                case 6 -> searchingMenu();
                case 7 -> performanceComparisonMenu();
                case 8 -> displayAllResults();
                case 0 -> {
                    running = false;
                    System.out.println("Application closed.");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void arrayMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choice: ");

            switch (readInt()) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    array.insert(readInt());
                }
                case 2 -> {
                    System.out.print("Enter value to delete: ");
                    array.delete(readInt());
                }
                case 3 -> {
                    System.out.print("Enter value to search: ");
                    int value = readInt();
                    int index = array.search(value);
                    System.out.println(index >= 0
                            ? "Found at index: " + index
                            : "Value not found.");
                }
                case 4 -> array.display();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void stackMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choice: ");

            switch (readInt()) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    stack.push(readInt());
                }
                case 2 -> stack.pop();
                case 3 -> {
                    Integer value = stack.peek();
                    if (value != null) {
                        System.out.println("Top value: " + value);
                    }
                }
                case 4 -> stack.display();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void queueMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. View Front");
            System.out.println("4. Display");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choice: ");

            switch (readInt()) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    queue.enqueue(readInt());
                }
                case 2 -> queue.dequeue();
                case 3 -> {
                    Integer value = queue.peekFront();
                    if (value != null) {
                        System.out.println("Front value: " + value);
                    }
                }
                case 4 -> queue.display();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void linkedListMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Search Node");
            System.out.println("4. Display Linked List");
            System.out.println("5. Check if Empty");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choice: ");

            switch (readInt()) {
                case 1 -> {
                    System.out.print("Enter value to insert: ");
                    linkedList.insert(readInt());
                }
                case 2 -> {
                    System.out.print("Enter value to delete: ");
                    linkedList.delete(readInt());
                }
                case 3 -> {
                    System.out.print("Enter value to search: ");
                    linkedList.search(readInt());
                }
                case 4 -> linkedList.display();
                case 5 -> System.out.println(
                        linkedList.isEmpty()
                                ? "Linked List is empty."
                                : "Linked List is not empty.");
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void graphMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. Breadth-First Search (BFS)");
            System.out.println("5. Depth-First Search (DFS)");
            System.out.println("6. Display Vertex and Edge Counts");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choice: ");

            switch (readInt()) {
                case 1 -> {
                    System.out.print("Enter vertex name: ");
                    graph.addVertex(scanner.nextLine().trim());
                }
                case 2 -> {
                    System.out.print("Enter first vertex: ");
                    String first = scanner.nextLine().trim();
                    System.out.print("Enter second vertex: ");
                    String second = scanner.nextLine().trim();
                    graph.addEdge(first, second);
                }
                case 3 -> graph.displayGraph();
                case 4 -> {
                    System.out.print("Starting vertex: ");
                    graph.bfs(scanner.nextLine().trim());
                }
                case 5 -> {
                    System.out.print("Starting vertex: ");
                    graph.dfs(scanner.nextLine().trim());
                }
                case 6 -> {
                    System.out.println(
                            "Vertices: " + graph.getVertexCount());
                    System.out.println(
                            "Edges: " + graph.getEdgeCount());
                }
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void searchingMenu() {
        int[] values = array.getElements();

        if (values.length == 0) {
            System.out.println(
                    "Insert values into the array before searching.");
            return;
        }

        System.out.println("\n--- SEARCHING ALGORITHMS ---");
        System.out.println("Array: " + Arrays.toString(values));
        System.out.print("Enter target value: ");
        int target = readInt();

        long start = System.nanoTime();
        int linearResult = searching.linearSearch(values, target);
        long linearTime = System.nanoTime() - start;

        int[] sortedValues = Arrays.copyOf(values, values.length);
        Arrays.sort(sortedValues);

        start = System.nanoTime();
        int binaryResult =
                searching.binarySearch(sortedValues, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("\n--- SEARCH RESULTS ---");
        System.out.println("Linear Search: "
                + (linearResult >= 0 ? "Found" : "Not found"));
        System.out.println("Linear Search time: "
                + linearTime + " nanoseconds");

        System.out.println("Binary Search: "
                + (binaryResult >= 0 ? "Found" : "Not found"));
        System.out.println("Binary Search time: "
                + binaryTime + " nanoseconds");

        System.out.println("\n--- PERFORMANCE COMPARISON ---");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n), "
                + "assuming sorted input.");

        if (linearTime < binaryTime) {
            System.out.println(
                    "Linear Search took less time in this run.");
        } else if (binaryTime < linearTime) {
            System.out.println(
                    "Binary Search took less time in this run.");
        } else {
            System.out.println(
                    "Both searches took the same measured time.");
        }

        System.out.println(
                "Note: timings vary between runs and are not a benchmark.");
    }

    private static void performanceComparisonMenu() {
        int[] values = array.getElements();

        if (values.length == 0) {
            System.out.println(
                    "Insert values into the array before comparing searches.");
            return;
        }

        System.out.println("\n--- PERFORMANCE COMPARISON ---");
        System.out.println("Array: " + Arrays.toString(values));
        System.out.print("Enter target value: ");

        int target = readInt();

        long start = System.nanoTime();
        int linearResult = searching.linearSearch(values, target);
        long linearTime = System.nanoTime() - start;

        int[] sortedValues = Arrays.copyOf(values, values.length);
        Arrays.sort(sortedValues);

        start = System.nanoTime();
        int binaryResult =
                searching.binarySearch(sortedValues, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("\nAlgorithm          Result       Time (nanoseconds)");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-19s %-12s %d%n",
                "Linear Search",
                linearResult >= 0 ? "Found" : "Not found",
                linearTime);
        System.out.printf("%-19s %-12s %d%n",
                "Binary Search",
                binaryResult >= 0 ? "Found" : "Not found",
                binaryTime);

        System.out.println("\nTime Complexity:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n), using sorted data.");
        System.out.println(
                "Note: Execution times vary between runs.");
    }

    private static void displayAllResults() {
        System.out.println("\n======================================");
        System.out.println("          ALL RESULTS");
        System.out.println("======================================");

        System.out.println("\n--- ARRAY ---");
        array.display();

        System.out.println("\n--- STACK ---");
        stack.display();

        System.out.println("\n--- QUEUE ---");
        queue.display();

        System.out.println("\n--- LINKED LIST ---");
        linkedList.display();

        System.out.println("\n--- GRAPH ---");
        graph.displayGraph();
        System.out.println("Vertices: " + graph.getVertexCount());
        System.out.println("Edges: " + graph.getEdgeCount());
    }

    private static int readInt() {
        while (true) {
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid whole number: ");
            }
        }
    }
}
