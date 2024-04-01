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
