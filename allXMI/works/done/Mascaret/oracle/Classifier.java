import java.util.ArrayList;
import java.util.List;
import Behavior;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("86e4cf1b-bfb1-4c66-b3ee-651414723116")
public class Classifier extends Element {
    @objid ("87f8d049-09a3-46b2-aea2-5ded39655f09")
    public boolean isAbstract;

    @objid ("ef00345f-c729-403e-afeb-dccbb57ed09c")
    public List<Classifier> chidren = new ArrayList<Classifier> ();

    @objid ("b2bc62a3-3cc7-4c4b-b5ec-497b92a5bf52")
    public List<Classifier> parents = new ArrayList<Classifier> ();

    @objid ("f5a70548-7e0c-43c0-beca-2c23715ac2ca")
    public List<Behavior> ownedBehavior = new ArrayList<Behavior> ();

    @objid ("e268ef2b-91a5-4eb8-a8af-d300d0d37cc0")
    public boolean isA(final Classifier classifier) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("bb46fc00-7248-4afc-8107-644151150ab0")
    public void Classifier(final String name) {
    }

}
