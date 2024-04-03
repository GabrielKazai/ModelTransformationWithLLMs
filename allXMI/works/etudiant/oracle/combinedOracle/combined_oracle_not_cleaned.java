import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import void;

@objid ("3c5aa507-3f80-4a05-a334-c4890d52498a")
class Etudiant extends Personne {
    @objid ("d28a012f-626b-43fe-830a-1fe75e1a6c3a")
    private List<Universite>  = new ArrayList<Universite> ();

    @objid ("05a18a76-a48d-4714-a106-66962d32b97e")
    public void reviser(final String matiere) {
        // TODO Auto-generated return
        return null;
    }

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d6ad9ff7-fc55-4aa4-989b-aa5e73815992")
class Universite {
    @objid ("87a2264c-91b5-4245-b443-8194e36f9419")
    private String nomUniversite;

    @objid ("e7bd2282-283d-40dd-9897-ca5a0eb7f350")
    private List<Etudiant>  = new ArrayList<Etudiant> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2147a611-310c-42ab-a233-0f3967e1b541")
class Personne {
    @objid ("13fbefc6-5d4b-4a12-a032-be6a00660dbb")
    private String nomPersonne;

    @objid ("1f43dff5-47cb-4c8e-9485-05dc1494100a")
    private String prenomPersonne;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("4fc430e0-0d4b-41bb-b4a8-e40a9d5cf1a0")
public class void {
}

