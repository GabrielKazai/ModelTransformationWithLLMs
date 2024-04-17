public abstract class Channel {
    public abstract String getName();

    public abstract void open(String[] errorStatus);

    public abstract void close(String[] errorStatus);

    public abstract boolean isOpen();

    public abstract String getStatus();
}

public abstract class InputChannel extends Channel {
    public abstract boolean hasMore();

    public abstract void read(String[] value, String[] errorStatus);

    public abstract void peek(String[] value, String[] errorStatus);
}

public abstract class OutputChannel extends Channel {
    public abstract void write(String value, String[] errorStatus);

    public abstract boolean isFull();
}

public abstract class TextInputChannel extends InputChannel {
    public String readCharacter(String[] errorStatus);

    public String peekCharacter(String[] errorStatus);

    public String readLine(String[] errorStatus);

    public int readInteger(String[] errorStatus);

    public double readReal(String[] errorStatus);

    public boolean readBoolean(String[] errorStatus);

    public int readUnlimitedNatural(String[] errorStatus);
}

public abstract class TextOutputChannel extends OutputChannel {
    public void writeString(String value, String[] errorStatus);

    public abstract void writeNewLine(String[] errorStatus);

    public void writeLine(String value, String[] errorStatus);

    public void writeInteger(int value, String[] errorStatus);

    public void writeReal(double value, String[] errorStatus);

    public void writeBoolean(boolean value, String[] errorStatus);

    public void writeUnlimitedNatural(int value, String[] errorStatus);
}

public abstract class StandardInputChannel extends TextInputChannel {
}

public abstract class StandardOutputChannel extends TextOutputChannel {
}

public abstract class ActiveChannel extends Channel {
    public void register(Listener listener);

    public void unregister(Listener listener);
}