import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c728a440-514d-4dc1-893f-681edd81cfda")
abstract class BMM_TYPE extends BMM_CLASSIFIER {
    @objid ("2850be56-4c31-4103-8b79-dbe3a4e8257c")
    public abstract BMM_CLASS base_class();

    @objid ("abdd8613-c747-415b-9027-d4f42d07218d")
    public abstract boolean has_type_substitutions();

    @objid ("9f169dbb-7b68-4ca5-b3a6-c05fb55ebba1")
    public abstract List<String> type_substitutions();

    @objid ("da49b331-879a-493c-aa6a-e25280e9770d")
    public String as_display_type_string() {
        // TODO Auto-generated return
        return null;
    }

}
