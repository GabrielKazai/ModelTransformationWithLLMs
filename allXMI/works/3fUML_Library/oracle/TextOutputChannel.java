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
