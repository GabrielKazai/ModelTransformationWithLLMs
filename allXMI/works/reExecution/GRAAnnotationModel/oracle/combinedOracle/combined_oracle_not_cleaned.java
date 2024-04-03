import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1123bac4-1bb4-4146-aea6-b73d302007ce")
public enum ExchangePattern {
    Enquiery,
    Subscription,
    Notification,
    Update,
    Message;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1d281203-530f-4857-a953-3182d58d7125")
public class InteractionRequirements {
    @objid ("25a66f25-df97-465a-acdb-8a4240d0ba85")
    public boolean ServiceConsumerAuthentication = true;

    @objid ("17e3bb77-d22d-411e-90fe-1a04cf41d2e5")
    public boolean ServiceConsumerAuthorization = true;

    @objid ("430916df-c2ab-4e8d-9378-3503e434bcff")
    public boolean IdentityAndAttributeAssertionTransmission = false;

    @objid ("10cbf1fa-21cf-40d6-8f91-f50898d85083")
    public boolean ServiceAuthentication = false;

    @objid ("2f3fb1a3-7e1f-4c0b-ad9b-d657e4b6618f")
    public boolean MessageNonrepudiation = true;

    @objid ("a0ad974f-a09a-4cce-b610-4317949a8c87")
    public boolean MessageIntegrity = true;

    @objid ("acee5d19-0b1e-4e1f-b0c3-60c9f1884c85")
    public boolean MessageConfidentiality = true;

    @objid ("3de85bf6-11ba-431b-b7bc-00ddc90b02d4")
    public boolean MessageAddressing = true;

    @objid ("8e313625-57ea-4897-9fb3-e612d78af2d4")
    public boolean Reliability = true;

    @objid ("309c0738-f336-4fbc-8e87-f26a3cc6e76f")
    public boolean TransactionSupport = false;

    @objid ("2a70b52c-f513-4b88-80a2-0c6ac2b70cbb")
    public boolean ServiceMetadataAvailability = true;

    @objid ("7408e66c-2fd4-459e-97da-8aac26181e8e")
    public boolean InterfaceDescriptionRequirements = true;

    @objid ("5379ddfe-4d67-4b25-81c8-8de0743c21a8")
    public boolean Logging = false;

    @objid ("ff06cfb2-6631-4850-86f8-aeb8318cdf4e")
    public String[] other_requirement;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("be071f2c-2537-4454-85bc-66ff3ee1d6de")
public abstract class GRAServiceAnnotationBase {
    @objid ("f3c9df4d-fab3-4c0f-8972-fafaeed88f9f")
    protected String Name;

    @objid ("e72d23a3-0e83-40f1-81e2-49b5a6cb7a4f")
    protected String Documentation;

    @objid ("0608ac4b-a024-4729-baa1-396f4ce36061")
    public String Template;

    @objid ("26156616-bf2a-45e8-bee4-a493c821fe73")
    public String[] flag;

    @objid ("716ba966-7302-4ecc-a333-77f789e0d174")
    private InteractionRequirements requirement;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1e2d15d9-57a8-4c85-89f3-731d25c18016")
public class Participant extends Organization {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("823777b2-03d4-4b3e-941c-52ce6a0494ec")
public class Interface extends GRAServiceAnnotationBase {
    @objid ("562242b4-8be9-4b54-992d-e55a7ab6cf08")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("0d55ebba-ed3c-4369-aff3-38b5d6bc736c")
    private List<Operation> operation = new ArrayList<Operation> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c3e2d9e9-e4ce-4784-b16d-985d07629f3f")
public class Service extends Participant {
    @objid ("79d75c78-e956-46a8-90af-68868c1c973b")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("790b00bf-a7ae-4ce4-b4a5-2ef9c4e0a8b5")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("0b8f086f-3d22-4a03-9630-edaa8eefcab5")
    private List<Interface> interface_default = new ArrayList<Interface> ();

    @objid ("c9c3e42f-ba7e-4caf-829e-ddaf1931bee2")
    private List<Port> port = new ArrayList<Port> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f5b34151-d508-4952-9712-ccd1d967b56f")
public class Operation extends GRAServiceAnnotationBase {
    @objid ("25945e14-a19b-4021-bb99-42dd55cad000")
    private ExchangePattern MessageExchangePattern;

