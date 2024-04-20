package com.example.dsa2.graph;

public class Graph {
    private int vertices;
    private int edges;
    int[][] adjMatrix;

    public Graph(int nodes){
        this.vertices = nodes;
        this.edges = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(vertices).append(":Vertices ").append(edges).append(":Edges").append("\n");
        for (int v=0;v<vertices;v++){
            sb.append(v).append(":");
            for (int w : adjMatrix[v]){
                sb.append(w).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addEdge(int vertices, int edges){
        this.adjMatrix[vertices][edges] = 1;
        this.adjMatrix[edges][vertices] = 1;   // for undirected graph.
        edges++;
    }


    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(2,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);

        System.out.println(graph);

    }
}
