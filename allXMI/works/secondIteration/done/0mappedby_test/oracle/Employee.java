import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2953b869-7b87-4d50-9dc8-60f18c81c09e")
public class Employee {
    @objid ("5f17faea-5d8f-4f1e-97bd-7c70aa4e8e47")
    public String Attribute;

    @objid ("f86ebd21-5b5a-4736-a09e-b31d516ad3bd")
    public List<Job> jobAssigne = new ArrayList<Job> ();

    @objid ("435df9d5-609f-41be-8cb1-4c2b881c8dc9")
    public List<Job> jobAFaire = new ArrayList<Job> ();

}
