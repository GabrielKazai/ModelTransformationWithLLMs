import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("42455315-d76a-41d5-b37a-4b74deecc6b2")
public class InfluencingOrganization extends MotivationElement {
    @objid ("cbce5af7-3bfd-4f2e-ae4f-7ce798e0f548")
    public List<Influencer> providedInfluencer = new ArrayList<Influencer> ();

    @objid ("7546aca8-8a76-4dca-ac9f-bb929b770096")
    public List<OrganizationCategory> categorizingOrganizationCategory = new ArrayList<OrganizationCategory> ();

    @objid ("eb3624d4-fc98-491a-82f6-f8cd833c2ec5")
    public List<OrganizationUnit> influencingOrganizationUnit = new ArrayList<OrganizationUnit> ();

}
