package BasicInputOutput;

import Common.*;
import Common.Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import external.unlimitedNatural;

@objid ("cdc9ca69-b71d-4a70-9365-3114224b8c2f")
public abstract class TextInputChannel extends InputChannel {
    @objid ("21581c01-4cab-458e-ade4-01357ae88a5b")
    public String readCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("4d7bd9e8-81e7-4a40-879e-e63b3ff85dc0")
    public String peekCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("906f0819-1739-41ae-a7df-3a8d871169e0")
    public String readLine(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("88289d81-3b42-4e5b-b117-e6e247f35039")
    public Integer readInteger(Status errorStatus) {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("87e24053-2ed1-4d1b-ba5f-d211ff0e6ec5")
    public Boolean readBoolean(Status errorStatus) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("39c89a6c-3121-481a-8365-8633069c658b")
    public unlimitedNatural readUnlimitedNatural(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

}
