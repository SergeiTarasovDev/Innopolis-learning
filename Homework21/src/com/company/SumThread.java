package com.company;

public class SumThread extends Thread {
    private int from;
    private int to;
    private int threadNumber;

    public SumThread(int threadNumber, int from, int to) {
        this.threadNumber = threadNumber;
        this.from = from;
        if (to >= Main.array.length) {
            this.to = Main.array.length - 1;
        } else {
            this.to = to;
        }

        System.out.println("   Элементы потока " + threadNumber + ": " + from + " -> " + to);
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            Main.sums[threadNumber] += Main.array[i];
        }


    }
}
