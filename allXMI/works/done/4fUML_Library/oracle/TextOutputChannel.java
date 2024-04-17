import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import unlimitedNatural;

@objid ("8a4a3e78-f7ce-438d-bbcd-844733db704f")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("9e9ca140-7bba-4446-8950-bee78c24c2ab")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("614a9f6c-0167-4216-8131-cd05d956b369")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("6ee1da46-86e3-40a5-ad34-365925f9349e")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("acc7f222-2278-4155-ae70-0542130ed6b5")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("bb40585c-a179-4e4e-a4d6-358d72ddf74b")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("24c7bd6b-2272-4908-be3d-126b437ed0ab")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}
