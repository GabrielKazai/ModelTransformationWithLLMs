package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("94f8d92d-a886-4c93-bd59-52f712ae8e09")
public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    @objid ("c5a030f2-eac7-4b97-8e9d-11868340ac2a")
    private List<Service> provider = new ArrayList<Service> ();

    @objid ("ef4ce2a7-c48b-4ea5-80d5-1bf8833580ed")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("7e78328a-68ae-4108-9e79-576582bc2bf9")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("d8d89f5e-15c6-4ec2-a990-618fa6458028")
    private List<Port> port_default = new ArrayList<Port> ();

    @objid ("5f20bd55-f831-4af7-a6c0-695db13e34c3")
    public ServiceInteractionProfile ServiceInteractionProfile;

    @objid ("ec028c05-8132-48bc-a1e2-d6cc848a185a")
    private List<Interface> interface_default = new ArrayList<Interface> ();

}
