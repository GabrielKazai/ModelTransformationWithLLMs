import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3e11f7a3-dddc-4682-97fe-d8b1a7d70965")
public class CourseOfAction extends Means {
    @objid ("6e7da5f1-80a2-4a58-a514-cd92a312ba5c")
    public List<Asset> deployedAsset = new ArrayList<Asset> ();

    @objid ("a56af205-c0e7-4ad3-919f-dbb817e1fcc4")
    public List<BusinessProcess> realizingBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("89e450db-0059-40a9-9add-76ea55f61aa9")
    public List<Directive> governingDirective = new ArrayList<Directive> ();

    @objid ("73b6d792-b0c9-441e-b4d1-32a8674f68c3")
    public List<CourseOfAction> enablingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("b603fb17-259f-4b3d-958d-1c9d24259a25")
    public List<CourseOfAction> broaderCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("40df367b-8540-48cf-86e7-95c14f9955c5")
    public List<Directive> baseDirective = new ArrayList<Directive> ();

    @objid ("3b20d778-6426-4790-961a-94bbc59da172")
    public List<DesiredResult> supportedDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("9c63be25-e5a2-4e2e-a4f8-2d1d6ae66ac0")
    public List<CourseOfAction> enabledCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("b454d632-90e8-4eec-b379-77c77ca16f55")
    public List<Liability> dischargedLiability = new ArrayList<Liability> ();

    @objid ("3c685cb0-4fba-429d-9c84-8d1b37d15c37")
    public List<Offering> definedOffering = new ArrayList<Offering> ();

    @objid ("46c95fdf-8b3d-4f42-91e2-8e874cc24402")
    public List<CourseOfAction> moreSpecificCourseOfAction = new ArrayList<CourseOfAction> ();

}
