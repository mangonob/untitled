package com.company;

import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.UF;
import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LiftOff implements Runnable {
    static int count = 0;
    final int id = count++;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println(id + ": a ");
        Thread.yield();
    }
}

class LiftOn implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
            System.out.println("b");
        Thread.yield();
    }
}

class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}

public class Main {

    public static void main(String[] args) {
        Integer[] a = new Integer[100];
        for (int i = 0; i < 100; i++) a[i] = StdRandom.uniform(100);
        com.company.Shell.sort(a);
        com.company.Shell.show(a);
        if (com.company.Shell.isSorted(a)) {
            System.out.println("Shell Successed!");
        }
    }
}


























































































