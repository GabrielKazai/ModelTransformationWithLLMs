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
