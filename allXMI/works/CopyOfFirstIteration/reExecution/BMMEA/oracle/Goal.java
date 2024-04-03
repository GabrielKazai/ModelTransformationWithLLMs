import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8c84fa20-303f-4c49-b809-9058626bf74d")
public class Goal extends DesiredResult {
    @objid ("f7c659ae-75ec-4ca5-b868-25a113b52387")
    public List<Objective> quantifyingObjective = new ArrayList<Objective> ();

    @objid ("16947976-d87a-4a97-8411-75a910ecd915")
    public List<Vision> amplifiedVision = new ArrayList<Vision> ();

}
