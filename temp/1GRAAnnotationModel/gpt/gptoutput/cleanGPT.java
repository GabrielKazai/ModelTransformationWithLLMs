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
}public class Operation extends GRAServiceAnnotationBase {    private Message message;    private ExchangePattern MessageExchangePattern;    public boolean isAsyncronous;    public ActionName;    public ActionPurpose;}

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
}public class UseCase extends GRAServiceAnnotationBase {    public Participant provider;    public Participant consumer;    public RealWorldEffectDescriptionText;}

public enum MessageUse {
    in, out, inout, exception
}public class Agreement {    public AgreementDescriptionText;    public AgreementURI;}

public class EntityType {
    public choice_1 choice_1;

    class choice_1 {
        public Organization Organization;
        public Person Person;
    }
}

public class IEPDReference {
    public String IEPDName;
    public String IEPDURL;
}public class Organization extends GRAServiceAnnotationBase {    public Person OrganizationPointOfContact;    public String OrganizationAcronym;    public String OrganizationFullAddressText;    public String OrganizationWebSiteURL;    public OrganizationRoleDescriptionText;    public OrganizationRoleDetailedDescriptionText;}public class Person extends GRAServiceAnnotationBase {    public String ContactPersonEmailID;    public ContactPersonPhoneNumberID;    public ContactPersonAddress;}public class SecurityClassification {    public SecurityClassificationText;}public class ServiceCapability {    public CapabilityDescriptionText;}public class ServiceDescription extends ServiceInteraction {    private ServiceInteraction ServiceInteraction;    private SecurityClassification ServiceSecurityClassification;    private RealWorldEffect RealWorldEffect;    private Participant ExchangePartner;    private IEPDReference IEPDReference;    private ServiceInterfaceSpecification ServiceInterface;    private ServiceCapability ServiceCapabilities;    private ServiceIdentification ServiceDependency;    private Organization RelatedOrganization;    private ServiceLevelAgreement ServiceLevelAgreement;    private Description ServiceDescription;    private String ServicePurpose;    private Description ServiceScopeDescription;    public String TransformationURI;    public Classification;    public Sponsors;    public Description ServiceDescriptionSummaryText;    public Description ServiceDescriptionKeywordText;    public Description DomainDescription;    public Endorsements;    public MajorVersion;    public MinorVersion;    public RevisionVersion;    public CreationDate;    public ActivationDate;    public LastRevisionDate;    public NextRevisionDate;    public ExpirationDate;    public LifecycleStatus;    public AlertsAndNotifications;}