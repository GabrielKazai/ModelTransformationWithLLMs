import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4c4e536b-8146-48b9-bf8c-63050ff8abfa")
public class Job {
    @objid ("08ea6d4c-2778-4670-8b30-949773d720c2")
    private long jobId;

    @objid ("1cf07534-24c5-4781-972f-c60bc4f14df2")
    private String jobTitle;

    @objid ("bc680fc9-baf2-4cc7-af4f-da9af77afeed")
    private long minSalary;

    @objid ("709e728a-150c-4ea0-bc35-c226f467f07f")
    private long maxSalary;

    @objid ("433c3545-2465-48ad-92f8-47526aa5602e")
    private List<Task> tasks = new ArrayList<Task> ();

}
