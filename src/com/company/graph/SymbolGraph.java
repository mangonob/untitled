package com.company.graph;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by mangonob on 16/2/15.
 */
public class SymbolGraph {
    private ST<String, Integer> st;
    private String[] keys;
    private Graph G;

    public SymbolGraph(String stream, String sp){
        st = new ST<String, Integer>();
        In in = new In(stream);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(sp);

            for (int i = 0; i < a.length; i++)
            if (!st.contains(a[i]))
                st.put(a[i], st.size());

        }
    }

    public boolean contains(String key) {
        return false;
    }

    public int index(String key){
        return 0;
    }

    public String name(int v){
        return null;
    }

    public Graph G() { return G(); }

    public static void main(String[] args) {
        String filename = args[0];
        String delim = args[1];
        SymbolGraph sg = new SymbolGraph(filename, delim);

        Graph G = sg.G();

        while (StdIn.hasNextLine()) {
            String source = StdIn.readLine();
            for (int w : G.adj(sg.index(source)))
                StdOut.println("   " + sg.name(w));
        }
    }
}
