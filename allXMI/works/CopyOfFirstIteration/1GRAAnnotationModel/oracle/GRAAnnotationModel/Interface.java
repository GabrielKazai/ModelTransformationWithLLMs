package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("42c5d818-16b2-4ce4-96be-bfc10d21152e")
public class Interface extends GRAServiceAnnotationBase {
    @objid ("c5ac1f4a-797d-4cb2-9231-f0c3f45d4936")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("632c3456-6130-4fb2-8fc3-df32cf52d9d5")
    private List<Operation> operation = new ArrayList<Operation> ();

}
