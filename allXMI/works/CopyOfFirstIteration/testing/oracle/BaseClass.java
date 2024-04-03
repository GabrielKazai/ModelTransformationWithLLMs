import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1362be01-e2f9-4c82-af2d-1a1ed65951b4")
public abstract class BaseClass {
    @objid ("16b43c5e-df22-465c-a662-9b7263c2bbd9")
    public boolean readWriteSingleValuedPrimitiveAttribute = true;

    @objid ("c80fb024-00cb-49e9-a608-ef578d797241")
    public boolean[] slot;

    @objid ("a6699e24-5cbe-462e-9802-110eddf2685a")
    public List<Boolean> readWriteDerivedAttribute() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("7ac8f990-79d0-461a-8e39-8e3a09f57335")
    public List<Boolean> readOnlyDerivedAttribute() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("198872b4-0ff7-4bf9-951c-88d5172b5cc6")
    public List<Boolean> aRealOperation() {
        // TODO Auto-generated return
        return false;
    }

}
