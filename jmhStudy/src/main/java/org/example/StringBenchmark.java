package org.example;


import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

// JMH 설정
@BenchmarkMode(Mode.AverageTime)          // 작업당 평균 실행 시간을 측정
@OutputTimeUnit(TimeUnit.MILLISECONDS)   // 결과를 밀리초 단위로 출력
@State(Scope.Thread)                     // 각 스레드가 독립적인 상태를 유지
public class StringBenchmark {

    private static final int ITERATIONS = 10_000; // 문자열 연결 반복 횟수

    // 벤치마크 1: String 사용
    @Benchmark
    public String testStringConcatenation() {
        String result = "";
        for (int i = 0; i < ITERATIONS; i++) {
            result += i;
        }
        return result;
    }

    // 벤치마크 2: StringBuilder 사용
    @Benchmark
    public String testStringBuilder() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            result.append(i);
        }
        return result.toString();
    }
}