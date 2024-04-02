package BasicInputOutput;

import Common.*;
import Common.Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9f5fdb1f-de17-4382-bc15-50ed87041fe7")
public abstract class Channel {
    @objid ("9577628d-9bd2-485b-bbbb-c65097655763")
    public abstract String getName();

    @objid ("d4f76a5c-7b0b-4c62-963b-09b9bc07e007")
    public abstract void open(Status errorStatus);

    @objid ("d4e68128-e66a-4ad2-925c-a70d44dd9b8e")
    public abstract void close(Status errorStatus);

    @objid ("322472dd-d733-463e-8106-cb380c426bb8")
    public abstract boolean isOpen();

    @objid ("eca4633a-8a0b-403c-8331-3bb2cf52ecf8")
    public abstract Status getStatus();

}
