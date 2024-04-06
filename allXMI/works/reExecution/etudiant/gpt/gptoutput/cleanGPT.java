package bouml;

class Personne {
    private String nomPersonne;
    private String prenomPersonne;
}

class Etudiant extends Personne {
    private Universite[] universites;

    public void reviser(String matiere) {
    }
}

class Universite {
    private Etudiant[] etudiants;
    private String nomUniversite;
}