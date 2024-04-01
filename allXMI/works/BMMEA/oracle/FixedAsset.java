import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3fda1aee-4ef3-422e-bb4d-7faf185a2584")
public class FixedAsset extends Asset {
    @objid ("3263dd8b-1329-47c5-b039-04e23df09199")
    public List<Offering> usingOffering = new ArrayList<Offering> ();

    @objid ("8160ebde-2500-46e5-a98f-07589771b42c")
    public List<Resource> providedResource = new ArrayList<Resource> ();

}
