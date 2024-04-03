import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3478256b-c26b-4b86-92d7-f5e9b26200e1")
public class ManyFoo {
    @objid ("c829ecc5-5e3c-494b-b7e2-6ff2f1683a2b")
    public List<ManyFaa> faaOne = new ArrayList<ManyFaa> ();

    @objid ("ef666605-4ffe-40d3-8136-84045522f1f7")
    public List<ManyFaa> faaTwo = new ArrayList<ManyFaa> ();

}
