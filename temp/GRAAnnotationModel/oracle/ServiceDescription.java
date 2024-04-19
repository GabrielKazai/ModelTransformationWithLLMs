import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("dfc00a6d-8ee5-4731-9691-8cbad4aa888e")
public class ServiceDescription extends ServiceIdentification {
    @objid ("58bba484-6f8d-49b8-881d-3c87c716d1f6")
    public String TransformationURI;

    @objid ("92d31d39-ce27-4af4-bd58-e1fe0f90ba5d")
    public ServiceInteraction ServiceInteraction;

    @objid ("d5216aa0-3c9d-4791-9f4f-be20d274f554")
    private SecurityClassification ServiceSecurityClassification;

    @objid ("8ab9c26f-9225-433b-a8e2-858e00dde35c")
    public UseCase RealWorldEffect;

    @objid ("fa52c9dd-d62c-475b-8ca5-0fdb8d65e56c")
    public List<Participant> ExchangePartner = new ArrayList<Participant> ();

    @objid ("98e68921-e9bc-4586-86e2-4c68b8c9ab55")
    protected List<IEPDReference> IEPDReference = new ArrayList<IEPDReference> ();

    @objid ("78283db5-8d50-476f-8c6c-d99b217d016c")
    public List<ServiceInterfaceSpecification> ServiceInterface = new ArrayList<ServiceInterfaceSpecification> ();

    @objid ("626a9dbb-a6dc-4224-ad2e-8c754cd9cb66")
    public List<ServiceCapability> ServiceCapabilities = new ArrayList<ServiceCapability> ();

    @objid ("c96e8d2c-528f-42da-8f63-84aab041fb16")
    public List<ServiceIdentification> ServiceDependency = new ArrayList<ServiceIdentification> ();

    @objid ("65c4fc7d-b4a4-450a-9235-0d03deea8767")
    public List<Organization> RelatedOrganization = new ArrayList<Organization> ();

    @objid ("66d6d646-8b3c-47b9-8362-b0e8a758d5ec")
    public List<ServiceLevelAgreement> ServiceLevelAgreement = new ArrayList<ServiceLevelAgreement> ();

    @objid ("034028c0-f02f-44c2-a6b9-509f38e96810")
    public Description ServiceDescription;

    @objid ("59c7e1cd-41b2-458a-b7f0-c9198381d5c4")
    public Description ServicePurpose;

    @objid ("e80135a2-d993-4dad-9c07-f6b154c58254")
    public Description ServiceScopeDescription;

}
