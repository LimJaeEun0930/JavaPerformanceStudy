import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();
        Set<String> key = envMap.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()) {
            String curKey = it.next().toString();
            System.out.format("%s = %s\n", curKey, envMap.get(curKey));
        }
    }
}
/*
실행결과
MANPATH = /opt/homebrew/share/man::
CONDA_DEFAULT_ENV = base
CONDA_EXE = /Users/imjaeeun/opt/anaconda3/bin/conda
JAVA_HOME = /Users/imjaeeun/.sdkman/candidates/java/current
RBENV_SHELL = zsh
CONDA_PYTHON_EXE = /Users/imjaeeun/opt/anaconda3/bin/python
HOMEBREW_PREFIX = /opt/homebrew
COMMAND_MODE = unix2003
CONDA_PREFIX = /Users/imjaeeun/opt/anaconda3
_CE_M =
JAVA_MAIN_CLASS_95952 = Main
SDKMAN_DIR = /Users/imjaeeun/.sdkman
LOGNAME = imjaeeun
HOMEBREW_REPOSITORY = /opt/homebrew
PWD = /Users/imjaeeun/je/프로그래밍/JavaPerformanceStudy/chap2
XPC_SERVICE_NAME = application.com.jetbrains.intellij.13433184.13433910
CONDA_SHLVL = 1
INFOPATH = /opt/homebrew/share/info:
SDKMAN_CANDIDATES_DIR = /Users/imjaeeun/.sdkman/candidates
__CFBundleIdentifier = com.jetbrains.intellij
SHELL = /bin/zsh
SDKMAN_CANDIDATES_API = https://api.sdkman.io/2
SDKMAN_PLATFORM = darwinarm64
HOMEBREW_CELLAR = /opt/homebrew/Cellar
OLDPWD = /
USER = imjaeeun
TMPDIR = /var/folders/nq/pqw879nn4cxgjzkyr0l080h00000gn/T/
SSH_AUTH_SOCK = /private/tmp/com.apple.launchd.ooorVRAlic/Listeners
_CE_CONDA =
XPC_FLAGS = 0x0
__CF_USER_TEXT_ENCODING = 0x1F5:0x3:0x33
CONDA_PROMPT_MODIFIER = (base)
LC_CTYPE = ko_KR.UTF-8
HOME = /Users/imjaeeun*/