import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("abe1333c-9fa1-4a48-a26d-1c21adbd9272")
class P_BMM_GENERIC_TYPE extends P_BMM_TYPE {
    @objid ("bf1be732-a9b6-4798-aa1b-f4e9d1baf98d")
    public String root_type;

    @objid ("11930be6-7c03-46aa-8fb6-f0c847359c44")
    public String[] generic_parameters;

    @objid ("a54a683b-9819-4c1c-94b9-49e2190c3aef")
    public List<P_BMM_TYPE> generic_parameter_defs = new ArrayList<P_BMM_TYPE> ();

    @objid ("ce4e81d7-8d6f-468f-b6af-cbbffbbb1c9b")
    public void generic_parameter_refs() {
    }

}
