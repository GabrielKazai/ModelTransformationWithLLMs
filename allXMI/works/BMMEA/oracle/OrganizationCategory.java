import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3342a0df-5e9b-491d-ac46-f08a8ea60318")
public class OrganizationCategory extends MotivationElement {
    @objid ("c6777438-a6a7-4eb2-8912-245503617e73")
    public List<InfluencingOrganization> categorizedInfluencingOrganization = new ArrayList<InfluencingOrganization> ();

    @objid ("970a0ba7-5f94-4704-8905-79a1870bd7af")
    public List<OrganizationCategory> broaderOrganizationCategory = new ArrayList<OrganizationCategory> ();

    @objid ("1b66a6fb-d742-4e6b-b910-3591771c18b4")
    public List<OrganizationCategory> narrowerOrganizationCategory = new ArrayList<OrganizationCategory> ();

}
