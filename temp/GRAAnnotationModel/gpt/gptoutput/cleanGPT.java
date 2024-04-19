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
    protected String Name;
    protected String Documentation;
    public String Template;
    public int flag;
    public ModelReference ModelReference;
}

public class Participant extends GRAServiceAnnotationBase {
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
    protected boolean isAsyncronous;
    private String ActionName;
    private String ActionPurpose;
}

public class Message extends GRAServiceAnnotationBase {
    protected ModelReference type;
    protected MessageUse use;
}public class Port extends GRAServiceAnnotationBase {    private Interface interface;    private Operation operation_default;    private Message message_default;    public String AddressURI;}

public class ModelReference {
    protected Model Model;
    protected String Name;
    protected String Documentation;
    protected String ElementID;
    protected String DiagramLink;
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
    private String AgreementDescriptionText;
    private String AgreementURI;
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
    private String SecurityClassificationText;
}

public class ServiceCapability {
    private String CapabilityDescriptionText;
}

public class ServiceDescription extends GRAServiceAnnotationBase {
    public ServiceInteraction ServiceInteraction;
    private SecurityClassification ServiceSecurityClassification;
    public UseCase RealWorldEffect;
    public Participant ExchangePartner;
    protected IEPDReference IEPDReference;
    public Interface ServiceInterface;
    public ServiceCapability ServiceCapabilities;
    public ServiceDependency ServiceDependency;
    public Organization RelatedOrganization;
    public ServiceLevelAgreement ServiceLevelAgreement;
    public Description ServiceDescription;
    public Description ServicePurpose;
    public Description ServiceScopeDescription;
    public String TransformationURI;
    private String Classification;
    private String Sponsors;
    private String ServiceDescriptionSummaryText;
    private String ServiceDescriptionKeywordText;
    private String DomainDescription;
    private String Endorsements;
    private String MajorVersion;
    private String MinorVersion;
    private String RevisionVersion;
    private String CreationDate;
    private String ActivationDate;
    private String LastRevisionDate;
    private String NextRevisionDate;
    private String ExpirationDate;
    private String LifecycleStatus;
    private String AlertsAndNotifications;
}

public class ServiceIdentification extends GRAServiceAnnotationBase {
    private String ServiceID;
    private String ServiceURI;
    private String ServiceNameAbbreviationText;
}

public class ServiceInteractionProfile {
    private String SIPName;
    private String SIPVersion;
}

public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    private Service provider;
    private Operation operation_default;
    private Message message_default;
    private Port port_default;
    public ServiceInteractionProfile ServiceInteractionProfile;
    public Interface interface_default;
    public boolean SecurityImplementedIndicator;
    private String SecurityDescriptionText;
    public String URIAddress;
    public String URIDescription;
}

public class ServiceLevelAgreement {
    public Agreement ApplicableContract;
    public Agreement Agreement;
    public Agreement LicensingAgreement;
    public Agreement UmbrellaAgreement;
    public AmountType UsageCostAmount;
    public AmountType UsageUnitCostAmount;
    public AmountType CreationCostAmount;
    private boolean ApplicablePoliciesIndicator;
    private boolean ApplicableContractsIndicator;
    private boolean ApplicableAgreementsIndicator;
    private boolean ApplicableUmbrellaAgreementsIndicator;
    private String ApplicablePolicies;
    private boolean ApprovalRequiredIndicator;
    private boolean LicensingRequiredIndicator;
    private String ServiceResponseTime;
    private String ServiceAverageThroughput;
    private String ServiceMaximumThroughput;
    private String ServiceAvailability;
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
    private String currencyText;
    private String value;
}