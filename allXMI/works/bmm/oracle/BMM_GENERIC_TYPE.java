import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("31619257-2114-478b-b69b-f5c979574d4a")
class BMM_GENERIC_TYPE extends BMM_TYPE {
    @objid ("9d133e20-7f19-4fde-b335-f9727b0d7a35")
    public List<BMM_TYPE> generic_parameters = new ArrayList<BMM_TYPE> ();

    @objid ("81422845-559a-443d-9337-a57aeafa3e75")
    public BMM_GENERIC_CLASS base_class;

}
