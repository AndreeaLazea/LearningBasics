import java.util.HashMap;
import java.util.List;

public class Graphs {
    HashMap<Integer, List<Integer>> graph = new HashMap<>();

    //vertex = node
    public void addVertex(int vertex){
        if(!graph.containsKey(vertex)){
            graph.put(vertex, null);
        }
    }
    //edge = connection between two nodes
    public void addEdge(int vertex1, int vertex2){
        if(graph.containsKey(vertex1) && graph.containsKey(vertex2)){
            List<Integer> edge = graph.get(vertex1);
            edge.add(vertex2);
            graph.put(vertex1, edge);
        }
        else if(!graph.containsKey(vertex1))
            throw new IllegalArgumentException("Vertex not found" + vertex1);
        else if(!graph.containsKey(vertex2))
            throw new IllegalArgumentException("Vertex not found" + vertex2);
        else if(!graph.containsKey(vertex1) && !graph.containsKey(vertex2))
            throw new IllegalArgumentException( "Vertices not found" + vertex1 + " " + vertex2);
    }


}
