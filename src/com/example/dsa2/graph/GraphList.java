package com.example.dsa2.graph;

import java.util.LinkedList;

public class GraphList {
    private LinkedList<Integer>[] adj;
    private int vertices;
    private int edges;

    public GraphList(int nodes) {
        this.edges = 0;
        this.vertices = nodes;
        this.adj = new LinkedList[nodes];
        for (int v=0;v<vertices;v++){
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdges(int vertices, int edges){
       adj[vertices].add(edges);
       adj[edges].add(vertices);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(vertices + " vertices, " + edges + " edges" + "\n");
        for (int v=0;v<vertices;v++){
            sb.append(v).append(":");
            for (int w : adj[v]){
                sb.append(w).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GraphList graphList = new GraphList(4);
        graphList.addEdges(0,1);
        graphList.addEdges(1,2);
        graphList.addEdges(2,3);
        graphList.addEdges(3,0);

        System.out.println(graphList);
    }
}
