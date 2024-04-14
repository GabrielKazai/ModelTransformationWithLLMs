
public abstract class Channel {
    public abstract String getName();

    public abstract void open(Status errorStatus);

    public abstract void close(Status errorStatus);

    public abstract boolean isOpen();

    public abstract Status getStatus();

}

public abstract class StandardInputChannel extends TextInputChannel {
}

public abstract class StandardOutputChannel extends TextOutputChannel {
}

public abstract class ActiveChannel extends Channel {
    public void register(final Listener listener) {
    }

    public void unregister(final Listener listener) {
    }

}

public class unlimitedNatural {
}

public abstract class Listener {
    public void Notification() {
    }

}

public class Status {
    public String context;

    public int code;

    public String description;

}
