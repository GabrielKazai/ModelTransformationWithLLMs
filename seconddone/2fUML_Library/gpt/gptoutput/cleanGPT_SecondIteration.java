public abstract class Channel {
    public abstract String getName();

    public abstract void open(Status errorStatus);

    public abstract void close(Status errorStatus);

    public abstract boolean isOpen();

    public abstract Status getStatus();
}

public abstract class InputChannel extends Channel {
    public abstract boolean hasMore();

    public abstract void read(Object value, Status errorStatus);

    public abstract void peek(Object value, Status errorStatus);
}

public abstract class OutputChannel extends Channel {
    public abstract void write(Object value, Status errorStatus);

    public abstract boolean isFull();
}

public abstract class TextInputChannel extends InputChannel {
    public String readCharacter(Status errorStatus) {
        return null;
    }

    public String peekCharacter(Status errorStatus) {
        return null;
    }

    public String readLine(Status errorStatus) {
        return null;
    }

    public int readInteger(Status errorStatus) {
        return 0;
    }

    public boolean readBoolean(Status errorStatus) {
        return false;
    }

    public UnlimitedNatural readUnlimitedNatural(Status errorStatus) {
        return null;
    }
}

public abstract class TextOutputChannel extends OutputChannel {
    public void writeString(String value, Status errorStatus) {
    }

    public abstract void writeNewLine(Status errorStatus);

    public void writeLine(String value, Status errorStatus) {
    }

    public void writeInteger(int value, Status errorStatus) {
    }

    public void writeBoolean(boolean value, Status errorStatus) {
    }

    public void writeUnlimitedNatural(UnlimitedNatural value, Status errorStatus) {
    }
}

public abstract class StandardInputChannel extends TextInputChannel {
}

public abstract class StandardOutputChannel extends TextOutputChannel {
}

public abstract class ActiveChannel extends Channel {
    public void register(Listener listener) {
    }

    public void unregister(Listener listener) {
    }
}

public class Status {
    public String context;
    public int code;
    public String description;
}

public abstract class Listener {
    public void Notification(Notification notification) {
    }
}

public class Notification {
    public Object content;
}

public class UnlimitedNatural {
}