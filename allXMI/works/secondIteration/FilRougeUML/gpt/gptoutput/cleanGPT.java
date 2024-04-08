public class Competence {
    private final long id;
    private final String libelle;
    private final boolean active;
    private final Date dateCreation;
}

public class Personne {
    private final long id;
    private final String nom;
    private final String prenom;
    private final String email;
    private final String img;
    private Droit droit;
    private List<Cursus> cursus;
    private Etat etatPersonne;
    private List<Competence> competences;

    public void ajouterCompetence() {
    }

    public void evaluerCompetence() {
    }

    public void Operation() {
    }
}

public class Droit {
    private final long id;
    private final String libelle;
    private final int niveau;
}

public class Cursus {
    private final long id;
    private final Date annee;
    private final String libelle;
    private List<Ecole> ecole;
}

public class Ecole {
    private final String nom;
    private final String ville;
}

public class Note {
    private final Personne evalue;
    private final double note;
}

public class Projet {
    private final long id;
    private final String libelle;
    private final String img;
    private Etat etat;
    private Etat recrutement;
    private WikiProjet wikiProjet;
    private WikiOfficiel wikiOfficiel;
}

public abstract class Wiki {
    private final long id;
    private final String contenu;
}

public class WikiProjet extends Wiki {
}

public class WikiOfficiel extends Wiki {
}

public abstract class Notification {
    private final long id;
    private final Date dateResolution;
}

public class Etat {
    private final String ENUM;
}

public class NotificationAjoutComp extends Notification {
    private final Competence competence;
    private final Personne demandeur;
}

public class NotificationDemandeParticipation extends Notification {
    private final Personne invite;
    private final Projet projet;
}

public class NotificationInvitationProjet extends Notification {
    private final Personne invite;
    private final Projet projet;
}