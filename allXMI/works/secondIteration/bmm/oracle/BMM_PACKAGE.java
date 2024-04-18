import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("caad2963-7a32-4e31-8612-3f056841eeb4")
class BMM_PACKAGE extends BMM_PACKAGE_CONTAINER {
    @objid ("a2153959-cb9d-40f0-98a7-f801cf0a9104")
    public String name;

    @objid ("bb5b6e94-31b6-414e-9747-846d3dda804a")
    public List<BMM_CLASS> classes = new ArrayList<BMM_CLASS> ();

    @objid ("c617d504-129a-4ccb-9c14-49e2c1c230e2")
    public List<BMM_CLASS> root_classes() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("e808e74d-e441-4252-abb2-1f6739ee1baf")
    public String path() {
        // TODO Auto-generated return
        return null;
    }

}
