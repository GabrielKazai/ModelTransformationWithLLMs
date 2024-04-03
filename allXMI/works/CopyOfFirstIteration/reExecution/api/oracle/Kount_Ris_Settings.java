import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c3b53d4e-e5c3-430d-a4ba-47997373b003")
interface Kount_Ris_Settings {
    @objid ("64de0f48-8040-4058-b4da-0cecfa9052d1")
    int getMerchantId();

    @objid ("d3c137ac-41ff-41a2-9932-347cdf30cd10")
    String getRisUrl();

    @objid ("d178fd2f-060e-4941-a395-17e7269d79f3")
    String getX509CertPath();

    @objid ("6ae26f81-4f65-42ea-a6ff-38d7fd54c246")
    String getX509KeyPath();

    @objid ("a1d780bf-7601-411e-84ca-9b85c5a97b66")
    String getX509Passphrase();

    @objid ("28572214-3b72-498f-8198-7c6ad11763c1")
    int getConnectionTimeout();

    @objid ("bb8ed1db-95ee-4e72-a57c-37d4785e613a")
    String getApiKey();

}
