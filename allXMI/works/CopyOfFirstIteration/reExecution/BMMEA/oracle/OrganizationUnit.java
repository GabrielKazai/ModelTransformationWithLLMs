import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("111ed05d-1782-452a-9a89-12ee981fe281")
public class OrganizationUnit extends MotivationElement {
    @objid ("7c33d31e-a056-40bf-99b4-ce414857873c")
    public List<Assessment> madeAssessment = new ArrayList<Assessment> ();

    @objid ("60ce156d-07af-483f-ae30-b69da729be75")
    public List<Asset> managedAsset = new ArrayList<Asset> ();

    @objid ("573d4caf-d229-426f-a972-3e802e4fb98d")
    public List<BusinessProcess> managedBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("a86cbb1a-404d-4927-9351-7ee20bfcbd74")
    public List<End> definedEnd = new ArrayList<End> ();

    @objid ("0884e609-fabf-4a4a-a823-f67011cc8fd9")
    public List<Influencer> recognizedInfluencer = new ArrayList<Influencer> ();

    @objid ("8355e947-0109-4f3a-a91c-f6b95fbf31b7")
    public List<InfluencingOrganization> internalInfluencingOrganization = new ArrayList<InfluencingOrganization> ();

    @objid ("4bd95d43-c0e3-46de-a676-8c0cca887f77")
    public List<Liability> managedLiability = new ArrayList<Liability> ();

    @objid ("2d98d7bb-4cea-4444-9c37-a3b5e81782d7")
    public List<Means> establishedMeans = new ArrayList<Means> ();

    @objid ("9c207e0e-3f4c-4960-b53a-f40f8b0c8b50")
    public List<Strategy> determiningStrategy = new ArrayList<Strategy> ();

}
