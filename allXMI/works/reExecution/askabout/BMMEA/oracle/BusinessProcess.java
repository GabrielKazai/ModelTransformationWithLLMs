import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("23eaf593-65a5-483e-8947-bc9950c3c214")
public class BusinessProcess extends MotivationElement {
    @objid ("aac38ae6-b81d-420a-9471-558cee15b6c6")
    public List<Asset> managedAsset = new ArrayList<Asset> ();

    @objid ("baadfc0a-12d7-473b-a54f-6da354b537d6")
    public List<BusinessPolicy> governingBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("f1e42cd1-b064-494f-ad97-301d982e5e73")
    public List<BusinessRule> guidingBusinessRule = new ArrayList<BusinessRule> ();

    @objid ("10127e88-d2a3-46d3-b94c-0602cbfd312e")
    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("04c4df20-4fed-4ad1-beae-593cb1466769")
    public List<CourseOfAction> realizedCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("b22f1907-0295-4cde-ab92-a0377d94eaf0")
    public List<Offering> deliveredOffering = new ArrayList<Offering> ();

}
