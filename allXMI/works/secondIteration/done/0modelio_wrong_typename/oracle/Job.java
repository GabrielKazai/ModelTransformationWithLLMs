import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b2d2b07d-f798-40a1-84d0-5354f8bc2032")
public class Job {
    @objid ("6751a1ab-a096-4bba-97a0-d87f88d55356")
    private long jobId;

    @objid ("7a1fea21-a220-4cb0-a66e-9a71bc1b80a0")
    private String jobTitle;

    @objid ("6d77b37c-81a1-4514-98a9-f07f7172aa8a")
    private long minSalary;

    @objid ("8bcb6433-8ded-4a8f-b084-4ac6b3e55964")
    private long maxSalary;

    @objid ("ccc462b8-b388-4c2e-a81f-0853fddfb92d")
    private List<Task> tasks = new ArrayList<Task> ();

}
