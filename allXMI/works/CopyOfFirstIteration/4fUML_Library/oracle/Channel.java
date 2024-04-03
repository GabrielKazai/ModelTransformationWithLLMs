import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1fc7111d-df89-4e02-9651-f3dc044e21e8")
public abstract class Channel {
    @objid ("1c7805cf-35a9-468c-9b1c-b261a465b44d")
    public abstract String getName();

    @objid ("d47f5fa8-e010-43f9-9798-df2742ddc235")
    public abstract void open(Status errorStatus);

    @objid ("d4bc4468-0afa-4e8f-aee6-b7a4b5d406ad")
    public abstract void close(Status errorStatus);

    @objid ("51282a48-f29b-47e8-919f-bfaeec5495f8")
    public abstract boolean isOpen();

    @objid ("844d3d2c-d2ae-451e-892a-e4f4316611cb")
    public abstract Status getStatus();

}
