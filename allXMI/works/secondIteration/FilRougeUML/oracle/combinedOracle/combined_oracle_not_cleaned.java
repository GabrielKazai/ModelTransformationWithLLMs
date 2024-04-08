import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fb3549b4-cae2-484f-a449-fae382cd4563")
public class Competence {
    @objid ("51fd0ccb-d635-494f-94c9-087adf10c787")
    private int id;

    @objid ("c64bd611-d235-4fdd-b37f-fe52311b92cd")
    private String libelle;

    @objid ("b9b89832-1bfb-41df-9314-322605fd9382")
    private boolean active;

    @objid ("09819234-e80f-4dc2-85e8-44f83f8782f0")
    private Date dateCreation;

}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("78ef30b0-7694-42ee-b2c3-ee0ccd4bd847")
public class Droit {
    @objid ("431aa8ff-fb17-450b-a8a1-ed6f659cb947")
    private int id;

    @objid ("1875af85-bc66-446f-a2a7-4ee12ad1958e")
    private String libelle;

    @objid ("0779795b-7aee-4d28-92e0-c2bd8162830a")
    private int niveau;

}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4ca78f29-4016-40c0-a6ca-8db4492f531b")
public class Cursus {
    @objid ("78f2579f-1036-4311-9411-603515b52133")
    private int id;

    @objid ("02fd5968-1114-43ee-93f8-59a3332fb19e")
    private Date annee;

    @objid ("90755fb9-7b27-4964-99b0-ac99be5ef697")
    private String libelle;

    @objid ("50c163b5-1690-46da-9df7-0d415967e8db")
    public List<Ecole> ecole = new ArrayList<Ecole> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eab7e1fc-3e39-4079-b6a0-827aed59ec2f")
public class Ecole {
    @objid ("9ca3dae8-9478-4630-a6ee-87f424110106")
    private String nom;

    @objid ("d4a21f89-d16f-48a7-b849-165cf6ecf57f")
    private String ville;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b3fab1f1-fc9d-4f05-9e3f-1bbd0945b36a")
public class Note {
    @objid ("a03b17bb-d6a9-405b-a183-4ee75b47458c")
    private int note;

    @objid ("87671e91-4cf9-4a73-b59e-17196dc42672")
    private Personne evalue;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("62ac0e87-19f7-424b-8546-3b9cc5c01922")
public class Projet {
    @objid ("487ce120-5f75-4f15-9670-12bc79db3f58")
    private int id;

    @objid ("cd20eb10-9122-445c-9c07-79c4dfd65ede")
    private String libelle;

    @objid ("3ff0ad89-3d67-4bd1-a431-ef8f77c47797")
    private String img;

    @objid ("a024efcb-c171-4a82-b8b4-52cb3e73c798")
    private Etat etat;

    @objid ("c011b2bc-0690-430e-8231-a3ca41a30329")
    private Etat recrutement;

    @objid ("adf8b3cc-c663-4e04-8b00-38a6c1f16ef2")
    private WikiProjet wikiProjet;

    @objid ("d5c1692d-44e5-4dcd-80ca-82a5386aa4d5")
    private WikiOfficiel wikiOfficiel;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("49631e46-fab9-409a-9cbf-c472964d9b34")
public abstract class Wiki {
    @objid ("32480d26-091e-4cfa-b542-5cb70ec5f3b4")
    private int id;

    @objid ("c7f61a7f-7d21-4109-93f2-df70eaa71eca")
    private String contenu;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1adafc4a-21f4-41d9-b641-9de5f0b4ec66")
public class WikiProjet extends Wiki {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a1cd3d76-8b5e-4a0c-80f1-71842749ff8d")
public class WikiOfficiel extends Wiki {
}

import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fb591d61-4f92-46ba-898c-faa5ec5bd816")
public abstract class Notification {
    @objid ("b98652d3-add4-4557-83e8-35aeceb222a1")
    private int id;

    @objid ("260cf9b4-2b3c-43d6-b9ce-864ebb6161a1")
    private Date dateResolution;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ed06a624-4373-477c-b512-e10a261ac35e")
public class Etat {
    @objid ("defa6d10-32ab-4ac4-8f61-bd7ed6cec065")
    private String ENUM;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("58f8d242-3e7c-46bb-993e-0747916466e0")
public class NotificationAjoutComp extends Notification {
    @objid ("8496dff6-71e1-40e0-9d31-1ec522662aaf")
    private Competence competence;

    @objid ("f1cb0ece-6dbb-4fe2-b515-0c39c6b4b2c8")
    private Personne demandeur;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("07e14a7a-1ff8-412f-b184-6541b71ec9d9")
public class NotificationDemandeParticipation extends Notification {
    @objid ("1588a94f-fd34-49f2-8f29-1115bca7ea00")
    private Personne invite;

    @objid ("7d95f4c5-f2d7-40d1-8476-169ed540ac27")
    private Projet projet;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0dacc4b7-ef0b-439e-9609-3a5fcda444c0")
public class NotificationInvitationProjet {
    @objid ("167b20f1-542e-4e28-9fe4-45a0f637aabb")
    private Personne invite;

    @objid ("0d9d71ee-acfc-43cf-8841-86972d96390f")
    private Projet projet;

}

