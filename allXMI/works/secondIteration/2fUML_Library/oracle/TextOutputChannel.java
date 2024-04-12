package BasicInputOutput;

import Common.*;
import Common.Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import external.unlimitedNatural;

@objid ("e948070b-fd6c-4355-ab27-0f45547b7e15")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("f6fbd130-a892-49ef-a227-84b5dbc55e28")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("4a9725fc-4fbe-4702-9349-dedf3c219551")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("82b909b3-eaf8-486e-911e-bd61440887e3")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("f7f55981-ec54-40cc-bb66-b27dca5f5a48")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("1ad98ecb-cf2f-4e54-8c74-b82f4347179a")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("96803747-ed54-4418-bce0-75e2f79577e5")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}
