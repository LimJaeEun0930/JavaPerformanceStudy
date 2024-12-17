package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;


@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class CompareTimer {
    public static void main(String[] args) {
        CompareTimer timer = new CompareTimer();
        for (int loop = 0; loop < 10; ++loop) {
            timer.timeMakeObjects();
        }
    }

    @Benchmark
    public DummyData timeMakeObjects() {
        HashMap<String, String> map = new HashMap<>(1000000);
        ArrayList<String> list = new ArrayList<>(1000000);
        return new DummyData(map, list);
    }
}
//https://0soo.tistory.com/237
//빌드한 다음 ls target/으로 jar파일 찾고 java -jar target/jmhStudy-1.0-SNAPSHOT.jar 이런식으로 실행하면 됨