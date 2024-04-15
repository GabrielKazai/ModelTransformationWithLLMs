import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aff8b23e-6f58-434e-b24d-62e7bbfe6483")
public class Job {
    @objid ("bbaf5ebc-1e3e-413b-be22-351579bd90d4")
    private long jobId;

    @objid ("19f3bcef-e224-43bb-a35a-16155922674d")
    private String jobTitle;

    @objid ("99cd9ea8-5f00-4f9a-b3ea-614deb9e0740")
    private long minSalary;

    @objid ("a6a01c1b-ae2a-433c-a1a8-3ea38361e815")
    private long maxSalary;

    @objid ("922fc40b-d3a6-4041-a96e-9f7af7430e6c")
    private List<Task> tasks = new ArrayList<Task> ();

}
