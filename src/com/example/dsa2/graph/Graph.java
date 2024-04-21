package com.example.dsa2.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    static class Edge{
        int src;
        int des;

        public Edge(int src,int des){
            this.src = src;
            this.des = des;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[0].add(new Edge(1,0));
        graph[0].add(new Edge(1,3));

        graph[0].add(new Edge(2,0));
        graph[0].add(new Edge(2,4));

        graph[0].add(new Edge(3,1));
        graph[0].add(new Edge(3,4));
        graph[0].add(new Edge(3,5));

        graph[0].add(new Edge(4,2));
        graph[0].add(new Edge(4,3));
        graph[0].add(new Edge(4,5));

        graph[0].add(new Edge(5,3));
        graph[0].add(new Edge(5,4));
        graph[0].add(new Edge(5,6));

        graph[0].add(new Edge(6,5));

    }

    public static void bfs(ArrayList<Edge> graph[],int V,boolean[] visited,int start ) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()){
            int current = queue.remove();
            if ((visited[current] == false)){
                System.out.print(current + " ");
                visited[current] = true;

                for (int i=0;i<graph[current].size();i++){
                    Edge e = graph[current].get(i);
                    queue.add(e.des);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[],int current, boolean[] visited){
        System.out.print(current + " ");
        visited[current] = true;

        for (int i = 0;i<graph[current].size();i++){
            Edge edge = graph[current].get(i);
            if(visited[edge.des] == false) {
                dfs(graph, edge.des, visited);
            }
        }
    }

    //O(V^V)
    public static void printAllPath(ArrayList<Edge> graph[], boolean[] visited,int current ,String path, int target){
        if(current == target){
            System.out.println(path);
            return;
        }
        for (int i=0;i<graph[current].size();i++){
            Edge edge = graph[current].get(i);
            if(!visited[edge.des]){
                visited[current] = true;
                printAllPath(graph,visited,edge.des,path+edge.des,target);
                visited[current] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];

        /*for (int i=0;i<V;i++){
            if(visited[i] == false){
                bfs(graph,V,visited,i);
            }
        }*/

        /*for (int i=0;i<V;i++){
            if(visited[i] == false){
                dfs(graph,i,visited);
            }
        }*/

        //System.out.println();

        int src = 0, tar = 5;
        printAllPath(graph,visited,src,"0",tar);


    }
}
