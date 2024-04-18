import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4f602635-25d8-4afa-a76a-38102f5cf42e")
public class Influencer extends MotivationElement {
    @objid ("cad47bc3-52c7-4305-aa8d-24217f97f34e")
    public List<Assessment> judgingAssessment = new ArrayList<Assessment> ();

    @objid ("1b61e79d-36fe-4204-9bd6-8680dde3281c")
    public List<InfluencerCategory> categorizingInfluencerCategory = new ArrayList<InfluencerCategory> ();

    @objid ("6f52804d-9d4e-4ed9-900c-da2c9e6a8d9f")
    public List<OrganizationUnit> recognizingOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("f5d53dbd-3f3a-4a70-abcf-e94aaeadf66a")
    public List<InfluencingOrganization> sourceInfluencingOrganization = new ArrayList<InfluencingOrganization> ();

}
