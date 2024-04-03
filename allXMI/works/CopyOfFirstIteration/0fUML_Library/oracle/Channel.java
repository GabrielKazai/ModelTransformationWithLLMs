import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fbc5cbf5-28b9-4160-a224-0e9cd556b2b3")
public abstract class Channel {
    @objid ("4df4a5ec-94ff-4841-9078-efa8a5ccc3a0")
    public abstract String getName();

    @objid ("e2ef30ea-9d3b-459a-8730-02e3a3285b23")
    public abstract void open(Status errorStatus);

    @objid ("123753fc-f03d-40b1-b810-8b4142b40ecf")
    public abstract void close(Status errorStatus);

    @objid ("25972c62-0742-4457-a5ab-51f422a946d2")
    public abstract boolean isOpen();

    @objid ("eefbf0e8-1e88-4221-9cb4-097b26eec7af")
    public abstract Status getStatus();

}
