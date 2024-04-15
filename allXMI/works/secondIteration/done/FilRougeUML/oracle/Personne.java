import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b5006be5-caad-4297-8d30-ab2c06478935")
public class Personne {
    @objid ("bae97617-bde5-41df-b6cd-65f7052ffbbe")
    private int id;

    @objid ("c1da4836-c98c-4517-a442-2bda0d66eacb")
    private String nom;

    @objid ("a32a3826-b709-4a71-8868-8c51f17b2f6b")
    private String prenom;

    @objid ("e5e81a7a-ad57-4091-afea-3eb9c04e2339")
    private String email;

    @objid ("06e6170b-86f7-489a-8ac9-c00dc54c03a7")
    private String img;

    @objid ("ca2a92a9-c309-4f64-8932-39084103dd5a")
    private List<Competence>  = new ArrayList<Competence> ();

    @objid ("44e7ef50-d466-4f28-bbfe-6d251f7fb48e")
    private Droit droit;

    @objid ("11b038e4-b4ad-4f86-a43e-8db80589a4b2")
    public List<Cursus> cursus = new ArrayList<Cursus> ();

    @objid ("51501dc9-f520-4aa2-885c-4bb7395ebc12")
    private Etat etatPersonne;

    @objid ("a0909c5f-568a-478a-910b-2ed56e2bcf93")
    public void ajouterCompetence() {
    }

    @objid ("321c1930-ea19-42ee-8713-6614f9c09cd5")
    public void evaluerCompetence() {
    }

    @objid ("373a474f-4ed1-4572-a276-844b3e6356b3")
    public void Operation() {
    }

}
