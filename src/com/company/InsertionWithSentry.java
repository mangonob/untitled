package com.company;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by mangonob on 16/1/22.
 */
public class InsertionWithSentry {

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i , int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i<a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i=1; i < a.length; i++) {
            if(less(a[i] , a[i-1])) return false;
        }
        return true;
    }

    public static void sort(Comparable[] a){
        int N = a.length;
        Comparable temp = 0;

        if (N >= 1) {
            int min = 0;
            for (int i = 1; i < N; i++) {
                if (less(a[i], a[min])) min = i;
            }

            exch(a, 0, min);
        }

        for ( int i = 1; i < N ; i ++) {
            temp = a[i];

            int j = i;
            for (; less(temp, a[j-1]); j--) {
                a[j] = a[j-1];
            }

            a[j] = temp;
        }

    }
}
