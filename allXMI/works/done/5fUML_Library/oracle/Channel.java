import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e12f9834-690f-40ad-83fe-203666528c8b")
public abstract class Channel {
    @objid ("1e789046-0272-4951-852f-ac481993c72d")
    public abstract String getName();

    @objid ("e2400784-1fc6-4a33-8fed-272ca6d937d5")
    public abstract void open(Status errorStatus);

    @objid ("8967c33a-e5af-4770-ab9e-605cea9cb111")
    public abstract void close(Status errorStatus);

    @objid ("f6d2f003-6a24-4e25-9bfa-a8135c4bd1b9")
    public abstract boolean isOpen();

    @objid ("330980c7-7f9a-4ee1-af59-bcd85e19a27c")
    public abstract Status getStatus();

}
