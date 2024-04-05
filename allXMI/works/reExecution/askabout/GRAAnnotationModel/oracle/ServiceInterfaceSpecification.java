import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8442f240-e950-4879-8db4-7abb9275a087")
public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    @objid ("ecd67001-d60a-4b09-9b08-c80f461e323b")
    private List<Service> provider = new ArrayList<Service> ();

    @objid ("4bfea50d-5238-4484-b10c-8080e423a85d")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("4f5931c2-9eaa-4f61-96e3-604759c4d3ab")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("eaccebfe-f650-48e9-ae18-5c6b0cb2ae39")
    private List<Port> port_default = new ArrayList<Port> ();

    @objid ("145e2c4d-46ad-4ef8-bea4-0f9b1535a953")
    public ServiceInteractionProfile ServiceInteractionProfile;

    @objid ("54ff9299-398f-45ca-b4f9-872fc4dfe698")
    private List<Interface> interface_default = new ArrayList<Interface> ();

}
