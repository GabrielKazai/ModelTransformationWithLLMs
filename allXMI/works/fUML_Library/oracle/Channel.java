import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1fb8dae0-e596-4feb-8397-413f0c5d36ea")
public abstract class Channel {
    @objid ("f34d37c7-6d01-4f3f-a99c-6978153b1948")
    public abstract String getName();

    @objid ("5f8c0593-073d-452a-8aaf-dcf088fb4eda")
    public abstract void open(Status errorStatus);

    @objid ("9f66718a-2966-40d4-bb50-39cf5d6a901d")
    public abstract void close(Status errorStatus);

    @objid ("a74c046f-0a3f-4e42-8e0d-0f9e1af36454")
    public abstract boolean isOpen();

    @objid ("7ee41d26-1ca6-4515-b2d5-57c7376726b2")
    public abstract Status getStatus();

}
