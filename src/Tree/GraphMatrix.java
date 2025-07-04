package Tree;

import java.util.Scanner;

public class GraphMatrix {
    private int[][] adjMatrix;
    private int numVertices;

    // Constructor
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Add edge (for undirected graph)
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1; // Remove this for a directed graph
    }

    // Remove edge
//    public void removeEdge(int i, int j) {
//        adjMatrix[i][j] = 0;
//        adjMatrix[j][i] = 0; // Remove this for a directed graph
//    }

    // Print the adjacency matrix
    public void printMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        GraphMatrix graph = new GraphMatrix(vertices);

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        System.out.println("Enter edges (from and to):");
        for (int i = 0; i < edges; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            if (from < 0 || from >= vertices || to < 0 || to >= vertices) {
                System.out.println("Invalid edge! Vertex indices should be between 0 and " + (vertices - 1));
                i--; // retry this edge input
            } else {
                graph.addEdge(from, to);
            }
        }

        graph.printMatrix();
        sc.close();
    }
}
