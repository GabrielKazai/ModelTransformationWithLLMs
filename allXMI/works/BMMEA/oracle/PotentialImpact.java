import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0f54e56c-7f7b-43db-848a-a38eeb1feea8")
public class PotentialImpact extends MotivationElement {
    @objid ("0dfd45cc-f9c8-4222-98e1-f8c8388a48da")
    public List<Assessment> identifyingAssessment = new ArrayList<Assessment> ();

    @objid ("3b04dd05-a3f6-433e-9f5c-ccdfa91df317")
    public List<Directive> motivatedDirective = new ArrayList<Directive> ();

}
