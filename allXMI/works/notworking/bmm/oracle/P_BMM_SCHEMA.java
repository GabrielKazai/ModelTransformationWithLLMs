import java.util.ArrayList;
import java.util.List;
import P_BMM_SCHEMA;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("edc3703c-853e-4acf-a676-541cf8b282fe")
class P_BMM_SCHEMA extends P_BMM_PACKAGE_CONTAINER {
    @objid ("785b562d-a859-499c-8b6a-0e9b7795ab70")
    public String bmm_version;

    @objid ("42bf17a5-dccb-4b7e-979e-600986a3d081")
    public int state;

    @objid ("c9860c74-0616-4f74-b5a5-6b58c1da6a3c")
    public BMM_SCHEMA bmm_schema;

    @objid ("0f8b9b22-a3f5-49e0-8bdb-62b8d0610f15")
    public List<P_BMM_CLASS> primitive_types = new ArrayList<P_BMM_CLASS> ();

    @objid ("5574b31d-305a-4e5c-a09f-c56aaec0139d")
    public List<P_BMM_CLASS> class_definitions = new ArrayList<P_BMM_CLASS> ();

    @objid ("fe3bf43f-3036-45b5-9c7f-4cff974a58e8")
    public List<P_BMM_PACKAGE> canonical_packages = new ArrayList<P_BMM_PACKAGE> ();

    @objid ("cc7e0aa2-f854-4125-b37f-a11c05e79ae8")
    public void validate_created() {
    }

    @objid ("857b2bc2-e88d-46e2-90f8-4c894d742502")
    public void load_finalise() {
    }

    @objid ("96459788-4d62-4964-9e4a-9a2cc2043278")
    public void merge(final P_BMM_SCHEMA other) {
    }

    @objid ("dd2fa403-9819-45ff-ae1c-de7f3b931fd4")
    public void validate() {
    }

    @objid ("3f8f7aca-9f74-4ce9-accf-a74848b1da8c")
    public void create_bmm_schema() {
    }

}
