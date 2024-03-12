import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b09bfb5b-9e23-4e4f-8ee7-953fd7184e08")
public class Department {
    @objid ("e19aa21a-ddc7-4a3c-bd3e-8783c49f8ef8")
    private long departmentId;

    @objid ("3a4c2e1f-65c6-479f-a954-144c1abc36c2")
    private String departmentName;

    @objid ("5e0fa046-7eba-45fe-8a3a-49d5e6809dce")
    private Location location;

    @objid ("f0dbe61b-a77f-4c91-a5b8-fe78130e9583")
    private List<Employee> employees = new ArrayList<Employee> ();

}
