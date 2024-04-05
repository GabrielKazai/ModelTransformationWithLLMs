import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9fbe1a57-3253-447e-8d62-fda614a71511")
public class DesiredResult extends End {
    @objid ("d8c48e56-65b9-4f6d-9143-4b25bc95bcaf")
    public List<CourseOfAction> supportingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("ec35b448-fd56-42f5-a265-18701db2680d")
    public List<DesiredResult> broaderDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("124d5bef-530c-421f-9ac8-5eecb1037588")
    public List<Directive> supportingDirective = new ArrayList<Directive> ();

    @objid ("7e805d84-59e0-4f76-a6e1-39ac82d543b7")
    public List<DesiredResultCategory> categorizingDesiredResultCategory = new ArrayList<DesiredResultCategory> ();

    @objid ("98e21f41-7227-42dc-9f09-9a88a410fa61")
    public List<DesiredResult> moreSpecficDesiredResult = new ArrayList<DesiredResult> ();

}
