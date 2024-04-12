import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("531dec82-d4fd-4e07-bb0a-1088bdafaaeb")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("089e372b-aad2-467f-9eb2-3fead6f0107a")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("4e22b867-0074-4c5a-808b-42eb80dacbbc")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("76c6e2a7-66e6-4702-accc-411f99febad7")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("d05271c9-6631-480e-a6e7-8709efe07eca")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("ab8e84a1-15e5-4514-b4ce-2f90faa0b90b")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("8e04237a-532a-445e-a7b2-ae856d48b73b")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}
