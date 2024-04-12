public enum Verdict {
    none, pass, inconclusive, fail, error
}

public interface Arbiter {
    Verdict getVerdict();

    void setVerdict(Verdict v);
}

public interface Timer {
    boolean isRunning = true;

    void start(Timepoint expire);

    void start2(Duration expire);

    void stop();

    Duration read();
}

public class Timepoint {
}

public class Duration {
}

public class Timezone {
}