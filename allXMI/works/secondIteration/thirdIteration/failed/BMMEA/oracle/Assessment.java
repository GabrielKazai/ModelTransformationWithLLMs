import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a3e8ddb9-8b33-4b63-b56c-ccb015e22b34")
public class Assessment extends MotivationElement {
    @objid ("62dd4e57-6bb0-48ff-9085-6ec46f4659c7")
    public OrganizationUnit assessingOrganizationUnit;

    @objid ("91213e67-c779-4b79-9d54-98f3c9c68781")
    public List<AssessmentCategory> categorizingAssessmentCategory = new ArrayList<AssessmentCategory> ();

    @objid ("6818781a-08d4-41ae-a2f4-3b5d219035ca")
    public List<Assessment> usingAssessment = new ArrayList<Assessment> ();

    @objid ("4933c5aa-3a22-48d0-b2b4-21d75e4d14ca")
    public List<Means> affectedMeans = new ArrayList<Means> ();

    @objid ("ec211af1-988f-4ca9-b1b8-b3025aa576bf")
    public List<Directive> motivatedDirective = new ArrayList<Directive> ();

    @objid ("79f8f7e1-8a9b-481c-866a-465c71afca4d")
    public List<End> affectedEnd = new ArrayList<End> ();

    @objid ("0ad895b5-393d-40af-8ba0-1d1938c03030")
    public List<Assessment> usedAssessment = new ArrayList<Assessment> ();

    @objid ("683d9c10-8973-4797-a174-49dbadbce5a1")
    public Influencer judgedInfluencer;

    @objid ("e2d80a0e-1a42-4194-a40d-53b5b5d37288")
    public List<PotentialImpact> identifiedPotentialImpact = new ArrayList<PotentialImpact> ();

}
