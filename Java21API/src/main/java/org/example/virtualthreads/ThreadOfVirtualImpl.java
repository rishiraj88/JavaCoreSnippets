package org.example.virtualthreads;

import java.util.stream.IntStream;

public class ThreadOfVirtualImpl {
    public static void main(String[] args) throws InterruptedException {
        //not nice to test for >100000 threads in a go
        for(int nThreads=1000;nThreads<100001;nThreads *= 10) {
            System.out.println(spawnVirtualThreads(nThreads));
            System.out.println(spawnPlatformThreads(nThreads));
        }
    }
        public static String spawnVirtualThreads(int nThreads) throws InterruptedException {
        var startTime = System.currentTimeMillis();
        var threadGroup = IntStream.range(0, nThreads).mapToObj(n -> Thread.ofVirtual().unstarted(() -> {
            ;
        })).toList();
        for (Thread thread : threadGroup) {
            thread.start();
            thread.join();
        }
        var endTime = System.currentTimeMillis();
        return String.format("Time taken to spawn %d virtual threads: %d ms", nThreads, endTime - startTime);
    }

    public static String spawnPlatformThreads(int nThreads) throws InterruptedException {
        var startTime = System.currentTimeMillis();
        var threadGroup = IntStream.range(0, nThreads).mapToObj(n -> Thread.ofPlatform().unstarted(() -> {
            ;
        })).toList();
        for (Thread thread : threadGroup) {
            thread.start();
            thread.join();
        }
        var endTime = System.currentTimeMillis();
        return String.format("Time taken to spawn %d platform threads: %d ms", nThreads, endTime - startTime);
    }

}
