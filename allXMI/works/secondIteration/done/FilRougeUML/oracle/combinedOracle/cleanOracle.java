
public class Competence {
    private int id;

    private String libelle;

    private boolean active;

    private Date dateCreation;

}

public class Personne {
    private int id;

    private String nom;

    private String prenom;

    private String email;

    private String img;

    private List<Competence>  = new ArrayList<Competence> ();

    private Droit droit;

    public List<Cursus> cursus = new ArrayList<Cursus> ();

    private Etat etatPersonne;

    public void ajouterCompetence() {
    }

    public void evaluerCompetence() {
    }

    public void Operation() {
    }

}

public class Droit {
    private int id;

    private String libelle;

    private int niveau;

}

public class Cursus {
    private int id;

    private Date annee;

    private String libelle;

    public List<Ecole> ecole = new ArrayList<Ecole>();

}

public class Ecole {
    private String nom;

    private String ville;

}

public class Note {
    private int note;

    private Personne evalue;

}

public class Projet {
    private int id;

    private String libelle;

    private String img;

    private Etat etat;

    private Etat recrutement;

    private WikiProjet wikiProjet;

    private WikiOfficiel wikiOfficiel;

}

public abstract class Wiki {
    private int id;

    private String contenu;

}

public class WikiProjet extends Wiki {
}

public class WikiOfficiel extends Wiki {
}

public abstract class Notification {
    private int id;

    private Date dateResolution;

}

public class Etat {
    private String ENUM;

}

public class NotificationAjoutComp extends Notification {
    private Competence competence;

    private Personne demandeur;

}

public class NotificationDemandeParticipation extends Notification {
    private Personne invite;

    private Projet projet;

}

public class NotificationInvitationProjet {
    private Personne invite;

    private Projet projet;

}
