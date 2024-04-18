import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("828a7dcf-7a3d-4cad-b96e-f17dca44ee4e")
public class Port extends GRAServiceAnnotationBase {
    @objid ("4beefa71-68ca-43e8-a4d0-5a5c538effee")
    public String AddressURI;

    @objid ("bf07ce68-e7da-4f26-a0bf-2a0d8f56146a")
    private List<Interface> interface = new ArrayList<Interface> ();

    @objid ("8b16da48-9034-4fa3-b0e0-62efc7f3bbcb")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("c9e7360e-87f3-4697-8c74-4c85cdbe7472")
    private List<Message> message_default = new ArrayList<Message> ();

}
