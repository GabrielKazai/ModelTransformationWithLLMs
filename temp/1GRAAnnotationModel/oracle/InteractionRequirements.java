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
