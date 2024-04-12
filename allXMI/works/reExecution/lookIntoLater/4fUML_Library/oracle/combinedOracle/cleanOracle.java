
public abstract class Channel {
    public abstract String getName();

    public abstract void open(Status errorStatus);

    public abstract void close(Status errorStatus);

    public abstract boolean isOpen();

    public abstract Status getStatus();

}

public abstract class TextInputChannel extends InputChannel {
    public String readCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    public String peekCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    public String readLine(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    public Integer readInteger(Status errorStatus) {
        // TODO Auto-generated return
        return 0;
    }

    public Boolean readBoolean(Status errorStatus) {
        // TODO Auto-generated return
        return false;
    }

    public unlimitedNatural readUnlimitedNatural(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

}

public abstract class TextOutputChannel extends OutputChannel {
    public void writeString(final String value, Status errorStatus) {
    }

    public abstract void writeNewLine(Status errorStatus);

    public void writeLine(final String value, Status errorStatus) {
    }

    public void writeInteger(final int value, Status errorStatus) {
    }

    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

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

public abstract class Listener {
    public void () {
    }

}

public class Status {
    public String context;

    public int code;

    public String description;

}
