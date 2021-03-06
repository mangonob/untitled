package com.company.others; /**
 * Created by mangonob on 16/1/21.
 */


import edu.princeton.cs.algs4.*;

public class UF {
    private int[] id;
    private int[] sz;
    private int count;

    public UF(int N) {
        id = new int[N];
        sz = new int[N];
        count = N;

        for (int i = 0; i < N ; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        while(id[p] != p) p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if(i == j) return;

        if(sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }

        count--;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public static void main(String... args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            //StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}




























































