package org.example.virtualthreads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorImpl {
    static final int threadCount = 99;

    public static void withVirtualThreadsInJava21() {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, threadCount).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(i);
                    return i;
                });
            });
        }
    }

    public static void withoutVirtualThreads() {
        try (var executor = Executors.newFixedThreadPool(99999)) {
            IntStream.range(0, threadCount).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(i);
                    return i;
                });
            });
        }
    }


}
