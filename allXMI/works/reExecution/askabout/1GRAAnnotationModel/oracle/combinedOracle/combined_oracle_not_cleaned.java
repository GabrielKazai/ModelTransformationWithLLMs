package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e3733458-8b2b-48f1-97bc-459d5d256c8e")
public enum ExchangePattern {
    Enquiery,
    Subscription,
    Notification,
    Update,
    Message;
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("958c600a-a969-4da5-a8fd-dc869818a482")
public class InteractionRequirements {
    @objid ("9949daa1-ab27-40f3-8262-3ddebd5b5411")
    public boolean ServiceConsumerAuthentication = true;

    @objid ("d5a843c4-b4f9-4ebb-9485-78161821df67")
    public boolean ServiceConsumerAuthorization = true;

    @objid ("4ae83ac8-7a4c-422f-b341-5c7ac9070fd2")
    public boolean IdentityAndAttributeAssertionTransmission = false;

    @objid ("8c5c4655-12f9-45b1-b352-02cc34e8c0c8")
    public boolean ServiceAuthentication = false;

    @objid ("994d0448-05f5-43df-9f6e-bc3f380ba77d")
    public boolean MessageNonrepudiation = true;

    @objid ("9cdf8328-c033-489a-b209-0b66b4f9bb9b")
    public boolean MessageIntegrity = true;

    @objid ("5b4bf689-56bd-4c04-81c6-a1bc37a57a34")
    public boolean MessageConfidentiality = true;

    @objid ("06afeb18-5800-41fd-84e3-52375f007ade")
    public boolean MessageAddressing = true;

    @objid ("b6c2546e-e5b6-48e6-a01c-077193889d91")
    public boolean Reliability = true;

    @objid ("f6c8af38-963e-4781-a35b-8546cb3a6d36")
    public boolean TransactionSupport = false;

    @objid ("70c46d55-b545-45ea-b186-12c726cb9b24")
    public boolean ServiceMetadataAvailability = true;

    @objid ("ac60048d-a0a1-4d75-8423-5c019e2564e9")
    public boolean InterfaceDescriptionRequirements = true;

    @objid ("78e56c23-3e1a-40c8-a4b1-55c8d770b734")
    public boolean Logging = false;

    @objid ("bc68096a-47f2-4513-9e6a-6ba5e522db5a")
    public String[] other_requirement;

}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3df7198f-08f3-4ad3-875a-27d7a82c7eb0")
public class Participant extends Organization {
}

package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("42c5d818-16b2-4ce4-96be-bfc10d21152e")
public class Interface extends GRAServiceAnnotationBase {
    @objid ("c5ac1f4a-797d-4cb2-9231-f0c3f45d4936")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("632c3456-6130-4fb2-8fc3-df32cf52d9d5")
    private List<Operation> operation = new ArrayList<Operation> ();

}

package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("87a6f8e6-6794-46c2-b237-23bbc316abf6")
public class Service extends Participant {
    @objid ("958a1fd4-b5d1-4197-9ccb-57be1bcd8771")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("7b385d0b-24b6-44a6-80b6-0e6f664fc0f7")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("61772554-c4f2-4598-9d86-eb6950437eee")
    private List<Interface> interface_default = new ArrayList<Interface> ();

    @objid ("2f770f86-8cbc-47dc-9a47-6adde41c4a7e")
    private List<Port> port = new ArrayList<Port> ();

}

package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9dece15f-3a2a-4d60-903e-0265c084e967")
public class Operation extends GRAServiceAnnotationBase {
    @objid ("290641cb-e83e-4f72-a196-9a8a8ad6dcee")
    private ExchangePattern MessageExchangePattern;

    @objid ("ab690930-91ef-4837-84f0-eef57f9c4587")
    private List<Message> message = new ArrayList<Message> ();

}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ff53b61a-721a-4b4f-aac1-1f732894a1ba")
public class Message extends GRAServiceAnnotationBase {
}

package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2a1aed43-c59f-48b1-83fb-3d80c2afb5a7")
public class ServiceInteraction extends GRAServiceAnnotationBase {
    @objid ("a134e5b0-f7a9-40fa-a3be-c2bcc97f408e")
    public List<Participant> participant = new ArrayList<Participant> ();

}

package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c76ce48a-ae90-48cf-a371-3275de1a569e")
public class UseCase extends GRAServiceAnnotationBase {
    @objid ("0ceb9786-68b5-4585-9f35-863795dac4f3")
    public List<Participant> provider = new ArrayList<Participant> ();

    @objid ("1e45fe1d-e608-4b50-8e0a-2b531f9b7492")
    public List<Participant> consumer = new ArrayList<Participant> ();

}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("030536e1-6e31-437c-bb00-f9c16c3cb5a3")
public enum MessageUse {
    in,
    out,
    inout,
    exception;
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("118661b9-fd95-49ae-a137-78e86ed17bee")
public class Agreement {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bdbc8a9c-12c3-4c55-86e6-dae1758bea5c")
public class EntityType {
    @objid ("a1095f9f-d47e-4450-b7e0-5a4888e5a758")
    public choice_1 choice_1;

