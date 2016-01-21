/**
 * Created by mangonob on 16/1/21.
 */








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
            
        } else {


        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}
























