    @objid ("7f233947-652f-459d-9f10-d495bb78acc3")
    protected Boolean isAsyncronous;

    @objid ("aefdad16-b651-4e97-a446-df4d1b20528f")
    private List<Message> message = new ArrayList<Message> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7ade32bc-489b-402b-b828-67b4238428dd")
public class Message extends GRAServiceAnnotationBase {
    @objid ("89e59114-0963-4b13-a77d-e624e72be4b5")
    protected MessageUse use;

    @objid ("3d071a45-79a9-435d-a639-ffe35d67c990")
    protected ModelReference type;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("828a7dcf-7a3d-4cad-b96e-f17dca44ee4e")
public class Port extends GRAServiceAnnotationBase {
    @objid ("4beefa71-68ca-43e8-a4d0-5a5c538effee")
    public String AddressURI;

    @objid ("bf07ce68-e7da-4f26-a0bf-2a0d8f56146a")
    private List<Interface> interface = new ArrayList<Interface> ();

    @objid ("8b16da48-9034-4fa3-b0e0-62efc7f3bbcb")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("c9e7360e-87f3-4697-8c74-4c85cdbe7472")
    private List<Message> message_default = new ArrayList<Message> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("868952d6-9a71-4a03-a789-44d1a6711280")
public class ModelReference {
    @objid ("c652c750-38f9-43e3-9efc-be24950fb637")
    protected String Name;

    @objid ("f00c0a07-ad91-463f-8b7e-859490c71d9b")
    protected String[] Documentation;

    @objid ("703bd724-372d-42d0-a0ac-fd1675d49fb3")
    protected String ElementID;

    @objid ("71942cf4-ed41-43e6-a03d-5245b586c1f3")
    protected String[] DiagramLink;

    @objid ("aeb86fb3-de1a-418a-9adf-df728f01114a")
    protected Model Model;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c614bc94-1707-40c5-aa5e-69b3ae814691")
public class ServiceInteraction extends GRAServiceAnnotationBase {
    @objid ("6ab60266-5e4e-4eb3-96c1-b19afa0f19d7")
    public List<Participant> participant = new ArrayList<Participant> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("82f4d0a9-78b8-4ae0-b7fd-c01c904067f3")
public class UseCase extends GRAServiceAnnotationBase {
    @objid ("3778c61a-ba43-433f-9cd5-60e734e41328")
    public List<Participant> provider = new ArrayList<Participant> ();

    @objid ("61e06f4d-b5ad-4b07-b860-4c56547c8ca2")
    public List<Participant> consumer = new ArrayList<Participant> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("782249a9-6d96-4cb0-a401-9bd55ae58f9a")
public enum MessageUse {
    in,
    out,
    inout,
    exception;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("365aa97c-7e27-4c89-b1dc-0573ed30f493")
public class Agreement {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b8670f55-f4ac-4c29-82cb-9f8ba4c24bcf")
public class IEPDReference {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("057c7f3c-fd2d-407f-bf96-00a927434ecd")
public class Organization extends GRAServiceAnnotationBase {
    @objid ("2315543e-6d91-4e8e-a80f-cbe7760d2660")
    public Person OrganizationPointOfContact;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1c22bc27-6926-4a52-97ca-d03e1028e250")
public class Person extends GRAServiceAnnotationBase {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a317a6b4-46d9-4fb6-b33e-cfae325a6033")
public class SecurityClassification {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5ee4c819-2428-416d-9e6b-490b54e1c7a2")
public class ServiceCapability {
}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3bba1bd0-3a6c-4a2d-844b-34677098b801")
public class ServiceIdentification extends GRAServiceAnnotationBase {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c63739ac-66cd-4757-a726-302a2cb2b60f")
public class ServiceInteractionProfile {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8442f240-e950-4879-8db4-7abb9275a087")
public class ServiceInterfaceSpecification extends GRAServiceAnnotationBase {
    @objid ("ecd67001-d60a-4b09-9b08-c80f461e323b")
    private List<Service> provider = new ArrayList<Service> ();

    @objid ("4bfea50d-5238-4484-b10c-8080e423a85d")
    private List<Operation> operation_default = new ArrayList<Operation> ();

    @objid ("4f5931c2-9eaa-4f61-96e3-604759c4d3ab")
    private List<Message> message_default = new ArrayList<Message> ();

