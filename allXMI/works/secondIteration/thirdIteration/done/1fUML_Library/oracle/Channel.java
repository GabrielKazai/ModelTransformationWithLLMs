import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1f08e28b-aee7-4f6d-98a8-7ba6ba157863")
public abstract class Channel {
    @objid ("df7bfb1b-e981-4991-ac14-25dc3d3750f3")
    public abstract String getName();

    @objid ("5d82b098-8a55-4a6b-aad3-ef7988c9a6ef")
    public abstract void open(Status errorStatus);

    @objid ("bc6cd5e2-e5fc-4e06-b2bd-e0f5535a9f05")
    public abstract void close(Status errorStatus);

    @objid ("31c0bb69-c285-42e6-b11a-442bd089e183")
    public abstract boolean isOpen();

    @objid ("fbdd5830-64b1-4e90-9e69-e269b96b5a1d")
    public abstract Status getStatus();

}
