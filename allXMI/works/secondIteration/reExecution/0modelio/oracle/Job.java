import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3b9c2786-de78-4a73-b2a3-3bd6e920ffa6")
public class Job {
    @objid ("30a010d6-3dec-41d4-b018-2427b2d92517")
    private long jobId;

    @objid ("78714e3b-accf-4c5e-bb00-39fc4c0f2544")
    private String jobTitle;

    @objid ("a16420c4-e147-4743-b54f-3c4a7a1362bc")
    private long minSalary;

    @objid ("9252a285-b6ba-41d2-8545-5771e8943897")
    private long maxSalary;

    @objid ("0dd26a7e-d46e-49c9-b11e-a09d2c1d53e3")
    private List<Task> tasks = new ArrayList<Task> ();

}
