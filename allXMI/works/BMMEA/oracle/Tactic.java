import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("67b01637-3464-4d59-bc22-e0e532eb6bec")
public class Tactic extends CourseOfAction {
    @objid ("df75b56a-8d32-4881-a027-9e1b0be3273f")
    public List<BusinessRule> enforcedBusinessRule = new ArrayList<BusinessRule> ();

    @objid ("6b5a251f-79bf-4293-a9fe-5b1fb24e2980")
    public List<Strategy> implementedStrategy = new ArrayList<Strategy> ();

}
