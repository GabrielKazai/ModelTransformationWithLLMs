import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8a72c2a1-17b5-4199-b027-ee240abadabe")
public class ManyFoo {
    @objid ("816445c7-c3a6-4c3a-9d8a-5cde903611ad")
    public List<ManyFaa> faaOne = new ArrayList<ManyFaa> ();

    @objid ("be740253-4f55-422d-9fa1-a78ea43f6270")
    public List<ManyFaa> faaTwo = new ArrayList<ManyFaa> ();

}
