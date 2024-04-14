import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c4536eaf-0c2d-4ff8-9daa-5ba28bfab191")
public class Job {
    @objid ("d2bc1b35-a7a5-4da9-adb8-bdf43ef10623")
    private long jobId;

    @objid ("6aedeeb0-da02-4d85-9ff2-b15dd771fc42")
    private String jobTitle;

    @objid ("823e723d-9dee-49fe-b403-c1419f83d728")
    private long minSalary;

    @objid ("faa54788-335d-4df7-a6cb-bdef602fef6e")
    private long maxSalary;

    @objid ("c57f171b-2a25-469a-8d75-703cbfed6176")
    private List<Task> task = new ArrayList<Task> ();

}
