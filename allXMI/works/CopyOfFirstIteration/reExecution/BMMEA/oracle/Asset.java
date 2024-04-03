import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("acb729bc-16b4-4007-82e8-5cfaa2920437")
public class Asset extends MotivationElement {
    @objid ("dce4860e-27aa-4a19-a746-7fb587cfe2be")
    public List<BusinessProcess> deliveredOffering = new ArrayList<BusinessProcess> ();

    @objid ("9d54443d-fa8e-402f-a42a-8edd4df9b06b")
    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("e0e761e5-2634-4eeb-afa7-2c2cf26513c6")
    public List<Directive> governingDirective = new ArrayList<Directive> ();

    @objid ("da2bf98d-164e-4285-a820-bc0e37407537")
    public List<CourseOfAction> deployingCourseOfAction = new ArrayList<CourseOfAction> ();

}
