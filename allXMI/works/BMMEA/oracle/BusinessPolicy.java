import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("22cb9243-014f-4784-b78f-bf1ab7d0b0b9")
public class BusinessPolicy extends Directive {
    @objid ("496c99e7-6ab5-4e18-a605-56b2bed51e69")
    public List<BusinessPolicy> broaderBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("0992af27-980f-481b-a296-7759d3068a69")
    public List<BusinessRule> derivedBusinessRule = new ArrayList<BusinessRule> ();

    @objid ("4872e6d6-5211-4da8-9982-ac56dba0b285")
    public List<BusinessPolicy> moreSpecificBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("33fc3582-977c-4127-9275-7e47b3b1ec79")
    public List<BusinessProcess> governedBusinessProcess = new ArrayList<BusinessProcess> ();

}
