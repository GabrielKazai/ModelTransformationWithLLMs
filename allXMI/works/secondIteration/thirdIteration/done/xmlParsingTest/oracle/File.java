import java.util.ArrayList;
import java.util.List;
import Folder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f3e893bb-7365-46b6-86d9-18fe2070a602")
class File {
    @objid ("5633084c-8dcd-4a2d-988c-59d08512f1ac")
    private Client client;

    @objid ("7e2a164a-38b8-4003-949e-881341fd1833")
    protected Folder[] dossiersCibles;

    @objid ("7d3c74e7-3835-46a6-bf48-ca2a8ffc0840")
    private static float ClassifierId = -45.254;

    @objid ("f0b19068-2e96-400a-a6af-728a0d1ad124")
    private List<Produit> produitsAchetes = new ArrayList<Produit> ();

}
