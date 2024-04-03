package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c76ce48a-ae90-48cf-a371-3275de1a569e")
public class UseCase extends GRAServiceAnnotationBase {
    @objid ("0ceb9786-68b5-4585-9f35-863795dac4f3")
    public List<Participant> provider = new ArrayList<Participant> ();

    @objid ("1e45fe1d-e608-4b50-8e0a-2b531f9b7492")
    public List<Participant> consumer = new ArrayList<Participant> ();

}
