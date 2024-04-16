import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f4897ed1-98f7-4255-9e35-8c8c36b97aa4")
public class Department {
    @objid ("a208975c-73a9-45da-a125-44ecfe5809d0")
    private long departmentId;

    @objid ("a6f65ae0-b851-4025-878f-25b5621c88d2")
    private String departmentName;

    @objid ("c5f292ef-81df-4b88-a8dd-52e1649ed939")
    private Location location;

    @objid ("f20d68bc-524a-46dd-9146-62d98b965e6b")
    private List<Employee> employees = new ArrayList<Employee> ();

}
