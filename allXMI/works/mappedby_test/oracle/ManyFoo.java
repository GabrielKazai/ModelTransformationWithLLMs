import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4482e49c-af88-485e-a3d9-3db002794c13")
public class ManyFoo {
    @objid ("35acf41d-b3cf-4383-ac7c-0976f07a290c")
    public List<ManyFaa> faaOne = new ArrayList<ManyFaa> ();

    @objid ("6abca0cf-b1a9-4eb0-8508-402af4716fdf")
    public List<ManyFaa> faaTwo = new ArrayList<ManyFaa> ();

}
