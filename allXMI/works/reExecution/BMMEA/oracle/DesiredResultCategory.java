import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("478b022f-45e5-472c-a925-7a6bf7d5e6c3")
public class DesiredResultCategory extends MotivationElement {
    @objid ("58f00afd-8dae-4334-a0b9-32ad71c03e8d")
    public List<DesiredResult> categorizedDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("f51fc2d0-8470-429c-bbb4-a001633aabbb")
    public List<DesiredResultCategory> broaderDesiredResultCategory = new ArrayList<DesiredResultCategory> ();

    @objid ("a222ce1d-9d11-4043-9bfa-b817a84f49f2")
    public List<DesiredResultCategory> moreSpecificDesiredResultCategory = new ArrayList<DesiredResultCategory> ();

}
