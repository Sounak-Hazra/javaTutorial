import java.util.*;

class Solution {

    // Define Edge class
    public static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.dest = dest;
            this.src = src;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int v = 5; // number of vertices
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph
        // Edge from 0 to 1 with weight 2
        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(1).add(new Edge(1, 0, 2)); // since undirected

        // Edge from 0 to 2 with weight 4
        graph.get(0).add(new Edge(0, 2, 4));
        graph.get(2).add(new Edge(2, 0, 4));

        // Edge from 1 to 2 with weight 1
        graph.get(1).add(new Edge(1, 2, 1));
        graph.get(2).add(new Edge(2, 1, 1));

        // Edge from 1 to 3 with weight 7
        graph.get(1).add(new Edge(1, 3, 7));
        graph.get(3).add(new Edge(3, 1, 7));

        // Edge from 2 to 4 with weight 3
        graph.get(2).add(new Edge(2, 4, 3));
        graph.get(4).add(new Edge(4, 2, 3));

        // Print the graph
        printGraph(graph);
    }

    // Helper function to print the graph
    public static void printGraph(ArrayList<ArrayList<Edge>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + " => ");
            for (Edge e : graph.get(i)) {
                System.out.print("(" + e.dest + ", w:" + e.weight + ") ");
            }
            System.out.println();
        }
    }
}
