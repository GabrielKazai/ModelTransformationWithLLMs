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
