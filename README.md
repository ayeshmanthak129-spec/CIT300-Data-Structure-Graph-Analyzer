# CIT300 – Data Structure and Graph Performance Analyzer

## 1. Project Description

The Data Structure and Graph Performance Analyzer is a Java console application developed for the CIT300 Data Structures and Algorithms graded practical assignment. The application demonstrates fundamental data structures, searching algorithms, graph operations, graph traversal, and basic performance comparison.

The project combines individual group members' contributions into an integrated application with a main menu that allows users to access the implemented modules.

## 2. Technologies Used

- Java
- Java Collections Framework
- Git and GitHub
- IntelliJ IDEA
- PowerShell for compilation and execution

## 3. Main Features

1. **Array Operations** – Insert, delete, search, and display array elements.
2. **Stack Operations** – Push, pop, peek, and display stack elements.
3. **Queue Operations** – Enqueue, dequeue, view the front element, and display queue elements.
4. **Linked List Operations** – Insert integer values at the end, delete values, search for values, display the list, and check whether the list is empty.
5. **Searching Algorithms** – Perform linear search and binary search and display search results, step counts, execution times, and complexity information.
6. **Graph Operations** – Add vertices and edges, display the graph, perform Breadth-First Search (BFS) and Depth-First Search (DFS), and count vertices and edges.
7. **Performance Comparison** – Compare linear and binary searching using the implemented performance measurements.
8. **Display All Results** – Display the current contents of the implemented data structures.
9. **Input Validation** – Handle invalid integer input and invalid menu selections in the linked-list module.

## 4. Group Members, Responsibilities, and Contributions

### Member 1 – Group Leader

**Full Name:** Aththanayakage Ayeshmantha Priyashan Kumarasiri
**Student ID:** 22UG3-0399

**Assigned Responsibilities:**
- Array Operations
- Searching Algorithms
- Project Integration

**Individual Contribution:**
- Worked on array operations and searching algorithms.
- Contributed to the main application menu and integration of the data structure modules.
- Contributed to the performance comparison feature and project documentation.
- Coordinated the integration of group members' work into the main application.

### Member 2

**Full Name:** Muhammadu Riyas Muhammadu Fahad
**Student ID:** 22UG3-0436

**Assigned Responsibilities:**
- Stack Operations
- Queue Operations

**Individual Contribution:**
- Worked on the stack module, including push, pop, peek, and display operations.
- Worked on the queue module, including enqueue, dequeue, front-element access, and display operations.
- Contributed the stack and queue modules for integration into the application.

### Member 3

**Full Name:** Gunarathna Wijenayaka Wasala Mudiyanse Ralahamillage Polgaspitiye Udaha Walawwe Chathuri Ayesha Kumari Polgaspitiya
**Student ID:** 22UG3-0811

**Assigned Responsibilities:**
- Linked List Operations

**Individual Contribution:**
- Worked on the linked-list module using nodes and references between nodes.
- Contributed to insertion, deletion, searching, displaying values, and checking whether the list is empty.
- Contributed the linked-list functionality for integration into the application.

### Member 4

**Full Name:** Munas Ahamed Mohamed Ammar
**Student ID:** 22UG3-0141

**Assigned Responsibilities:**
- Graph Operations
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

**Individual Contribution:**
- Worked on graph operations for managing vertices and edges.
- Worked on graph display and graph traversal using BFS and DFS.
- Contributed the graph module for integration into the application.

## 5. Performance Analysis and Time Complexity

The following are the standard expected time complexities for the algorithms and data structures, subject to their specific implementations.

- **Linear Search:** O(n), because elements may need to be checked one by one.
- **Binary Search:** O(log n), when the input data is sorted and the implementation uses repeated halving of the search range.
- **Stack Push and Pop:** Typically O(1).
- **Queue Enqueue and Dequeue:** Typically O(1), depending on the implementation.
- **Linked List Search:** O(n) in the worst case.
- **Linked List Insertion at the End:** O(n) in the current implementation because it traverses the list to find the last node.
- **Linked List Deletion by Value:** O(n) in the worst case.
- **Graph BFS and DFS:** O(V + E) when implemented using an adjacency-list representation, where V is the number of vertices and E is the number of edges.

Execution-time measurements can vary depending on the machine, input data, and runtime conditions. They should not be treated as definitive benchmarks.

## 6. How to Compile and Run

### Requirements

- Install a Java Development Kit (JDK).
- Ensure that `javac` and `java` are available in the system PATH.
- Open PowerShell in the project directory.

### Compilation and Execution

Run the following commands from the project root directory:

```powershell
$files = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
New-Item -ItemType Directory -Force out | Out-Null
javac -d out $files
java -cp out Main
```

After successful compilation, the main menu will appear. Select the required operation by entering its corresponding menu number.

## 7. Testing

The application has been tested for the implemented operations, including array operations, stack operations, queue operations, linked-list operations, graph creation and traversal, searching algorithms, performance comparison, and displaying data structure results.

The linked-list module was tested with integer insertion, display, search, deletion, and empty-state checking. Invalid integer input is handled by requesting a valid integer.

## 8. Version Control and Collaboration

Git and GitHub were used to manage the source code and coordinate group contributions. Separate branches were used for individual work, and the contributed modules were integrated into the main branch.

Repository: https://github.com/ayeshmanthak129-spec/CIT300-Data-Structure-Graph-Analyzer

## 9. Project Structure

The Java source files are organized under the `src` directory. The project includes the main menu, data structure modules, searching algorithms, and graph-related classes.

The `SS` directory contains screenshots documenting selected application operations.
