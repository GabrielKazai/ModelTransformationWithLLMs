import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("763c70c8-f76b-49a6-8bc7-38ecfe6406b6")
public class Employee {
    @objid ("0a0d1496-f6ff-4522-8b6c-632d3e57eca3")
    private long employeeId;

    @objid ("f9e0675d-717e-454c-a7f2-fa80dacb3809")
    private String firstName;

    @objid ("54c09f1c-fcee-41a5-a174-d0059ed15d8e")
    private String lastName;

    @objid ("4c1997be-2699-445e-9490-0f78f563e07c")
    private String email;

    @objid ("47e415b7-7e73-4efc-bebf-b86e3a84a752")
    private String phoneNumber;

    @objid ("fcc11e6b-a60c-4f9f-8efa-7ef80e47f174")
    private zonedDateTime hireDate;

    @objid ("4e7809e7-28fc-40b7-b0e9-2f59cb7fa290")
    private long salary;

    @objid ("430a2232-5afc-4153-b363-71d58284329c")
    private long commissionPct;

    @objid ("2a66d1e4-682a-4832-8084-01eedd1b0655")
    private List<Job> job = new ArrayList<Job> ();

    @objid ("8f143b16-50f9-4b46-a476-3c150159315d")
    public Employee manager;

}
