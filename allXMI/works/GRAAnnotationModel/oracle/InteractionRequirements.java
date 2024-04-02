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
