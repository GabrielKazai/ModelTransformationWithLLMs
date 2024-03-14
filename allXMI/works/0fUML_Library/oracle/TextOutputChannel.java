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
