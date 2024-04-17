public abstract class Channel {
    public abstract String getName();

    public abstract void open(Status[] errorStatus);

    public abstract void close(Status[] errorStatus);

    public abstract boolean isOpen();

    public abstract Status getStatus();
}

public abstract class InputChannel extends Channel {
    public abstract boolean hasMore();

    public abstract void read(String[] value, Status[] errorStatus);

    public abstract void peek(String[] value, Status[] errorStatus);
}

public abstract class OutputChannel extends Channel {
    public abstract void write(String value, Status[] errorStatus);

    public abstract boolean isFull();
}

public abstract class TextInputChannel extends InputChannel {
    public String readCharacter(Status[] errorStatus);

    public String peekCharacter(Status[] errorStatus);

    public String readLine(Status[] errorStatus);

    public int readInteger(Status[] errorStatus);

    public double readReal(Status[] errorStatus);

    public boolean readBoolean(Status[] errorStatus);

    public int readUnlimitedNatural(Status[] errorStatus);
}

public abstract class TextOutputChannel extends OutputChannel {
    public void writeString(String value, Status[] errorStatus);

    public abstract void writeNewLine(Status[] errorStatus);

    public void writeLine(String value, Status[] errorStatus);

    public void writeInteger(int value, Status[] errorStatus);

    public void writeReal(double value, Status[] errorStatus);

    public void writeBoolean(boolean value, Status[] errorStatus);

    public void writeUnlimitedNatural(int value, Status[] errorStatus);
}

public abstract class StandardInputChannel extends TextInputChannel {
}

public abstract class StandardOutputChannel extends TextOutputChannel {
}

public abstract class ActiveChannel extends Channel {
    public void register(Listener listener);

    public void unregister(Listener listener);
}