    @objid ("ca24419f-72c3-4fe5-b93d-fa9fdaf41cd7")
    public class choice_1 {
    }

}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e21b047b-2e9f-4109-9cfd-ce8c1dbf8bd5")
public class IEPDReference {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("008a4f2a-29b3-4a80-b10e-4b4c19d56124")
public class Organization extends GRAServiceAnnotationBase {
    @objid ("c3e59d09-a0f7-4106-8eee-241dcbfaf062")
    public Person OrganizationPointOfContact;

}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("680fd99f-136d-47b1-843c-55d02fef4a53")
public class Person extends GRAServiceAnnotationBase {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c0242408-c434-4967-9e35-c36142ffddb7")
public class SecurityClassification {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("14429fb9-4928-452f-9704-c13bba217e05")
public class ServiceCapability {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5b88b708-c714-4e0e-b22d-779b4378dc5a")
public class ServiceIdentification extends GRAServiceAnnotationBase {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1937825a-07d0-4692-9587-f33ac4ee7777")
public class ServiceInteractionProfile {
}

package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("94f8d92d-a886-4c93-bd59-52f712ae8e09")
public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    @objid ("c5a030f2-eac7-4b97-8e9d-11868340ac2a")
    private List<Service> provider = new ArrayList<Service> ();

    @objid ("ef4ce2a7-c48b-4ea5-80d5-1bf8833580ed")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("7e78328a-68ae-4108-9e79-576582bc2bf9")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("d8d89f5e-15c6-4ec2-a990-618fa6458028")
    private List<Port> port_default = new ArrayList<Port> ();

    @objid ("5f20bd55-f831-4af7-a6c0-695db13e34c3")
    public ServiceInteractionProfile ServiceInteractionProfile;

    @objid ("ec028c05-8132-48bc-a1e2-d6cc848a185a")
    private List<Interface> interface_default = new ArrayList<Interface> ();

}

package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("21497187-b49d-4fd6-bb29-a22068b79ece")
public class ServiceLevelAgreement {
    @objid ("0ce4e1af-29d3-48d6-bb37-d9021da241a3")
    public List<Agreement> ApplicableContract = new ArrayList<Agreement> ();

    @objid ("c07d827b-edef-49b6-93c5-252c0a47bb2a")
    public List<Agreement> Agreement = new ArrayList<Agreement> ();

    @objid ("4a4c54ba-8b6e-4fb8-b814-009880d5662c")
    public Agreement LicensingAgreement;

    @objid ("3ac74bff-719c-459b-8f0f-5d854591c5e7")
    public List<Agreement> UmbrellaAgreement = new ArrayList<Agreement> ();

    @objid ("95077c7b-710c-4e11-a30b-df1c3f3bb315")
    public AmountType UsageCostAmount;

    @objid ("670e4476-6b4f-4fdb-99e5-c1a8a204bef3")
    public AmountType UsageUnitCostAmount;

    @objid ("26f3bf41-3680-44f6-a4ce-6aec4ea6209f")
    public AmountType CreationCostAmount;

}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("7f81c5f2-7064-4c61-9a33-38121ea57e99")
public class SummaryTextType {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("68bfe24e-9bc6-47bc-bb4f-cb4564f3c701")
public class Model {
}

package GRAUML.GRAAnnotationModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9a14b5ad-6538-47c0-bb30-1b9c04a65118")
public class AmountType {
}

package GRAUML.GRA_WSDL;

import GRAUML.GRAAnnotationModel.ServiceInterfaceSpecification;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("561f8913-4602-4f4c-afa8-ffb2f77cc09f")
public class WSDLServiceInterface extends ServiceInterfaceSpecification {
}

package GRAUML.GRA_WSDL;

import GRAUML.GRAAnnotationModel.Service;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("323ef444-26c8-4bf6-b930-177d6c80b037")
public class WSDLService extends Service {
}

package GRAUML.GRA_WSDL;

import GRAUML.GRAAnnotationModel.Port;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bfa54e39-1dbe-4789-b701-fe92e118afdb")
public class WSDLPort extends Port {
    @objid ("e6bac998-e22d-4cff-97f6-d2eb4e2697f8")
    public String certificate;

}

package GRAUML.GRA_WSDL;

import GRAUML.GRAAnnotationModel.Interface;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5a27f3da-6c99-4c4d-8aa3-9218f54c92f7")
public class WSDLInterface extends Interface {
    @objid ("acff6097-bb25-49ad-abde-5a3f4e99d9e3")
    public BindingType BindingCode = soap_12;

}

package GRAUML.GRA_WSDL;

import GRAUML.GRAAnnotationModel.Operation;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("15128077-ecd8-4b02-9b76-cced30cfddbd")
public class WSDLOperation extends Operation {
    @objid ("5fb26540-4ccd-4fab-af31-8e44470122fc")
    public OperationKind OperationKindCode = doc;

}

package GRAUML.GRA_WSDL;

import GRAUML.GRAAnnotationModel.Message;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0ad1b14e-8489-4f2b-81ae-8b9aa293992a")
public class WSDLMessage extends Message {
    @objid ("d51c671c-62fc-4f80-b4f1-79cd08e357ff")
    public MessageLocation MessageLocationCode = body;

    @objid ("96ef21af-3efa-4c9c-b58b-ede56fa6a460")
    public String encoding;

    @objid ("8adcbf99-50bc-43b6-9178-81c84366ca84")
    public String mimeType;

    @objid ("12104305-e9ff-460f-9cb6-2f39071d22ea")
    public String soapAction;

}

package GRAUML.GRA_WSDL;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5ae825e6-4ee6-4527-8fb5-c760ecaff25e")
public enum OperationKind {
    doc,
    rpc;
}

package GRAUML.GRA_WSDL;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9be91c83-58ab-450b-a2d1-a69314521546")
public enum MessageLocation {
    body,
    header,
    url;
}

package GRAUML.GRA_WSDL;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a8178296-2c01-4d49-8c50-f786c6795457")
public enum BindingType {
    soap,
    soap_12,
    http_get,
    http_put;
}

