import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3fccd616-542d-46ba-8cfe-2c73f931c60e")
public class Directive extends Means {
    @objid ("f698a151-2505-40fc-9d55-59c6f357987c")
    public List<Assessment> motivatingAssessment = new ArrayList<Assessment> ();

    @objid ("45a12d7b-9fbd-42a4-bb60-4cc0127051d5")
    public List<Asset> governedAsset = new ArrayList<Asset> ();

    @objid ("e6712225-db3b-4f50-98df-91545e9e1259")
    public List<CourseOfAction> governedCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("64ed02f7-331e-47d3-a163-c9362703f0e5")
    public List<CourseOfAction> derivedCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("1a48e975-84c5-4d48-be55-d2a9ab1f8130")
    public List<DesiredResult> supportedDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("c24b0ed4-5286-428f-93b5-77c002e48860")
    public List<PotentialImpact> motivatingPotentialImpact = new ArrayList<PotentialImpact> ();

    @objid ("d96bf64e-f1d1-4ace-8087-f70ebd617ed4")
    public List<Regulation> directiveRegulation = new ArrayList<Regulation> ();

}
