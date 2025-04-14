import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Graphs {
    private HashMap<Integer, List<Integer>> graph = new HashMap<>();

    // Adds a vertex to the graph
    public void addVertex(int vertex) {
        if (!graph.containsKey(vertex)) {
            graph.put(vertex, new ArrayList<>()); // Initialize with an empty list
        }
    }

    // Adds an edge between two vertices
    public void addEdge(int vertex1, int vertex2) {
        if (!graph.containsKey(vertex1) || !graph.containsKey(vertex2)) {
            throw new IllegalArgumentException("One or both vertices not found: " + vertex1 + ", " + vertex2);
        }

        // Add edge from vertex1 to vertex2
        List<Integer> edgesFromVertex1 = graph.get(vertex1);
        if (!edgesFromVertex1.contains(vertex2)) {  // Check for existing edge
            edgesFromVertex1.add(vertex2);
        }

        // Uncomment the following block if the graph is undirected
        /*
        List<Integer> edgesFromVertex2 = graph.get(vertex2);
        if (!edgesFromVertex2.contains(vertex1)) {  // Check for existing edge
            edgesFromVertex2.add(vertex1);
        }
        */
    }

    // Optional: method to get the adjacency list of a vertex
    public List<Integer> getEdges(int vertex) {
        return graph.get(vertex);
    }

    public void printGraph() {
        for (int vertex : graph.keySet()) {
            System.out.print(vertex + ": ");
            for (int edge : graph.get(vertex)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graphs g = new Graphs();
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 1);  // Adding more connections to demonstrate its directed nature

        // Attempt to add an edge that includes a non-existing vertex
        try {
            g.addEdge(3, 4);  // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Adding a self-loop
        g.addEdge(1, 1);

        g.printGraph();
    }

}
