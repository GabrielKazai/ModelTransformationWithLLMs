package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("87a6f8e6-6794-46c2-b237-23bbc316abf6")
public class Service extends Participant {
    @objid ("958a1fd4-b5d1-4197-9ccb-57be1bcd8771")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("7b385d0b-24b6-44a6-80b6-0e6f664fc0f7")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("61772554-c4f2-4598-9d86-eb6950437eee")
    private List<Interface> interface_default = new ArrayList<Interface> ();

    @objid ("2f770f86-8cbc-47dc-9a47-6adde41c4a7e")
    private List<Port> port = new ArrayList<Port> ();

}
