import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c274f534-f607-44b6-a559-d14d8d0991eb")
class P_BMM_CLASS extends P_BMM_CLASSIFIER {
    @objid ("001283bd-1da5-4746-842a-8bd8ae85189e")
    public int uid;

    @objid ("29766d5a-0847-446b-9005-c62843e12a23")
    private String name;

    @objid ("e19716c2-4358-47b5-9b7b-ad4b474cb3cc")
    public String[] ancestors;

    @objid ("bcf92735-88c9-4d79-a63f-b8664ba3ca6b")
    public Boolean is_abstract;

    @objid ("2dd64ca0-06f5-4bc3-96fe-508cae3ce304")
    public Boolean is_override;

    @objid ("826df87c-63c9-4a0d-bd53-8732c56f41dd")
    public String source_schema_id;

    @objid ("daac5c2a-0df8-4e3d-be84-9335be315110")
    public List<P_BMM_PROPERTY> properties = new ArrayList<P_BMM_PROPERTY> ();

    @objid ("6ceb97a9-50b2-4fd3-ab53-707203d5a256")
    public List<P_BMM_GENERIC_PARAMETER> generic_parameter_defs = new ArrayList<P_BMM_GENERIC_PARAMETER> ();

    @objid ("e0531d02-8115-4aee-9b84-5fca788a7576")
    public boolean is_generic() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("0577a987-c501-44c3-bab4-4156a41c893a")
    public void create_bmm_class_definition() {
    }

    @objid ("92de45bf-e580-4b7b-be51-a2175b3b1a0d")
    public void populate_bmm_class_definition() {
    }

}
