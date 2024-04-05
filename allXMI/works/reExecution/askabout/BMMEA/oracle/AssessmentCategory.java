import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("20d14ba8-439d-4c86-9279-58ae0bfa4ff2")
public class AssessmentCategory extends MotivationElement {
    @objid ("9ce30d83-3260-4d26-8932-71ce13cd1970")
    public List<Assessment> categorizedAssessment = new ArrayList<Assessment> ();

    @objid ("cd311c46-eaa3-44f0-b097-1b9c69ffc3a7")
    public List<AssessmentCategory> broaderAssessmentCategory = new ArrayList<AssessmentCategory> ();

    @objid ("b779b749-9a41-4bb4-853f-4fb08b911a81")
    public List<AssessmentCategory> narrowerAssessmentCategory = new ArrayList<AssessmentCategory> ();

}
