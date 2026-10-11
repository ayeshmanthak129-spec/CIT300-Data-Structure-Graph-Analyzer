
import graph.CampusGraph;

public class GraphTest {

    public static void main(String[] args) {

        CampusGraph graph = new CampusGraph();

        System.out.println("================================");
        System.out.println("       CAMPUS GRAPH TEST");
        System.out.println("================================");

        // 1. Add vertices
        System.out.println("\n--- ADD VERTICES ---");

        graph.addVertex("Gate");
        graph.addVertex("Library");
        graph.addVertex("Cafeteria");
        graph.addVertex("Laboratory");
        graph.addVertex("Lecture Hall");

        // 2. Add edges
        System.out.println("\n--- ADD EDGES ---");

        graph.addEdge("Gate", "Library");
        graph.addEdge("Gate", "Cafeteria");
        graph.addEdge("Library", "Laboratory");
        graph.addEdge("Library", "Lecture Hall");
        graph.addEdge("Cafeteria", "Lecture Hall");

        // 3. Display graph
        System.out.println("\n--- DISPLAY GRAPH ---");
        graph.displayGraph();

        // 4. Search for a vertex
        System.out.println("\n--- SEARCH VERTEX ---");

        String searchVertex = "Library";

        if (graph.containsVertex(searchVertex)) {
            System.out.println(
                    searchVertex + " exists in the graph."
            );
        } else {
            System.out.println(
                    searchVertex + " does not exist."
            );
        }

        // 5. Graph statistics
        System.out.println("\n--- GRAPH STATISTICS ---");

        System.out.println(
                "Total Vertices: " + graph.getVertexCount()
        );

        System.out.println(
                "Total Edges: " + graph.getEdgeCount()
        );

        // 6. BFS traversal
        System.out.println("\n--- BFS TRAVERSAL ---");
        graph.bfs("Gate");

        // 7. DFS traversal
        System.out.println("\n--- DFS TRAVERSAL ---");
        graph.dfs("Gate");

        // 8. Test invalid vertex
        System.out.println("\n--- INVALID VERTEX TEST ---");

        graph.addEdge("Gate", "Unknown Place");
        graph.bfs("Unknown Place");

        // 9. Test duplicate vertex
        System.out.println("\n--- DUPLICATE VERTEX TEST ---");

        graph.addVertex("Gate");

        System.out.println("\n================================");
        System.out.println("        TEST COMPLETED");
        System.out.println("================================");
    }
}
