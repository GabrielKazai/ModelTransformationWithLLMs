public enum ExchangePattern {
    Enquiery, Subscription, Notification, Update, Message
}

public class InteractionRequirements {
    public boolean ServiceConsumerAuthentication = true;
    public boolean ServiceConsumerAuthorization = true;
    public boolean IdentityAndAttributeAssertionTransmission;
    public boolean ServiceAuthentication;
    public boolean MessageNonrepudiation = true;
    public boolean MessageIntegrity = true;
    public boolean MessageConfidentiality = true;
    public boolean MessageAddressing = true;
    public boolean Reliability = true;
    public boolean TransactionSupport;
    public boolean ServiceMetadataAvailability = true;
    public boolean InterfaceDescriptionRequirements = true;
    public boolean Logging;
    public int other_requirement;
}

public abstract class GRAServiceAnnotationBase {
    private InteractionRequirements requirement;
    public boolean Name;
    public boolean Documentation;
    public boolean Template;
    public boolean ModelReference;
    public boolean flag;
}

public class Participant extends ServiceInteraction {
}

public class Interface extends GRAServiceAnnotationBase {
    private Message message_default;
    private Operation operation;
}

public class Service extends Participant {
    private Operation operation_default;
    private Message message_default;
    private Interface interface_default;
    private Port port;
}

public class Operation extends GRAServiceAnnotationBase {
    private Message message;
    private ExchangePattern MessageExchangePattern;
    public boolean isAsyncronous;
    public boolean ActionName;
    public boolean ActionPurpose;
}

public class Message extends GRAServiceAnnotationBase {
    public String type;
    public MessageUse use;
}

public class Port extends GRAServiceAnnotationBase {
    private Interface interface_;
    private Operation operation_default;
    private Message message_default;
    public String AddressURI;
}

public class ModelReference {
    public Model Model;
    public boolean Name;
    public boolean Documentation;
    public boolean ElementID;
    public boolean DiagramLink;
}

public class ServiceInteraction extends GRAServiceAnnotationBase {
    public Participant participant;
}

public class UseCase extends GRAServiceAnnotationBase {
    public Participant provider;
    public Participant consumer;
    public String RealWorldEffectDescriptionText;
}

public enum MessageUse {
    in, out, inout, exception
}

public class Agreement {
    public String AgreementDescriptionText;
    public String AgreementURI;
}

public class EntityType {
    public Choice_1 choice_1;
}

public class IEPDReference {
    public String IEPDName;
    public String IEPDURL;
}

public class Organization extends GRAServiceAnnotationBase {
    public Person OrganizationPointOfContact;
    public String OrganizationAcronym;
    public String OrganizationFullAddressText;
    public String OrganizationWebSiteURL;
    public String OrganizationRoleDescriptionText;
    public String OrganizationRoleDetailedDescriptionText;
}

public class Person extends GRAServiceAnnotationBase {
    public String ContactPersonEmailID;
    public String ContactPersonPhoneNumberID;
    public String ContactPersonAddress;
}

public class SecurityClassification {
    public String SecurityClassificationText;
}

public class ServiceCapability {
    public String CapabilityDescriptionText;
}

public class ServiceDescription extends ServiceInteraction {
    private ServiceInteraction ServiceInteraction;
    private SecurityClassification ServiceSecurityClassification;
    private RealWorldEffect RealWorldEffect;
    private Participant ExchangePartner;
    private IEPDReference IEPDReference;
    private ServiceInterfaceSpecification ServiceInterface;
    private ServiceCapability ServiceCapabilities;
    private ServiceIdentification ServiceDependency;
    private Organization RelatedOrganization;
    private ServiceLevelAgreement ServiceLevelAgreement;
    private Description ServiceDescription;
    private String ServicePurpose;
    private String ServiceScopeDescription;
    private String TransformationURI;
    private String Classification;
    private String Sponsors;
    private SummaryTextType ServiceDescriptionSummaryText;
    private String ServiceDescriptionKeywordText;
    private String DomainDescription;
    private String Endorsements;
    private int MajorVersion;
    private int MinorVersion;
    private int RevisionVersion;
    private String CreationDate;
    private String ActivationDate;
    private String LastRevisionDate;
    private String NextRevisionDate;
    private String ExpirationDate;
    private String LifecycleStatus;
    private String AlertsAndNotifications;
}

public class WSDLServiceInterface extends ServiceInterfaceSpecification {
}

public class WSDLService extends Service {
}

public class WSDLPort extends Port {
    public String certificate;
}

public class WSDLInterface extends Interface {
    public String BindingCode;
}

public class WSDLOperation extends Operation {
    public String OperationKindCode;
}

public class WSDLMessage extends Message {
    public String MessageLocationCode;
    public String encoding;
    public String mimeType;
    public String soapAction;
}

public enum OperationKind {
    doc, rpc
}

public enum MessageLocation {
    body, header, url
}

public enum BindingType {
    soap, soap_12, http_get, http_put
}