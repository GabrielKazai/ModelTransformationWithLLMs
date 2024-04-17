package test;abstract class Livre {    private String editeur;}package test;class Theme {    private Produit produit;    public String libelle;    public final int identifiant;}package test;class Client {    public boolean achete(Produit p) {        return false;    }}package test;interface IAchat {    boolean achat(Produit p);}package test;class File {    private Produit[] produitsAchetes;    private Client client;    protected Folder[] dossiersCibles;    private static final float ClassifierId = -45.254f;}package test;class Produit {    private Theme[] themes;    protected String nom;    private static final String classifier = "";}package test.Util;

class Facture {
    public void valorise(IAchat toto) {
    }

    public static int getId() {
        return 0;
    }
}
package test.Util;

class Folder {
}