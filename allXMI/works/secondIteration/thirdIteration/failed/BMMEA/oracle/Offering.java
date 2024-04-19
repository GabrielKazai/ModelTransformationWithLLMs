import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("463074b4-19c4-4af7-ac3f-254d31deabeb")
public class Offering extends FixedAsset {
    @objid ("3a1cdd46-3ee3-44bb-a924-1d35821530de")
    public List<BusinessProcess> deliveringBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("7f45be68-755a-49ca-8697-c8c73efbfcd8")
    public List<CourseOfAction> definingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("baec50b2-dfd0-44b1-95d6-f12e6af14698")
    public List<FixedAsset> usedFixedAsset = new ArrayList<FixedAsset> ();

    @objid ("4cd3bde3-6791-40b8-92c0-9607faa31d54")
    public List<Resource> requiredResource = new ArrayList<Resource> ();

}
