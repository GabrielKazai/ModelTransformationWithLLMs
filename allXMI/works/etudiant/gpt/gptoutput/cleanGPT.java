class Personne {
    private String nomPersonne;
    private String prenomPersonne;
}

class Universite {
    private Etudiant[] etudiants;
    private String nomUniversite;
}

class Etudiant extends Personne {
    private Universite universite;

    public void reviser(String matiere) {
    }
}