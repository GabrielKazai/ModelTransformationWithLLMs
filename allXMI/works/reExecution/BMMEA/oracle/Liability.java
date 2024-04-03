import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2f10fd66-9ad7-4fb2-8840-adc1c4f39ece")
public class Liability extends MotivationElement {
    @objid ("eac5f422-ea51-4d97-a3fa-6646d7088f39")
    public List<CourseOfAction> dischargingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("31e6901f-68f0-4e8f-9263-0f56c7e6e109")
    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("c1499e7a-1e59-4a93-b9de-e788efc3512b")
    public List<Resource> claimedResource = new ArrayList<Resource> ();

}
