import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d130e550-d488-4bbd-bff5-9dbf8622e6c6")
public class Strategy extends CourseOfAction {
    @objid ("a0aba5b5-5c64-46fb-a4f2-404309a4c1fb")
    public List<Mission> plannedMission = new ArrayList<Mission> ();

    @objid ("e11d51f4-8ed4-4c08-97e1-704f38be23c5")
    public List<OrganizationUnit> determinedOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("a616153f-0a4e-4526-9c2c-a6a356c8b7f5")
    public List<Tactic> implementingTactic = new ArrayList<Tactic> ();

}
