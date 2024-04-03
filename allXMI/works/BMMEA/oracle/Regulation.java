import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("47e81527-358b-4954-a3e7-ba8948c0774c")
public class Regulation extends ExternalInfluencer {
    @objid ("e7278f33-134f-42f7-9005-42e43a67b0c0")
    public List<Directive> regulatingDirective = new ArrayList<Directive> ();

}
