
package graph;

import java.util.*;

public class CampusGraph {

    private final Map<String, Set<String>> adjacencyList;

    public CampusGraph() {
        adjacencyList = new LinkedHashMap<>();
    }

    // 1. Add a vertex
    public boolean addVertex(String vertex) {
        if (!isValidVertex(vertex)) {
            System.out.println("Error: Vertex name cannot be empty.");
            return false;
        }

        if (adjacencyList.containsKey(vertex)) {
            System.out.println("Vertex already exists: " + vertex);
            return false;
        }

        adjacencyList.put(vertex, new LinkedHashSet<>());
        System.out.println("Vertex added: " + vertex);
        return true;
    }

    // 2. Add an undirected edge
    public boolean addEdge(String vertex1, String vertex2) {
        if (!isValidVertex(vertex1) || !isValidVertex(vertex2)) {
            System.out.println("Error: Invalid vertex name.");
            return false;
        }

        if (!adjacencyList.containsKey(vertex1)) {
            System.out.println("Error: Vertex not found: " + vertex1);
            return false;
        }

        if (!adjacencyList.containsKey(vertex2)) {
            System.out.println("Error: Vertex not found: " + vertex2);
            return false;
        }

        if (vertex1.equals(vertex2)) {
            System.out.println("Error: Self-loops are not allowed.");
            return false;
        }

        if (adjacencyList.get(vertex1).contains(vertex2)) {
            System.out.println("Edge already exists: "
                    + vertex1 + " - " + vertex2);
            return false;
        }

        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);

        System.out.println("Edge added: " + vertex1 + " - " + vertex2);
        return true;
    }

    // 3. Display the graph
    public void displayGraph() {
        if (adjacencyList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }

        for (Map.Entry<String, Set<String>> entry
                : adjacencyList.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }

    // 4. Check whether a vertex exists
    public boolean containsVertex(String vertex) {
        return isValidVertex(vertex)
                && adjacencyList.containsKey(vertex);
    }

    // 5. Get the total number of vertices
    public int getVertexCount() {
        return adjacencyList.size();
    }

    // 6. Get the total number of undirected edges
    public int getEdgeCount() {
        int total = 0;

        for (Set<String> neighbours : adjacencyList.values()) {
            total += neighbours.size();
        }

        return total / 2;
    }

    // 7. Breadth-First Search (BFS)
    public List<String> bfs(String startVertex) {
        List<String> traversalOrder = new ArrayList<>();

        if (!containsVertex(startVertex)) {
            System.out.println(
                    "Error: Starting vertex not found: " + startVertex
            );
            return traversalOrder;
        }

        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(startVertex);
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            traversalOrder.add(current);

            for (String neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.offer(neighbour);
                }
            }
        }

        System.out.println("BFS Traversal: " + traversalOrder);
        return traversalOrder;
    }

    // 8. Depth-First Search (DFS)
    public List<String> dfs(String startVertex) {
        List<String> traversalOrder = new ArrayList<>();

        if (!containsVertex(startVertex)) {
            System.out.println(
                    "Error: Starting vertex not found: " + startVertex
            );
            return traversalOrder;
        }

        Set<String> visited = new LinkedHashSet<>();

        dfsRecursive(startVertex, visited, traversalOrder);

        System.out.println("DFS Traversal: " + traversalOrder);
        return traversalOrder;
    }

    // Recursive helper method for DFS
    private void dfsRecursive(
            String vertex,
            Set<String> visited,
            List<String> traversalOrder) {

        visited.add(vertex);
        traversalOrder.add(vertex);

        for (String neighbour : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbour)) {
                dfsRecursive(neighbour, visited, traversalOrder);
            }
        }
    }

    // 9. Validate a vertex name
    private boolean isValidVertex(String vertex) {
        return vertex != null && !vertex.trim().isEmpty();
    }
}
