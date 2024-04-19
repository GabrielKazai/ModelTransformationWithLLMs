import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("11cc66c5-2d15-4eff-957b-8426cbe651fc")
public class Means extends MotivationElement {
    @objid ("a259fedd-f049-4595-8925-7f3ac391d21a")
    public List<Assessment> judgingAssessment = new ArrayList<Assessment> ();

    @objid ("ecb96dd0-f831-4208-9405-cbd3174bebf0")
    public List<OrganizationUnit> establishingOrganizationUnit = new ArrayList<OrganizationUnit> ();

}
