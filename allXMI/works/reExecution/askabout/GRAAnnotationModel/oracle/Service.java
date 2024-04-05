import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c3e2d9e9-e4ce-4784-b16d-985d07629f3f")
public class Service extends Participant {
    @objid ("79d75c78-e956-46a8-90af-68868c1c973b")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("790b00bf-a7ae-4ce4-b4a5-2ef9c4e0a8b5")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("0b8f086f-3d22-4a03-9630-edaa8eefcab5")
    private List<Interface> interface_default = new ArrayList<Interface> ();

    @objid ("c9c3e42f-ba7e-4caf-829e-ddaf1931bee2")
    private List<Port> port = new ArrayList<Port> ();

}
