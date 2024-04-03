import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8391d938-4771-4746-a9cb-07db82bd1761")
public class Department {
    @objid ("e5fc4b12-5949-4595-a9bd-a89a603e2b86")
    private long departmentId;

    @objid ("c296e4ac-6fec-4f0e-9a6e-c68b6d08d868")
    private String departmentName;

    @objid ("3e638615-4d1e-46ee-ba71-093b0573c127")
    private Location location;

    @objid ("8702c40f-a888-4c66-a69b-eda0461c957a")
    private List<Employee> employees = new ArrayList<Employee> ();

}
