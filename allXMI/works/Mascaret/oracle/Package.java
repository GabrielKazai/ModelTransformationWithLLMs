import java.util.ArrayList;
import java.util.List;
import Signal;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("11e2753c-7628-4d4b-97bc-cb28f2547486")
public class Package extends Element {
    @objid ("f94b6e71-0323-41ec-977a-e597be7e0c8e")
    public List<Package> packages = new ArrayList<Package> ();

    @objid ("cecc85d0-f0d5-42ef-8e2a-0a32bffcab55")
    public Package parentPackage;

    @objid ("643b17ac-2f7f-4f55-b538-6f3ee8dfb5d7")
    public List<Class> classes = new ArrayList<Class> ();

    @objid ("15f8aa11-c7c2-44fc-9436-7dadb97ecabe")
    public List<Signal> signals = new ArrayList<Signal> ();

    @objid ("fbef54a9-8015-468d-9f45-ffd111fe2ea8")
    public void Package(final String name) {
    }

    @objid ("0b820c98-1f68-4180-ad57-2602929d3627")
    public String getFullName() {
        // TODO Auto-generated return
        return null;
    }

}
