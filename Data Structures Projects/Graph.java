import java.io.*;
import java.util.*;
class Graph {
    private int V;   // Number of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
 
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) { //Adds an edge to the graph
        adj[v].add(w);
    }
  
    void BFS(int s) {
        boolean visited[] = new boolean[V];  //Marks all vertices as not visited (automatically set as false)
        LinkedList<Integer> queue = new LinkedList<Integer>(); //BFS queue
        //Mark current node as visited and enqueue
        visited[s]=true;
        queue.add(s);
        while (queue.size() != 0) {
            //Dequeue vertex from queue and print
            s = queue.poll();
            System.out.print(s + "");
            //Find adjacent vertices of vertex that was dequeued, mark visited and enqueue
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String args[]) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.addEdge(1, 3);
        g.addEdge(3, 5);
        System.out.println("Breadth first traversal starting from vertex 0: ");
        g.BFS(0);
    }
}