    @objid ("eaccebfe-f650-48e9-ae18-5c6b0cb2ae39")
    private List<Port> port_default = new ArrayList<Port> ();

    @objid ("145e2c4d-46ad-4ef8-bea4-0f9b1535a953")
    public ServiceInteractionProfile ServiceInteractionProfile;

    @objid ("54ff9299-398f-45ca-b4f9-872fc4dfe698")
    private List<Interface> interface_default = new ArrayList<Interface> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("57f318ac-d8c1-4ac9-8e5e-0c253ac48bab")
public class ServiceLevelAgreement {
    @objid ("24a79690-ee82-46fc-a8da-6f5e86133b42")
    public List<Agreement> ApplicableContract = new ArrayList<Agreement> ();

    @objid ("cf0f1c50-c080-4e90-a528-4240e8b57687")
    public List<Agreement> Agreement = new ArrayList<Agreement> ();

    @objid ("920bb06c-8541-4653-9bf9-cd1eadfca149")
    public Agreement LicensingAgreement;

    @objid ("4fd5eb8d-2091-4471-937b-683d15e6e92d")
    public List<Agreement> UmbrellaAgreement = new ArrayList<Agreement> ();

    @objid ("e4046a96-1b18-4696-a91f-eb1b3f2e9aae")
    public AmountType UsageCostAmount;

    @objid ("f1c23e36-18c3-42b7-bcff-0aeec368d7f0")
    public AmountType UsageUnitCostAmount;

    @objid ("8445d12d-38c9-4e8f-9db1-80497ba30186")
    public AmountType CreationCostAmount;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ecaa6ce8-d87a-45c5-a085-5d68d5034b20")
public class Description {
    @objid ("2b8499a2-d002-4576-9750-fc89f36f1d6c")
    protected String Description;

    @objid ("862deaf8-b713-4f95-b454-938628c6e546")
    public String ExternalDocumentation;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2745b188-7c98-41cd-9f4a-3ad51a2efa45")
public class Model {
    @objid ("0bd42ce4-4b33-480d-9c62-aabf76e2b0d8")
    protected String ModelURI;

    @objid ("e5ca7f7c-8fbc-4599-b1c3-b7dd03f4022a")
    protected String label;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4e131a74-897b-4dc3-8468-b442c3d56999")
public class AmountType {
}

import ServiceInterfaceSpecification;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7d783816-7447-4b0b-a3f1-649464a38cfd")
public class WSDLServiceInterface extends ServiceInterfaceSpecification {
}

import Service;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e7ce6e8b-3121-48bc-b7ac-38920f0744a5")
public class WSDLService extends Service {
}

import Port;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3fa49019-b48f-4fba-bc1f-70867d2d9b93")
public class WSDLPort extends Port {
    @objid ("df944de3-1906-4146-9e89-f3d9379d7cb7")
    public String certificate;

}

import Interface;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b118a09e-e90d-4f81-b2e7-4aee72a65dab")
public class WSDLInterface extends Interface {
    @objid ("56b5abe9-65f4-43c0-b674-8a14e7cf9aa2")
    public BindingType BindingCode = soap12;

}

import Operation;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("85a61c05-3e58-44fd-a81c-dc0951a4a896")
public class WSDLOperation extends Operation {
    @objid ("cc669740-6863-4042-8885-7e027cda4c07")
    public OperationKind OperationKindCode = doc;

}

import Message;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("608c8ed9-a7dd-4e66-92b8-2904de96c323")
public class WSDLMessage extends Message {
    @objid ("249ad08b-a26b-4e12-8a8c-482c3e465ee3")
    public MessageLocation MessageLocationCode = body;

    @objid ("6c6a220f-7cf7-425c-be7b-8d74f426fc48")
    public String encoding;

    @objid ("3cf52cf0-d656-4be5-977b-0d444e1e65ed")
    public String mimeType;

    @objid ("e0e2ec45-8939-4637-abb8-d90731de1e34")
    public String soapAction;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e309136c-6552-4e3f-875d-2d14daea446b")
public enum OperationKind {
    doc,
    rpc;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("746834ae-6673-4711-869c-24f3bc98add1")
public enum MessageLocation {
    body,
    header,
    url;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0244e71e-5fc3-4ec4-8491-375972f089cb")
public enum BindingType {
    soap,
    soap12,
    http_get,
    http_put;
}

