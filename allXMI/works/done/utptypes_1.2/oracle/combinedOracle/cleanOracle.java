
public enum Verdict {
    none,
    pass,
    inconclusive,
    fail,
    error;
}

public interface Arbiter {
    Verdict getVerdict();

    void setVerdict(final Verdict v);

}

public interface Timer {
    void start(final Timepoint expire);

    void start2(final Duration expire);

    void stop();

    Duration read();

}

public class Timepoint {
}

public class Duration {
}

public class Timezone {
}
