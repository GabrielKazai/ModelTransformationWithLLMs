import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d9beadab-d802-4569-a188-2d57b8ef0c0b")
public class Department {
    @objid ("8e0cf127-0a97-43ff-88fa-82659f9041f6")
    private long departmentId;

    @objid ("17aec57e-6c4a-435c-9ace-4a85b3d449bb")
    private String departmentName;

    @objid ("681dcda1-114a-462e-a637-ad850e3ae9e0")
    private Location location;

    @objid ("aef7731c-1b7e-4d5c-b32e-30eb18580506")
    private List<Employee> employees = new ArrayList<Employee> ();

}
