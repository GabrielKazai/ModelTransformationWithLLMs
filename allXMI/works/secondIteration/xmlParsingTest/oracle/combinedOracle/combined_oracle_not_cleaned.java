import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("25eb4fdd-af82-4326-849d-07e0c74aa457")
class Theme {
    @objid ("acf1ed17-9dad-42f3-824f-8b55b91cee33")
    public String libelle;

    @objid ("0e878143-c250-4ffa-b65d-e5685ce3906e")
    public int identifiant;

    @objid ("ba5d8f78-9fff-4e5d-b5f5-03453de144c7")
    private List<Produit> [[GabrielRonnie]]  = new ArrayList<Produit> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ee0f089d-e068-4d5e-848b-c3006ed94f0a")
class Client {
    @objid ("124d088c-9202-4efc-8d85-4f1ef694696e")
    public void achete(final Produit p, boolean r) {
    }

}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("38e389f3-7eec-43e9-8538-81f13f44b400")
class IAction {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("dd4459a3-ae54-4f34-a399-b2f12c629d6a")
class Facture {
    @objid ("d85a82e9-c6cd-4afd-b32d-9aeb751ef8ee")
    public void valorise(final IAchat toto) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("560a9535-df98-4356-916a-dcb0db608ad5")
    public static void getId(int [[GabrielRonnie]]) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e5647a75-5032-4740-9791-58f88066ee20")
public class Folder {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("64cffef7-04f6-4537-b129-80a5876d86c2")
public class void {
}

