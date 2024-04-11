import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2142c000-ceee-49d3-bfa7-2eed490cfed7")
public abstract class Channel {
    @objid ("99d07f55-48a3-4131-b2fa-ab1852276536")
    public abstract String getName();

    @objid ("fa75ec24-b7e7-4190-86d6-9aeaeb80f661")
    public abstract void open(Status errorStatus);

    @objid ("e57dfcef-af99-4384-b05d-e2438b7f2938")
    public abstract void close(Status errorStatus);

    @objid ("c03547b8-f214-49cb-937b-1ee60416f780")
    public abstract boolean isOpen();

    @objid ("e9fb38d0-b50d-4909-bb0f-71ded9212217")
    public abstract Status getStatus();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1a10df22-603f-482e-b3a9-37748588aa1e")
public abstract class TextInputChannel extends InputChannel {
    @objid ("24d6281d-684f-41f4-890b-e22c211df0f0")
    public String readCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("1ad6426d-7a03-4278-b200-b97d1ccc0375")
    public String peekCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("a5ebc16b-4edd-48f3-9b01-22d23d85d467")
    public String readLine(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("636f8224-f201-4b35-9e15-07b4d24ae7b5")
    public Integer readInteger(Status errorStatus) {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("8747217c-f6d7-43ed-ae58-fc4ac39d237e")
    public Boolean readBoolean(Status errorStatus) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("acd118db-2c77-4979-aaa8-cbe4fc6d1da2")
    public unlimitedNatural readUnlimitedNatural(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6d91246d-b4c8-4d6f-9257-97c868315673")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("ed2d7c16-4f5f-4dc6-9af4-6062526402a8")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("798a1793-25cf-4b7d-bc83-056cc81a1c7f")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("ee6e430b-e95b-4e90-8f7f-8e0a315d0c62")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("e85ef126-3ded-4cf7-8e14-1738d2ce8e9d")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("f106ba7d-3efe-49b0-8543-5f9e066d56e0")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("82e4803d-20bb-4e2c-bd68-84c31e066545")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fe38d5e5-fd76-470e-8e1a-afdfd14e0d35")
public abstract class StandardInputChannel extends TextInputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d770c16e-ff34-498c-9e16-dd7b71c797b7")
public abstract class StandardOutputChannel extends TextOutputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b7f44ed6-6d86-40f6-b9b4-82324ded8852")
public abstract class ActiveChannel extends Channel {
    @objid ("1193351f-61c6-4cf1-ab60-45a49409ee99")
    public void register(final Listener listener) {
    }

    @objid ("5c0ee531-74b0-4f97-ab4b-eb93d2a7ea97")
    public void unregister(final Listener listener) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8997fa00-9393-4e44-ae59-c414db482193")
public abstract class Listener {
    @objid ("68962c8b-b057-44ae-859d-57b3da61bf53")
    public void Notification() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("fabe53be-052b-4656-a320-44a1b6ce1e56")
public class Status {
    @objid ("5ade06c8-9041-471a-818c-76acf0619530")
    public String context;

    @objid ("08740424-486e-41b6-9ab9-7998158f2563")
    public int code;

    @objid ("30a68a2a-988f-4b1d-bc8c-5dc9923b058e")
    public String description;

}

