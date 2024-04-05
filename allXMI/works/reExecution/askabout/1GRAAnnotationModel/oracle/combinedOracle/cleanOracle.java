package GRAUML.GRAAnnotationModel;


public enum ExchangePattern {
    Enquiery,
    Subscription,
    Notification,
    Update,
    Message;
}

package GRAUML.GRAAnnotationModel;


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

package GRAUML.GRAAnnotationModel;


public class Participant extends Organization {
}

package GRAUML.GRAAnnotationModel;


public class Interface extends GRAServiceAnnotationBase {
    private List<Message> message_default = new ArrayList<Message> ();

    private List<Operation> operation = new ArrayList<Operation> ();

}

package GRAUML.GRAAnnotationModel;


public class Service extends Participant {
    private List<Operation> operation_default = new ArrayList<Operation> ();

    private List<Message> message_default = new ArrayList<Message> ();

    private List<Interface> interface_default = new ArrayList<Interface> ();

    private List<Port> port = new ArrayList<Port> ();

}

package GRAUML.GRAAnnotationModel;


public class Operation extends GRAServiceAnnotationBase {
    private ExchangePattern MessageExchangePattern;

    private List<Message> message = new ArrayList<Message> ();

}

package GRAUML.GRAAnnotationModel;


public class Message extends GRAServiceAnnotationBase {
}

package GRAUML.GRAAnnotationModel;


public class ServiceInteraction extends GRAServiceAnnotationBase {
    public List<Participant> participant = new ArrayList<Participant> ();

}

package GRAUML.GRAAnnotationModel;


public class UseCase extends GRAServiceAnnotationBase {
    public List<Participant> provider = new ArrayList<Participant> ();

    public List<Participant> consumer = new ArrayList<Participant> ();

}

package GRAUML.GRAAnnotationModel;


public enum MessageUse {
    in,
    out,
    inout,
    exception;
}

package GRAUML.GRAAnnotationModel;


public class Agreement {
}

package GRAUML.GRAAnnotationModel;


public class EntityType {
    public choice_1 choice_1;

    public class choice_1 {
    }

}

package GRAUML.GRAAnnotationModel;


public class IEPDReference {
}

package GRAUML.GRAAnnotationModel;


public class Organization extends GRAServiceAnnotationBase {
    public Person OrganizationPointOfContact;

}

package GRAUML.GRAAnnotationModel;


public class Person extends GRAServiceAnnotationBase {
}

package GRAUML.GRAAnnotationModel;


public class SecurityClassification {
}

package GRAUML.GRAAnnotationModel;


public class ServiceCapability {
}

package GRAUML.GRAAnnotationModel;


public class ServiceIdentification extends GRAServiceAnnotationBase {
}

package GRAUML.GRAAnnotationModel;


public class ServiceInteractionProfile {
}

package GRAUML.GRAAnnotationModel;


public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    private List<Service> provider = new ArrayList<Service> ();

    private List<Operation> operation_default = new ArrayList<Operation> ();

    private List<Message> message_default = new ArrayList<Message> ();

    private List<Port> port_default = new ArrayList<Port> ();

    public ServiceInteractionProfile ServiceInteractionProfile;

    private List<Interface> interface_default = new ArrayList<Interface> ();

}

package GRAUML.GRAAnnotationModel;


public class ServiceLevelAgreement {
    public List<Agreement> ApplicableContract = new ArrayList<Agreement> ();

    public List<Agreement> Agreement = new ArrayList<Agreement> ();

    public Agreement LicensingAgreement;

    public List<Agreement> UmbrellaAgreement = new ArrayList<Agreement> ();

    public AmountType UsageCostAmount;

    public AmountType UsageUnitCostAmount;

    public AmountType CreationCostAmount;

}

package GRAUML.GRAAnnotationModel;


public class SummaryTextType {
}

package GRAUML.GRAAnnotationModel;


public class Model {
}

package GRAUML.GRAAnnotationModel;


public class AmountType {
}

package GRAUML.GRA_WSDL;


public class WSDLServiceInterface extends ServiceInterfaceSpecification {
}

package GRAUML.GRA_WSDL;


public class WSDLService extends Service {
}

package GRAUML.GRA_WSDL;


public class WSDLPort extends Port {
    public String certificate;

}

package GRAUML.GRA_WSDL;


public class WSDLInterface extends Interface {
    public BindingType BindingCode = soap_12;

}

package GRAUML.GRA_WSDL;


public class WSDLOperation extends Operation {
    public OperationKind OperationKindCode = doc;

}

package GRAUML.GRA_WSDL;


public class WSDLMessage extends Message {
    public MessageLocation MessageLocationCode = body;

    public String encoding;

    public String mimeType;

    public String soapAction;

}

package GRAUML.GRA_WSDL;


public enum OperationKind {
    doc,
    rpc;
}

package GRAUML.GRA_WSDL;


public enum MessageLocation {
    body,
    header,
    url;
}

package GRAUML.GRA_WSDL;


public enum BindingType {
    soap,
    soap_12,
    http_get,
    http_put;
}
