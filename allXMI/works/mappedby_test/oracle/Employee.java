import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f2130746-2902-4f1f-acd7-137c24281ae4")
public class Employee {
    @objid ("f4b2a568-efe8-4b1c-b68d-83afd63e0e3b")
    public String Attribute;

    @objid ("fd1f1656-baa4-428d-8b58-1d3e6cfe9f53")
    public List<Job> jobAssigne = new ArrayList<Job> ();

    @objid ("ef5e002c-1a8b-42dc-aad8-bc58406f4d9e")
    public List<Job> jobAFaire = new ArrayList<Job> ();

}
