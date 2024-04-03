import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fbc5cbf5-28b9-4160-a224-0e9cd556b2b3")
public abstract class Channel {
    @objid ("4df4a5ec-94ff-4841-9078-efa8a5ccc3a0")
    public abstract String getName();

    @objid ("e2ef30ea-9d3b-459a-8730-02e3a3285b23")
    public abstract void open(Status errorStatus);

    @objid ("123753fc-f03d-40b1-b810-8b4142b40ecf")
    public abstract void close(Status errorStatus);

    @objid ("25972c62-0742-4457-a5ab-51f422a946d2")
    public abstract boolean isOpen();

    @objid ("eefbf0e8-1e88-4221-9cb4-097b26eec7af")
    public abstract Status getStatus();

}

import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import unlimitedNatural;

@objid("5fce1f0f-7c5c-4eab-891d-9a820676e91a")
public abstract class TextInputChannel extends InputChannel {
    @objid("763b4951-6ae2-4345-8f9c-8ac4ce1542e0")
    public String readCharacter(Status errorStatus) {
        return null;
    }

    @objid("14479570-72f8-430b-93d3-ece8d899ed08")
    public String peekCharacter(Status errorStatus) {
        return null;
    }

    @objid("fe1f45b3-4b69-40a1-a60b-fdfbd39def49")
    public String readLine(Status errorStatus) {
        return null;
    }

    @objid("ce6d7cc8-eac7-4218-b3fa-701a1534280f")
    public Integer readInteger(Status errorStatus) {
        return 0;
    }

    @objid("26b42e55-03be-4411-924b-d59a6a3487a2")
    public Boolean readBoolean(Status errorStatus) {
        return false;
    }

    @objid("ee9f3496-c42e-4837-bab1-e112b9c22402")
    public unlimitedNatural readUnlimitedNatural(Status errorStatus) {
        return null;
    }

}

import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import unlimitedNatural;

@objid ("ec173fe0-109c-4420-bc50-754caeaa0b41")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("9c4d97c3-6112-42fa-b980-8bf1c0fcf285")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("2902ae6d-e26c-43b7-9ebf-39c7c950541d")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("ce5a8d8b-14c4-4793-b197-4bdde62b6c1f")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("e1868e30-50d4-44d0-afcf-299c6e8e24ad")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("259e0ebb-b34c-4174-858c-45c2577b1fa0")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("925572a5-fb6c-44db-b750-2c37c0848ab1")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0dc4651e-08ff-4b25-9332-276ed8e5e00c")
public abstract class StandardInputChannel extends TextInputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0554c50c-e397-4a0c-9a2f-40c3a9402eac")
public abstract class StandardOutputChannel extends TextOutputChannel {
}

import Listener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("e81255c4-52e9-4c92-a985-8f3fe9c78e7a")
public abstract class ActiveChannel extends Channel {
    @objid("289c2711-57a2-4d78-b67e-baea9a0220d9")
    public void register(final Listener listener) {
    }

    @objid("02de64d7-7067-424b-9abf-b141ad847a50")
    public void unregister(final Listener listener) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("a7200356-4c13-4c9f-afd5-1c1f3e5fa5d7")
public class unlimitedNatural {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("19418895-cc43-4a0b-a71e-4ef2ef8abfc7")
public abstract class Listener {
    @objid ("cd9affec-6d59-4bbe-8835-e1e4c2cc24b8")
    public void () {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("36096660-7867-4bbd-b81f-af10c83d70ea")
public class Status {
    @objid ("f0e9728d-88fa-4f8b-963d-bc79c156da68")
    public String context;

    @objid ("68e00a18-9864-4438-b761-c6e2dcd417f8")
    public int code;

    @objid ("0d5a3ab7-3270-4b84-928b-445ae67b2c78")
    public String description;

}

