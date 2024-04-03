import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cdaa3bec-bf38-4f3f-8ee8-5c7fe954d366")
public class Mission extends Means {
    @objid ("e0bd1974-bf79-48a0-9bf7-3f7325f81b57")
    public List<Strategy> missionComponent = new ArrayList<Strategy> ();

    @objid ("b308c040-7d71-48bc-81fd-12940aa46a26")
    public List<Vision> operativeVision = new ArrayList<Vision> ();

}
