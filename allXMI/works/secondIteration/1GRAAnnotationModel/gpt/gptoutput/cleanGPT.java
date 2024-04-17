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
    public int Template;
    public ModelReference ModelReference;
    public int flag;
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
    public ModelReference type;
    public boolean use;
}public class Port extends GRAServiceAnnotationBase {    private Interface interface;    private Operation operation_default;    private Message message_default;    public String AddressURI;}

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
    public boolean RealWorldEffectDescriptionText;
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
    public ServiceInteraction ServiceInteraction;
    public SecurityClassification ServiceSecurityClassification;
    public UseCase RealWorldEffect;
    public Participant ExchangePartner;
    public IEPDReference IEPDReference;
    public ServiceInterfaceSpecification ServiceInterface;
    public ServiceCapability ServiceCapabilities;
    public ServiceIdentification ServiceDependency;
    public Organization RelatedOrganization;
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