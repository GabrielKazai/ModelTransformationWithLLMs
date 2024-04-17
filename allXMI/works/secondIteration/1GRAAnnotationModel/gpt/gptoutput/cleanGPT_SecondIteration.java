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
    public int[] other_requirement;
}

public abstract class GRAServiceAnnotationBase {
    private InteractionRequirements requirement;
    public boolean Name;
    public boolean Documentation;
    public int Template;
    public ModelReference ModelReference;
    public int[] flag;
}

public class Participant extends GRAServiceAnnotationBase {
}

public class Interface extends GRAServiceAnnotationBase {
    private Message[] message_default;
    private Operation[] operation;
}

public class Service extends GRAServiceAnnotationBase {
    private Operation[] operation_default;
    private Message[] message_default;
    private Interface[] interface_default;
    private Port[] port;
}

public class Operation extends GRAServiceAnnotationBase {
    private Message[] message;
    private ExchangePattern MessageExchangePattern;
    public boolean isAsyncronous;
    public boolean ActionName;
    public boolean ActionPurpose;
}

public class Message extends GRAServiceAnnotationBase {
    public ModelReference type;
    public boolean use;
}

public class Port extends GRAServiceAnnotationBase {
    private Interface[] interface;
    private Operation[] operation_default;
    private Message[] message_default;
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
    public Participant[] participant;
}

public class UseCase extends GRAServiceAnnotationBase {
    public Participant[] provider;
    public Participant[] consumer;
    public boolean[] RealWorldEffectDescriptionText;
}

public enum MessageUse {
    in, out, inout, exception
}

public class Agreement {
    public boolean AgreementDescriptionText;
    public boolean AgreementURI;
}

public class EntityType {
    public choice_1 choice_1;
}

public class IEPDReference {
    public boolean IEPDName;
    public boolean IEPDURL;
}

public class Organization extends GRAServiceAnnotationBase {
    public Person OrganizationPointOfContact;
    public boolean OrganizationAcronym;
    public boolean OrganizationFullAddressText;
    public boolean OrganizationWebSiteURL;
    public boolean OrganizationRoleDescriptionText;
    public boolean OrganizationRoleDetailedDescriptionText;
}

public class Person extends GRAServiceAnnotationBase {
    public boolean ContactPersonEmailID;
    public boolean ContactPersonPhoneNumberID;
    public boolean ContactPersonAddress;
}

public class SecurityClassification {
    public boolean SecurityClassificationText;
}

public class ServiceCapability {
    public boolean CapabilityDescriptionText;
}

public class ServiceDescription extends GRAServiceAnnotationBase {
    public ServiceInteraction[] ServiceInteraction;
    public SecurityClassification ServiceSecurityClassification;
    public UseCase RealWorldEffect;
    public Participant[] ExchangePartner;
    public IEPDReference IEPDReference;
    public ServiceInterfaceSpecification ServiceInterface;
    public ServiceCapability[] ServiceCapabilities;
    public ServiceIdentification ServiceDependency;
    public Organization[] RelatedOrganization;
    public ServiceLevelAgreement ServiceLevelAgreement;
    public Description ServiceDescription;
    public Description ServicePurpose;
    public Description ServiceScopeDescription;
    public String TransformationURI;
    public boolean Classification;
    public boolean Sponsors;
    public Description ServiceDescriptionSummaryText;
    public Description ServiceDescriptionKeywordText;
    public Description DomainDescription;
    public Description Endorsements;
    public int MajorVersion;
    public int MinorVersion;
    public int RevisionVersion;
    public boolean CreationDate;
    public boolean ActivationDate;
    public boolean LastRevisionDate;
    public boolean NextRevisionDate;
    public boolean ExpirationDate;
    public boolean LifecycleStatus;
    public boolean AlertsAndNotifications;
}

public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    public Service[] provider;
    public Operation[] operation_default;
    public Message[] message_default;
    public Port[] port_default;
    public ServiceInteractionProfile[] ServiceInteractionProfile;
    public Interface[] interface_default;
    public boolean SecurityImplementedIndicator;
    public boolean SecurityDescriptionText;
    public boolean URIAddress;
    public boolean URIDescription;
}

public class ServiceLevelAgreement {
    public Agreement[] ApplicableContract;
    public Agreement[] Agreement;
    public Agreement[] LicensingAgreement;
    public Agreement[] UmbrellaAgreement;
    public AmountType UsageCostAmount;
    public AmountType UsageUnitCostAmount;
    public AmountType CreationCostAmount;
    public boolean ApplicablePoliciesIndicator;
    public boolean ApplicableContractsIndicator;
    public boolean ApplicableAgreementsIndicator;
    public boolean ApplicableUmbrellaAgreementsIndicator;
    public boolean ApplicablePolicies;
    public boolean ApprovalRequiredIndicator;
    public boolean LicensingRequiredIndicator;
    public boolean ServiceResponseTime;
    public boolean ServiceAverageThroughput;
    public boolean ServiceMaximumThroughput;
    public boolean ServiceAvailability;
}

public class ServiceInteractionProfile {
    public boolean SIPName;
    public boolean SIPVersion;
}

public class SummaryTextType {
}

public class Model {
    public boolean ModelURI;
    public boolean label;
}

public class AmountType {
    public String currencyText;
    public boolean value;
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

public class choice_1 {
    public Organization Organization;
    public Person Person;
}
