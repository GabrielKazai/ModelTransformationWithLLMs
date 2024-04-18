import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d7b31918-8b27-4fb6-98ff-d024a1e1607a")
public class End extends MotivationElement {
    @objid ("1742c5f2-463f-41eb-9ccf-15f2c90614af")
    public List<Assessment> judgingAssessment = new ArrayList<Assessment> ();

    @objid ("5e16a4b6-e4a1-410f-9756-de7c5813e86e")
    public OrganizationUnit definingOrganizationUnit;

}
