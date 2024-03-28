import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3e91453a-c9a3-4827-b27b-76e0cda6d10d")
public class Employee {
    @objid ("78dbba81-b38c-4ac2-b812-df96c207c569")
    public String Attribute;

    @objid ("8e5d0f2e-86d1-4c61-b94f-2bec3d1b029d")
    public List<Job> jobAssigne = new ArrayList<Job> ();

    @objid ("1f20f0c4-5690-44ea-a949-f1b3baf8a3a5")
    public List<Job> jobAFaire = new ArrayList<Job> ();

}
