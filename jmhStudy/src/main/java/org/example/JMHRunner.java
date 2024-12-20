package org.example;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class JMHRunner {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(StringBenchmark.class.getSimpleName()) // 실행할 벤치마크 클래스
                .warmupIterations(3)                           // 워밍업 반복 횟수
                .measurementIterations(5)                      // 측정 반복 횟수
                .forks(1)                                      // JVM 프로세스 수
                .build();

        new Runner(opt).run(); // 벤치마크 실행
    }
}
