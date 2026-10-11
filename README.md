# CIT300 – Data Structure and Graph Performance Analyzer

## Project Description

The Data Structure and Graph Performance Analyzer is a Java console application developed for the CIT300 Data Structures and Algorithms graded practical assignment. It demonstrates common data structures, searching algorithms, graph traversal, and basic performance comparison.

## Technologies Used

- Java
- Java Collections Framework
- Git and GitHub
- IntelliJ IDEA

## Features

1. **Array Operations** – Insert, delete, search, and display elements.
2. **Stack Operations** – Push, pop, peek, and display elements.
3. **Queue Operations** – Enqueue, dequeue, view the front element, and display elements.
4. **Linked List Operations** – Insert, search, delete, display student records, and count students.
5. **Searching Algorithms** – Linear search and binary search, with results, steps, execution times, and complexity information.
6. **Graph Operations** – Add vertices and edges, display the graph, perform BFS and DFS, and count vertices and edges.
7. **Performance Comparison** – Compare linear and binary search results and execution times.
8. **Display All Results** – Display the current contents of the implemented data structures.

## Group Members and Responsibilities

| Member | Student ID | Assigned Responsibility |
|---|---|---|
| A.A.P. Kumarasiri | 22UG3-0399 | Group Leader, Array Operations, Searching Algorithms, and Integration |
| M R M FAHAD | 22UG3-0436 | Stack and Queue Operations |
| G.W.W.M.R.P.U.W.C.A.K Polgaspitiya | 22UG3-0811 | Linked List Operations |
| M.A.M AMMAR | 22UG3-0141 | Graph Operations, BFS, and DFS |

## Performance Analysis

- Linear Search: O(n)
- Binary Search: O(log n), when the input is sorted.
- Stack push and pop: typically O(1).
- Queue enqueue and dequeue: typically O(1), depending on the implementation.
- Graph traversal using BFS and DFS: O(V + E), using an adjacency-list representation.

Execution-time measurements may vary between runs and should not be treated as definitive benchmarks.

## How to Compile and Run

Open PowerShell in the project directory and run:

```powershell
$files = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
New-Item -ItemType Directory -Force out | Out-Null
javac -d out $files
java -cp out Main
```

## Testing

The application has been tested for array insertion, stack operations, queue operations, linked list operations, graph creation, BFS, DFS, searching, performance comparison, and displaying current results.

## Repository

GitHub: https://github.com/ayeshmanthak129-spec/CIT300-Data-Structure-Graph-Analyzer.git