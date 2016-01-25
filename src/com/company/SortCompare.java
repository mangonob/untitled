package com.company;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by mangonob on 16/1/22.
 */

public class SortCompare {
    public static double time (String alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();

        if(alg.equals("Insertion")) com.company.Insertion.sort(a);
        if(alg.equals("Selection")) com.company.Selection.sort(a);
        if(alg.equals("Shell")) com.company.Shell.sort(a);
        if(alg.equals("Merge")) com.company.Merge.sort(a);

        if(alg.equals("MergeBU")) com.company.MergeBU.sort(a);
        if(alg.equals("InsertionWithSentry")) com.company.InsertionWithSentry.sort(a);


        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;

        Double[] a = new Double[N];
        for (int  t = 0; t < T; t ++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }

        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        StdOut.printf("For %d random Doubles %s is\n", N, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2/t1, alg2);
    }
}
