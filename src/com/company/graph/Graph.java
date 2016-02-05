package com.company.graph;

/**
 * Created by mangonob on 16/2/5.
 */

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

public class Graph {
    private int V;
    private int E = 0;
    private Bag<Integer>[] adj;

    private boolean DEBUG = false;

    public boolean debug() {
        return DEBUG;
    }

    public void debug(boolean d) {
        DEBUG = d;
    }

    public Graph(int V) {

        if(debug()) {
            System.out.println("Graph(int V)");
        }

        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }
    public Graph(In in) {
        this(in.readInt());
        int E = in.readInt();
        for (int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v, w);
        }
    }
    public int V() {
        return V;
    }
    public int E() {
        return E;
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }
    public Iterable<Integer> adj(int v) {
        // return all adj-node of node v
        return adj[v];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(V + " vertices, " + E + " edges\n");
        for (int v = 0; v < V; v++){
            sb.append(v).append(": ");
            for (int w : this.adj(v))
                sb.append(w).append(" ");
            sb.append("\n");
        }

        return sb.toString();
    }
}
