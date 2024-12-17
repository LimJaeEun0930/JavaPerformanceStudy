import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //자바의 JVM에서 사용할 수 있는 설정은 크게 두가지로 나뉨. 하나는 속성(Propertiy)값이고, 다른 하나는 환경(Environment). 속성은 JVM에서 지정된 값들 환경은 장비(서버)에 지정되어 있는 값들
        System.setProperty("JavaTuning", "Tune Lee"); //자바 속성에 있는 지정된 key의 값을 value값으로 변환한다. 'Java Tuning"이라는 키를 갖는 시스템속성에 'Tune Lee'라는 값을 지정
        Properties prop = System.getProperties(); // 현재 자바 속성 값들을 받아온다.
        Set key = prop.keySet();
        Iterator it = key.iterator();
        while (it.hasNext()) {
            String curKey = it.next().toString();
            System.out.printf("%s=%s \n", curKey, prop.getProperty(curKey));
        }
    }
}
/* 아래는 실행 결과
* gopherProxySet=false
awt.toolkit=sun.lwawt.macosx.LWCToolkit
java.specification.version=11
sun.cpu.isalist=
sun.jnu.encoding=UTF-8
java.class.path=/Users/imjaeeun/je/프로그래밍/JavaPerformanceStudy/chap2/out/production/chap2
java.vm.vendor=Eclipse Adoptium
sun.arch.data.model=64
java.vendor.url=https://adoptium.net/
user.timezone=
os.name=Mac OS X
java.vm.specification.version=11
sun.java.launcher=SUN_STANDARD
user.country=KR
sun.boot.library.path=/Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home/lib
sun.java.command=Main
http.nonProxyHosts=local|*.local|169.254/16|*.169.254/16|127.0.0.1:21300|*.127.0.0.1:21300
jdk.debug=release
sun.cpu.endian=little
user.home=/Users/imjaeeun
user.language=ko
java.specification.vendor=Oracle Corporation
java.version.date=2024-07-16
java.home=/Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home
file.separator=/
java.vm.compressedOopsMode=Zero based
line.separator=

java.specification.name=Java Platform API Specification
java.vm.specification.vendor=Oracle Corporation
java.awt.graphicsenv=sun.awt.CGraphicsEnvironment
JavaTuning=Tune Lee
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
ftp.nonProxyHosts=local|*.local|169.254/16|*.169.254/16|127.0.0.1:21300|*.127.0.0.1:21300
java.runtime.version=11.0.24+8
user.name=imjaeeun
path.separator=:
os.version=12.5
java.runtime.name=OpenJDK Runtime Environment
file.encoding=UTF-8
java.vm.name=OpenJDK 64-Bit Server VM
java.vendor.version=Temurin-11.0.24+8
java.vendor.url.bug=https://github.com/adoptium/adoptium-support/issues
java.io.tmpdir=/var/folders/nq/pqw879nn4cxgjzkyr0l080h00000gn/T/
java.version=11.0.24
user.dir=/Users/imjaeeun/je/프로그래밍/JavaPerformanceStudy/chap2
os.arch=aarch64
java.vm.specification.name=Java Virtual Machine Specification
java.awt.printerjob=sun.lwawt.macosx.CPrinterJob
sun.os.patch.level=unknown
java.library.path=/Users/imjaeeun/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
java.vm.info=mixed mode
java.vendor=Eclipse Adoptium
java.vm.version=11.0.24+8
java.specification.maintenance.version=2
sun.io.unicode.encoding=UnicodeBig
java.class.version=55.0
socksNonProxyHosts=local|*.local|169.254/16|*.169.254/16|127.0.0.1:21300|*.127.0.0.1:21300

Process finished with exit code 0
* */