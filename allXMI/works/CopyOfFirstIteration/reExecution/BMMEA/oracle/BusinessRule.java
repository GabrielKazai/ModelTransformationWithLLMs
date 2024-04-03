import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("97668dd5-6bdf-4845-bcf2-edff0883f8ee")
public class BusinessRule extends Directive {
    @objid ("d2cbb052-f47d-49ff-b54a-d1e99cd2d25a")
    public List<BusinessPolicy> baseBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("4c1b935d-5785-4ade-838a-1a382c4d8c29")
    public List<BusinessProcess> guidedBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("f9a33227-9329-4c6c-aaab-adaf27a066ae")
    public List<Tactic> effectingTactic = new ArrayList<Tactic> ();

}
