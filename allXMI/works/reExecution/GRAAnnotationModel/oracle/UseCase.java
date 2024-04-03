import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("82f4d0a9-78b8-4ae0-b7fd-c01c904067f3")
public class UseCase extends GRAServiceAnnotationBase {
    @objid ("3778c61a-ba43-433f-9cd5-60e734e41328")
    public List<Participant> provider = new ArrayList<Participant> ();

    @objid ("61e06f4d-b5ad-4b07-b860-4c56547c8ca2")
    public List<Participant> consumer = new ArrayList<Participant> ();

}
