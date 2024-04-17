
public enum ExchangePattern {
    Enquiery,
    Subscription,
    Notification,
    Update,
    Message;
}

public class InteractionRequirements {
    public boolean ServiceConsumerAuthentication = true;

    public boolean ServiceConsumerAuthorization = true;

    public boolean IdentityAndAttributeAssertionTransmission = false;

    public boolean ServiceAuthentication = false;

    public boolean MessageNonrepudiation = true;

    public boolean MessageIntegrity = true;

    public boolean MessageConfidentiality = true;

    public boolean MessageAddressing = true;

    public boolean Reliability = true;

    public boolean TransactionSupport = false;

    public boolean ServiceMetadataAvailability = true;

    public boolean InterfaceDescriptionRequirements = true;

    public boolean Logging = false;

    public String[] other_requirement;

}

public abstract class GRAServiceAnnotationBase {
    protected String Name;

    protected String Documentation;

    public String Template;

    public String[] flag;

    private InteractionRequirements requirement;

}

public class Participant extends Organization {
}

public class Interface extends GRAServiceAnnotationBase {
    private List<Message> message_default = new ArrayList<Message>();

    private List<Operation> operation = new ArrayList<Operation>();

}

public class Service extends Participant {
    private List<Operation> operation_default = new ArrayList<Operation>();

    private List<Message> message_default = new ArrayList<Message>();

    private List<Interface> interface_default = new ArrayList<Interface>();

    private List<Port> port = new ArrayList<Port>();

}

public class Operation extends GRAServiceAnnotationBase {
    private ExchangePattern MessageExchangePattern;

    protected Boolean isAsyncronous;

    private List<Message> message = new ArrayList<Message>();

}

public class Message extends GRAServiceAnnotationBase {
    protected MessageUse use;

    protected ModelReference type;

}

public class Port extends GRAServiceAnnotationBase {
    public String AddressURI;

    private List<Interface> interface = new ArrayList<Interface> ();

    private List<Operation> operation_default = new ArrayList<Operation> ();

    private List<Message> message_default = new ArrayList<Message> ();

}

public class ModelReference {
    protected String Name;

    protected String[] Documentation;

    protected String ElementID;

    protected String[] DiagramLink;

    protected Model Model;

}

public class ServiceInteraction extends GRAServiceAnnotationBase {
    public List<Participant> participant = new ArrayList<Participant>();

}

public class UseCase extends GRAServiceAnnotationBase {
    public List<Participant> provider = new ArrayList<Participant>();

    public List<Participant> consumer = new ArrayList<Participant>();

}

public enum MessageUse {
    in,
    out,
    inout,
    exception;
}

public class Agreement {
}

public class IEPDReference {
}

public class Organization extends GRAServiceAnnotationBase {
    public Person OrganizationPointOfContact;

}

public class Person extends GRAServiceAnnotationBase {
}

public class SecurityClassification {
}

public class ServiceCapability {
}

public class ServiceDescription extends ServiceIdentification {
    public String TransformationURI;

    public ServiceInteraction ServiceInteraction;

    private SecurityClassification ServiceSecurityClassification;

    public UseCase RealWorldEffect;

    public List<Participant> ExchangePartner = new ArrayList<Participant>();

    protected List<IEPDReference> IEPDReference = new ArrayList<IEPDReference>();

    public List<ServiceInterfaceSpecification> ServiceInterface = new ArrayList<ServiceInterfaceSpecification>();

    public List<ServiceCapability> ServiceCapabilities = new ArrayList<ServiceCapability>();

    public List<ServiceIdentification> ServiceDependency = new ArrayList<ServiceIdentification>();

    public List<Organization> RelatedOrganization = new ArrayList<Organization>();

    public List<ServiceLevelAgreement> ServiceLevelAgreement = new ArrayList<ServiceLevelAgreement>();

    public Description ServiceDescription;

    public Description ServicePurpose;

    public Description ServiceScopeDescription;

}

public class ServiceIdentification extends GRAServiceAnnotationBase {
}

public class ServiceInteractionProfile {
}

public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    private List<Service> provider = new ArrayList<Service>();

    private List<Operation> operation_default = new ArrayList<Operation>();

    private List<Message> message_default = new ArrayList<Message>();

    private List<Port> port_default = new ArrayList<Port>();

    public ServiceInteractionProfile ServiceInteractionProfile;

    private List<Interface> interface_default = new ArrayList<Interface>();

}

public class ServiceLevelAgreement {
    public List<Agreement> ApplicableContract = new ArrayList<Agreement>();

    public List<Agreement> Agreement = new ArrayList<Agreement>();

    public Agreement LicensingAgreement;

    public List<Agreement> UmbrellaAgreement = new ArrayList<Agreement>();

    public AmountType UsageCostAmount;

    public AmountType UsageUnitCostAmount;

    public AmountType CreationCostAmount;

}

public class Description {
    protected String Description;

    public String ExternalDocumentation;

}

public class Model {
    protected String ModelURI;

    protected String label;

}

public class AmountType {
}

public class WSDLServiceInterface extends ServiceInterfaceSpecification {
}

public class WSDLService extends Service {
}

public class WSDLPort extends Port {
    public String certificate;

}

public class WSDLInterface extends Interface {
    public BindingType BindingCode = soap12;

}

public class WSDLOperation extends Operation {
    public OperationKind OperationKindCode = doc;

}

public class WSDLMessage extends Message {
    public MessageLocation MessageLocationCode = body;

    public String encoding;

    public String mimeType;

    public String soapAction;

}

public enum OperationKind {
    doc,
    rpc;
}

public enum MessageLocation {
    body,
    header,
    url;
}

public enum BindingType {
    soap,
    soap12,
    http_get,
    http_put;
}
