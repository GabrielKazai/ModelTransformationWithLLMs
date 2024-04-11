class Livre {
    private String editeur;
}

class Theme {
    String libelle;
    public int identifiant;
}

class Client {
    public boolean achete(Produit p) {
        return false;
    }
}

interface IAchat {
    boolean achat(Produit p);
}

class File {
    private Produit[] produitsAchetes;
    private Client client;
    protected Folder[] dossiersCibles;
    private static final float ClassifierId = -45.254f;
}

class Produit {
    private Theme[] themes;
    protected String nom;
    private static final String classifier = "";
}

class IAction {
}

class Facture {
    public void valorise(IAchat toto) {
    }

    public static int getId() {
        return 0;
    }
}

class Folder {
}